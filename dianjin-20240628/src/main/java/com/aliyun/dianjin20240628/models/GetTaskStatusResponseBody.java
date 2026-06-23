// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    /**
     * <p>Execution time, in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>Response data. The current status of the task.</p>
     * <ul>
     * <li><p>invalid: Parameters or dependent resources are unavailable.</p>
     * </li>
     * <li><p>success: The task completed successfully.</p>
     * </li>
     * <li><p>evict: The task was canceled.</p>
     * </li>
     * <li><p>error: The task failed.</p>
     * </li>
     * <li><p>running: The task is running.</p>
     * </li>
     * <li><p>pending: The task is queued.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>Data type</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>30F6AD44-F078-540D-B5A5-1E519C8E9E6D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponseBody self = new GetTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetTaskStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetTaskStatusResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetTaskStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskStatusResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetTaskResultResponseBody extends TeaModel {
    /**
     * <p>The time consumed.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>The result of the asynchronous task.</p>
     * <h2>PDF translation task</h2>
     * <p>The returned file_url is a downloadable file address.</p>
     * <pre><code>{
     *   &quot;file_url&quot;: &quot;https://finllmworks.oss-cn-zhangjiakou.aliyuncs.com/render_pdf/5336180997111160501.pdf&quot;
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;file_url&quot;: &quot;<a href="https://finllmworks.oss-cn-zhangjiakou.aliyuncs.com/render_pdf/5336180997111160501.pdf">https://finllmworks.oss-cn-zhangjiakou.aliyuncs.com/render_pdf/5336180997111160501.pdf</a>&quot;
     * }</p>
     */
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D5D6BB5-BEAE-53C8-A70A-7275CC1F856C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static GetTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponseBody self = new GetTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetTaskResultResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetTaskResultResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetTaskResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskResultResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}

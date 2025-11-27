// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartTaskForDistributeImageResponseBody extends TeaModel {
    /**
     * <p>The error code if an error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the image replication task.</p>
     * 
     * <strong>example:</strong>
     * <p>tid-06xnr5lyp77e7****</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message if an error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>419F31B9-1FDF-5644-ABA3-D00026FA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the task is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartTaskForDistributeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTaskForDistributeImageResponseBody self = new StartTaskForDistributeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTaskForDistributeImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartTaskForDistributeImageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartTaskForDistributeImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartTaskForDistributeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartTaskForDistributeImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

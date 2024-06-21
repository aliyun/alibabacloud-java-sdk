// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 is success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>delete success.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Returns a hint message for the result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>771DC66C-C5E0-59BC-A983-DD18FEE9EFFA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGrafanaResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaResourceResponseBody self = new DeleteGrafanaResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteGrafanaResourceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteGrafanaResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteGrafanaResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

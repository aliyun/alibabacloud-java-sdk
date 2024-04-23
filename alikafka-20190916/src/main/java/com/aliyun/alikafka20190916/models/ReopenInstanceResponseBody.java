// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ReopenInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. If the request is successful, 200 is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReopenInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReopenInstanceResponseBody self = new ReopenInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReopenInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReopenInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReopenInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReopenInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

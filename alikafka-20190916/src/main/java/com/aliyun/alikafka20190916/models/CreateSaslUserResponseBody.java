// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateSaslUserResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSaslUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSaslUserResponseBody self = new CreateSaslUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSaslUserResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateSaslUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSaslUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSaslUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

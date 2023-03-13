// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateRoleResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleResponseBody self = new CreateRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

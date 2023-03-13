// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateRoleUsersResponseBody extends TeaModel {
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
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateRoleUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleUsersResponseBody self = new UpdateRoleUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRoleUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRoleUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRoleUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRoleUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

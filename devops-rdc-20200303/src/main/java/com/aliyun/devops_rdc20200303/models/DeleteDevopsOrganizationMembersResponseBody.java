// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsOrganizationMembersResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public Boolean object;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    public static DeleteDevopsOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsOrganizationMembersResponseBody self = new DeleteDevopsOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsOrganizationMembersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteDevopsOrganizationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDevopsOrganizationMembersResponseBody setObject(Boolean object) {
        this.object = object;
        return this;
    }
    public Boolean getObject() {
        return this.object;
    }

    public DeleteDevopsOrganizationMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteDevopsOrganizationMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}

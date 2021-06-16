// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertProjectMembersResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public Boolean object;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    public static InsertProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertProjectMembersResponseBody self = new InsertProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertProjectMembersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public InsertProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertProjectMembersResponseBody setObject(Boolean object) {
        this.object = object;
        return this;
    }
    public Boolean getObject() {
        return this.object;
    }

    public InsertProjectMembersResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public InsertProjectMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListCredentialsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<java.util.Map<String, ?>> object;

    public static ListCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResponseBody self = new ListCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCredentialsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCredentialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListCredentialsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCredentialsResponseBody setObject(java.util.List<java.util.Map<String, ?>> object) {
        this.object = object;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getObject() {
        return this.object;
    }

}

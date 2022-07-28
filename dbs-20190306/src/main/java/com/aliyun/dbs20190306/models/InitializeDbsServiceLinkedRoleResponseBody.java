// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class InitializeDbsServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static InitializeDbsServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeDbsServiceLinkedRoleResponseBody self = new InitializeDbsServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeDbsServiceLinkedRoleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeDbsServiceLinkedRoleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

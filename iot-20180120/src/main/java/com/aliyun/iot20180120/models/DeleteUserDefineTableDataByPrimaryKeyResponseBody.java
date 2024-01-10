// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteUserDefineTableDataByPrimaryKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteUserDefineTableDataByPrimaryKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineTableDataByPrimaryKeyResponseBody self = new DeleteUserDefineTableDataByPrimaryKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserDefineTableDataByPrimaryKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

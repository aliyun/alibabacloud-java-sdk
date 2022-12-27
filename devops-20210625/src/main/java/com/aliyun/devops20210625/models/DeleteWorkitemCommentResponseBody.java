// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemCommentResponseBody extends TeaModel {
    @NameInMap("deleteFlag")
    public Boolean deleteFlag;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static DeleteWorkitemCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemCommentResponseBody self = new DeleteWorkitemCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemCommentResponseBody setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    public DeleteWorkitemCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteWorkitemCommentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteWorkitemCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkitemCommentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

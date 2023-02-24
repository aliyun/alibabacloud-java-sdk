// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemAllCommentResponseBody extends TeaModel {
    @NameInMap("deleteFlag")
    public Boolean deleteFlag;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static DeleteWorkitemAllCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemAllCommentResponseBody self = new DeleteWorkitemAllCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemAllCommentResponseBody setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    public DeleteWorkitemAllCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteWorkitemAllCommentResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteWorkitemAllCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkitemAllCommentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

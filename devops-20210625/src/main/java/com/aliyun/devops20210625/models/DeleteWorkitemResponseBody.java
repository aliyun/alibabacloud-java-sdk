// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemResponseBody extends TeaModel {
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

    /**
     * <p>true/false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteWorkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemResponseBody self = new DeleteWorkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemResponseBody setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    public DeleteWorkitemResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteWorkitemResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteWorkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

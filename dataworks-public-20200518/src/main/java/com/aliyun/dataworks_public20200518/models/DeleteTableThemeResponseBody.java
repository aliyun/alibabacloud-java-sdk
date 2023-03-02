// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableThemeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the table folder is deleted.</p>
     */
    @NameInMap("DeleteResult")
    public Boolean deleteResult;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteTableThemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableThemeResponseBody self = new DeleteTableThemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTableThemeResponseBody setDeleteResult(Boolean deleteResult) {
        this.deleteResult = deleteResult;
        return this;
    }
    public Boolean getDeleteResult() {
        return this.deleteResult;
    }

    public DeleteTableThemeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteTableThemeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteTableThemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteTableThemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTableThemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

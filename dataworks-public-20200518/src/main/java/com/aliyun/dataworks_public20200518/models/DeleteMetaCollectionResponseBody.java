// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCollectionResponseBody extends TeaModel {
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
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the operation. Valid values:</p>
     * <br>
     * <p>true: succeeded</p>
     * <br>
     * <p>false: failed</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>true: The request was successful.</p>
     * <br>
     * <p>false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCollectionResponseBody self = new DeleteMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCollectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteMetaCollectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteMetaCollectionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetaCollectionResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DeleteMetaCollectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDocumentResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the document was deleted. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The deletion was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The deletion failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error code that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeBaseNotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not found kb-***</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique request ID. Use this ID to troubleshoot errors.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentResponseBody self = new DeleteDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteDocumentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteDocumentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

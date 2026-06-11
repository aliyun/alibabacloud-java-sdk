// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public OneMetaKnowledgeBase data;

    /**
     * <p>The error code returned on failure.</p>
     * 
     * <strong>example:</strong>
     * <p>KnowledgeBaseNotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned on failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not found kb-***</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
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

    public static UpdateKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeBaseResponseBody self = new UpdateKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeBaseResponseBody setData(OneMetaKnowledgeBase data) {
        this.data = data;
        return this;
    }
    public OneMetaKnowledgeBase getData() {
        return this.data;
    }

    public UpdateKnowledgeBaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateKnowledgeBaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

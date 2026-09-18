// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetDocumentResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The document details, including the processing status, number of chunks, and metadata.</p>
     */
    @NameInMap("Data")
    public KnowledgeBaseDocument data;

    /**
     * <p>The response message. A value of Operation success is returned if the call succeeds. A specific error description is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentResponseBody self = new GetDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentResponseBody setData(KnowledgeBaseDocument data) {
        this.data = data;
        return this;
    }
    public KnowledgeBaseDocument getData() {
        return this.data;
    }

    public GetDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response code. Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The knowledge base details, including basic information, metadata schema, and chunking and retrieval configurations.</p>
     */
    @NameInMap("Data")
    public KnowledgeBase data;

    /**
     * <p>The response message. Operation success is returned for a successful call. A specific error description is returned for a failed call.</p>
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

    public static GetKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseResponseBody self = new GetKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeBaseResponseBody setData(KnowledgeBase data) {
        this.data = data;
        return this;
    }
    public KnowledgeBase getData() {
        return this.data;
    }

    public GetKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

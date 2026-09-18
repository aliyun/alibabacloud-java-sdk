// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful operation. An error code is returned if the operation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the created knowledge base, including the name, status, and configuration information.</p>
     */
    @NameInMap("Data")
    public KnowledgeBase data;

    /**
     * <p>The response message. A value of Operation success is returned if the operation succeeds. A specific error description is returned if the operation fails.</p>
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
     * <p>Indicates whether the operation is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseResponseBody self = new CreateKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKnowledgeBaseResponseBody setData(KnowledgeBase data) {
        this.data = data;
        return this;
    }
    public KnowledgeBase getData() {
        return this.data;
    }

    public CreateKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

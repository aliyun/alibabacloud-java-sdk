// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call is successful. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The updated details of the knowledge base.</p>
     */
    @NameInMap("Data")
    public KnowledgeBase data;

    /**
     * <p>The response message. If the call is successful, the value is Operation success. If the call fails, a specific error description is returned.</p>
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
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful.</p>
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

    public UpdateKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateKnowledgeBaseResponseBody setData(KnowledgeBase data) {
        this.data = data;
        return this;
    }
    public KnowledgeBase getData() {
        return this.data;
    }

    public UpdateKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

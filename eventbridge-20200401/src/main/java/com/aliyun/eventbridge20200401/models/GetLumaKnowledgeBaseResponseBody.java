// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response code returned by the operation. A value of Success indicates a successful call. Otherwise, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the knowledge base bound to the Agent.</p>
     */
    @NameInMap("Data")
    public KnowledgeBase data;

    /**
     * <p>The message returned by the operation. The value is Operation success when the call succeeds, or a specific error description when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
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

    public static GetLumaKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLumaKnowledgeBaseResponseBody self = new GetLumaKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLumaKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLumaKnowledgeBaseResponseBody setData(KnowledgeBase data) {
        this.data = data;
        return this;
    }
    public KnowledgeBase getData() {
        return this.data;
    }

    public GetLumaKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLumaKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLumaKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

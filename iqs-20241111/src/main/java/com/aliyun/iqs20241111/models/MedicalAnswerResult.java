// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerResult extends TeaModel {
    /**
     * <p>The list of medical Q&amp;A answers. An empty array is returned if the question is empty or no content is matched.</p>
     */
    @NameInMap("messages")
    public java.util.List<MedicalAnswerMessage> messages;

    /**
     * <p>The query context information, such as the original query content.</p>
     */
    @NameInMap("queryContext")
    public MultimodalQueryContext queryContext;

    /**
     * <p>The ID of the request. You can provide this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>35E5608A-A737-2038-AFB6-D9D34C6BFD9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The search information, such as the execution duration.</p>
     */
    @NameInMap("searchInformation")
    public UnifiedSearchInformation searchInformation;

    public static MedicalAnswerResult build(java.util.Map<String, ?> map) throws Exception {
        MedicalAnswerResult self = new MedicalAnswerResult();
        return TeaModel.build(map, self);
    }

    public MedicalAnswerResult setMessages(java.util.List<MedicalAnswerMessage> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<MedicalAnswerMessage> getMessages() {
        return this.messages;
    }

    public MedicalAnswerResult setQueryContext(MultimodalQueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public MultimodalQueryContext getQueryContext() {
        return this.queryContext;
    }

    public MedicalAnswerResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MedicalAnswerResult setSearchInformation(UnifiedSearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}

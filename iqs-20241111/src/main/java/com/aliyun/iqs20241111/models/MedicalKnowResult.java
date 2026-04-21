// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalKnowResult extends TeaModel {
    @NameInMap("messages")
    public java.util.List<MedicalKnowledgeInfo> messages;

    @NameInMap("queryContext")
    public MultimodalQueryContext queryContext;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("searchInformation")
    public UnifiedSearchInformation searchInformation;

    public static MedicalKnowResult build(java.util.Map<String, ?> map) throws Exception {
        MedicalKnowResult self = new MedicalKnowResult();
        return TeaModel.build(map, self);
    }

    public MedicalKnowResult setMessages(java.util.List<MedicalKnowledgeInfo> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<MedicalKnowledgeInfo> getMessages() {
        return this.messages;
    }

    public MedicalKnowResult setQueryContext(MultimodalQueryContext queryContext) {
        this.queryContext = queryContext;
        return this;
    }
    public MultimodalQueryContext getQueryContext() {
        return this.queryContext;
    }

    public MedicalKnowResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MedicalKnowResult setSearchInformation(UnifiedSearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}

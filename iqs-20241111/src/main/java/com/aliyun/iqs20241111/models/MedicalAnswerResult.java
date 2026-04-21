// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerResult extends TeaModel {
    @NameInMap("messages")
    public java.util.List<MedicalAnswerMessage> messages;

    @NameInMap("queryContext")
    public MultimodalQueryContext queryContext;

    @NameInMap("requestId")
    public String requestId;

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

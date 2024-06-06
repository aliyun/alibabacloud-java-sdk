// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SendDocumentAskQuestionResponseBody extends TeaModel {
    @NameInMap("data")
    public SendDocumentAskQuestionResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static SendDocumentAskQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendDocumentAskQuestionResponseBody self = new SendDocumentAskQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public SendDocumentAskQuestionResponseBody setData(SendDocumentAskQuestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendDocumentAskQuestionResponseBodyData getData() {
        return this.data;
    }

    public SendDocumentAskQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SendDocumentAskQuestionResponseBodyData extends TeaModel {
        @NameInMap("answer")
        public String answer;

        @NameInMap("document")
        public java.util.List<String> document;

        public static SendDocumentAskQuestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendDocumentAskQuestionResponseBodyData self = new SendDocumentAskQuestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendDocumentAskQuestionResponseBodyData setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public SendDocumentAskQuestionResponseBodyData setDocument(java.util.List<String> document) {
            this.document = document;
            return this;
        }
        public java.util.List<String> getDocument() {
            return this.document;
        }

    }

}

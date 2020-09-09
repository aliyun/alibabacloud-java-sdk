// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TranslateMedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public TranslateMedResponseData data;

    public static TranslateMedResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateMedResponse self = new TranslateMedResponse();
        return TeaModel.build(map, self);
    }

    public TranslateMedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TranslateMedResponse setData(TranslateMedResponseData data) {
        this.data = data;
        return this;
    }
    public TranslateMedResponseData getData() {
        return this.data;
    }

    public static class TranslateMedResponseData extends TeaModel {
        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("Words")
        @Validation(required = true)
        public Long words;

        public static TranslateMedResponseData build(java.util.Map<String, ?> map) throws Exception {
            TranslateMedResponseData self = new TranslateMedResponseData();
            return TeaModel.build(map, self);
        }

        public TranslateMedResponseData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public TranslateMedResponseData setWords(Long words) {
            this.words = words;
            return this;
        }
        public Long getWords() {
            return this.words;
        }

    }

}

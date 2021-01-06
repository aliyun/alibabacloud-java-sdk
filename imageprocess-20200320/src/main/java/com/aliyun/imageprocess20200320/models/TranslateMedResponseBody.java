// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TranslateMedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TranslateMedResponseBodyData data;

    public static TranslateMedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateMedResponseBody self = new TranslateMedResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateMedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TranslateMedResponseBody setData(TranslateMedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateMedResponseBodyData getData() {
        return this.data;
    }

    public static class TranslateMedResponseBodyData extends TeaModel {
        @NameInMap("Words")
        public Long words;

        @NameInMap("Text")
        public String text;

        public static TranslateMedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateMedResponseBodyData self = new TranslateMedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateMedResponseBodyData setWords(Long words) {
            this.words = words;
            return this;
        }
        public Long getWords() {
            return this.words;
        }

        public TranslateMedResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}

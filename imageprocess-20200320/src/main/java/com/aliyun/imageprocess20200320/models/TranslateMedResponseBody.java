// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TranslateMedResponseBody extends TeaModel {
    @NameInMap("Data")
    public TranslateMedResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static TranslateMedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateMedResponseBody self = new TranslateMedResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateMedResponseBody setData(TranslateMedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateMedResponseBodyData getData() {
        return this.data;
    }

    public TranslateMedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TranslateMedResponseBodyData extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Words")
        public Long words;

        public static TranslateMedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateMedResponseBodyData self = new TranslateMedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateMedResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public TranslateMedResponseBodyData setWords(Long words) {
            this.words = words;
            return this;
        }
        public Long getWords() {
            return this.words;
        }

    }

}

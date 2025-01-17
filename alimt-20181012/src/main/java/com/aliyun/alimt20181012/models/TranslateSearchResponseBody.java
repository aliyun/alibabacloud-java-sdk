// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateSearchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TranslateSearchResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TranslateSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateSearchResponseBody self = new TranslateSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TranslateSearchResponseBody setData(TranslateSearchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateSearchResponseBodyData getData() {
        return this.data;
    }

    public TranslateSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TranslateSearchResponseBodyData extends TeaModel {
        @NameInMap("Translated")
        public String translated;

        public static TranslateSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateSearchResponseBodyData self = new TranslateSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateSearchResponseBodyData setTranslated(String translated) {
            this.translated = translated;
            return this;
        }
        public String getTranslated() {
            return this.translated;
        }

    }

}

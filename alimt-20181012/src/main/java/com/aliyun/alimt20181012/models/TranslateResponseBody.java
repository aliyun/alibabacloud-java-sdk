// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TranslateResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static TranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateResponseBody self = new TranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TranslateResponseBody setData(TranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateResponseBodyData getData() {
        return this.data;
    }

    public TranslateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetImageTranslateResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Orc")
        public String orc;

        @NameInMap("PictureEditor")
        public String pictureEditor;

        public static GetImageTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateResponseBodyData self = new GetImageTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetImageTranslateResponseBodyData setOrc(String orc) {
            this.orc = orc;
            return this;
        }
        public String getOrc() {
            return this.orc;
        }

        public GetImageTranslateResponseBodyData setPictureEditor(String pictureEditor) {
            this.pictureEditor = pictureEditor;
            return this;
        }
        public String getPictureEditor() {
            return this.pictureEditor;
        }

    }

    public static class TranslateResponseBodyData extends TeaModel {
        @NameInMap("WordCount")
        public String wordCount;

        @NameInMap("Translated")
        public String translated;

        public static TranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateResponseBodyData self = new TranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateResponseBodyData setWordCount(String wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public String getWordCount() {
            return this.wordCount;
        }

        public TranslateResponseBodyData setTranslated(String translated) {
            this.translated = translated;
            return this;
        }
        public String getTranslated() {
            return this.translated;
        }

    }

}

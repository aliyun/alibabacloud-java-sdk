// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetImageTranslateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A41F6E25-8520-4AF0-90EF-AF7E32840108</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetImageTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateResponseBody self = new GetImageTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetImageTranslateResponseBody setData(GetImageTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageTranslateResponseBodyData getData() {
        return this.data;
    }

    public GetImageTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageTranslateResponseBodyData extends TeaModel {
        @NameInMap("Orc")
        public String orc;

        @NameInMap("PictureEditor")
        public String pictureEditor;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/xxxxx.jpeg">https://ae01.alicdn.com/kf/xxxxx.jpeg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetImageTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateResponseBodyData self = new GetImageTranslateResponseBodyData();
            return TeaModel.build(map, self);
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

        public GetImageTranslateResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

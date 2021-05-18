// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetImageTranslateResponseBodyData data;

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

    public GetImageTranslateResponseBody setData(GetImageTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageTranslateResponseBodyData getData() {
        return this.data;
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

}

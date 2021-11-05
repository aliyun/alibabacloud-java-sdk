// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TranslateImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TranslateImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateImageResponseBody self = new TranslateImageResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TranslateImageResponseBody setData(TranslateImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateImageResponseBodyData getData() {
        return this.data;
    }

    public TranslateImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TranslateImageResponseBodyData extends TeaModel {
        @NameInMap("FinalImageUrl")
        public String finalImageUrl;

        public static TranslateImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateImageResponseBodyData self = new TranslateImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateImageResponseBodyData setFinalImageUrl(String finalImageUrl) {
            this.finalImageUrl = finalImageUrl;
            return this;
        }
        public String getFinalImageUrl() {
            return this.finalImageUrl;
        }

    }

}

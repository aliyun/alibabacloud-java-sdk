// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetImageTranslateTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetImageTranslateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateTaskResponseBody self = new GetImageTranslateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetImageTranslateTaskResponseBody setData(GetImageTranslateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageTranslateTaskResponseBodyData getData() {
        return this.data;
    }

    public GetImageTranslateTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageTranslateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageTranslateTaskResponseBodyData extends TeaModel {
        @NameInMap("ImageData")
        public String imageData;

        public static GetImageTranslateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageTranslateTaskResponseBodyData self = new GetImageTranslateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageTranslateTaskResponseBodyData setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

    }

}

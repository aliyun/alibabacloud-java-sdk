// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateImageWithTextResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateImageWithTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextResponseBody self = new GenerateImageWithTextResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextResponseBody setData(GenerateImageWithTextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateImageWithTextResponseBodyData getData() {
        return this.data;
    }

    public GenerateImageWithTextResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateImageWithTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateImageWithTextResponseBodyData extends TeaModel {
        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        public static GenerateImageWithTextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateImageWithTextResponseBodyData self = new GenerateImageWithTextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateImageWithTextResponseBodyData setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateImageWithTextAndImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateImageWithTextAndImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateImageWithTextAndImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageWithTextAndImageResponseBody self = new GenerateImageWithTextAndImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateImageWithTextAndImageResponseBody setData(GenerateImageWithTextAndImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateImageWithTextAndImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateImageWithTextAndImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateImageWithTextAndImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateImageWithTextAndImageResponseBodyData extends TeaModel {
        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        public static GenerateImageWithTextAndImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateImageWithTextAndImageResponseBodyData self = new GenerateImageWithTextAndImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateImageWithTextAndImageResponseBodyData setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

    }

}

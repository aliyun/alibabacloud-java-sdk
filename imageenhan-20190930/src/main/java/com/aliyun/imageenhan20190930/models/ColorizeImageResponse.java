// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ColorizeImageResponseData data;

    public static ColorizeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ColorizeImageResponse self = new ColorizeImageResponse();
        return TeaModel.build(map, self);
    }

    public ColorizeImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ColorizeImageResponse setData(ColorizeImageResponseData data) {
        this.data = data;
        return this;
    }
    public ColorizeImageResponseData getData() {
        return this.data;
    }

    public static class ColorizeImageResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static ColorizeImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            ColorizeImageResponseData self = new ColorizeImageResponseData();
            return TeaModel.build(map, self);
        }

        public ColorizeImageResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

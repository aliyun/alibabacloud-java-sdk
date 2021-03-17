// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ColorizeImageResponseBodyData data;

    public static ColorizeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ColorizeImageResponseBody self = new ColorizeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ColorizeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ColorizeImageResponseBody setData(ColorizeImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ColorizeImageResponseBodyData getData() {
        return this.data;
    }

    public static class ColorizeImageResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static ColorizeImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ColorizeImageResponseBodyData self = new ColorizeImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ColorizeImageResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

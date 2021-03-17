// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RemoveImageWatermarkResponseBodyData data;

    public static RemoveImageWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageWatermarkResponseBody self = new RemoveImageWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveImageWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveImageWatermarkResponseBody setData(RemoveImageWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveImageWatermarkResponseBodyData getData() {
        return this.data;
    }

    public static class RemoveImageWatermarkResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static RemoveImageWatermarkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveImageWatermarkResponseBodyData self = new RemoveImageWatermarkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveImageWatermarkResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

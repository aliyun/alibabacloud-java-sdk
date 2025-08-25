// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkResponseBody extends TeaModel {
    @NameInMap("Data")
    public RemoveImageWatermarkResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>885070A7-E721-4062-99A0-80C0EBBF9406</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveImageWatermarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageWatermarkResponseBody self = new RemoveImageWatermarkResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveImageWatermarkResponseBody setData(RemoveImageWatermarkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveImageWatermarkResponseBodyData getData() {
        return this.data;
    }

    public RemoveImageWatermarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveImageWatermarkResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/image-delogo/2020-03-27-03/00%3A06-5a6f0a0f-c940-4955-af75-79e8267f1699.jpg?Expires=1585279806&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=R4OC2R5%2Fkw08XYFXmCWjgk7Y9N">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/image-delogo/2020-03-27-03/00%3A06-5a6f0a0f-c940-4955-af75-79e8267f1699.jpg?Expires=1585279806&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=R4OC2R5%2Fkw08XYFXmCWjgk7Y9N</a>****</p>
         */
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

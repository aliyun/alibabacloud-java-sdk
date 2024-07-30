// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentFoodResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>38265D08-AD0F-4752-8E96-D1D9FB96C3D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentFoodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentFoodResponseBody self = new SegmentFoodResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentFoodResponseBody setData(SegmentFoodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentFoodResponseBodyData getData() {
        return this.data;
    }

    public SegmentFoodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentFoodResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/foodsegmenter-2020-06-17-15-24-00-8658fc85b8-8ds8k/2020-6-18/invi__015924442076191000002_WqJ99N.png?Expires=1592446007&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=5ITSd6ndSuP7pUfoDFpgLPUOGg">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/foodsegmenter-2020-06-17-15-24-00-8658fc85b8-8ds8k/2020-6-18/invi__015924442076191000002_WqJ99N.png?Expires=1592446007&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=5ITSd6ndSuP7pUfoDFpgLPUOGg</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentFoodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFoodResponseBodyData self = new SegmentFoodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentFoodResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

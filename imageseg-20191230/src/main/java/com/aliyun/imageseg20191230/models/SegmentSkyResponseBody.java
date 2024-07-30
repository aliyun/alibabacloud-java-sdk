// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentSkyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>80E9D0A0-0330-4210-9986-CAC50C922FF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentSkyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyResponseBody self = new SegmentSkyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentSkyResponseBody setData(SegmentSkyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentSkyResponseBodyData getData() {
        return this.data;
    }

    public SegmentSkyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentSkyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/skysegmentation-2020-05-18-10-44-16-5bc8dc79f9-92b7z/2020-5-18/invi_skySegmentator_015897703560961000003_SqZLDv.png?Expires=1589772156&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=gXrzAUl%2BvIdYbQ9XKdho54MlkX">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/skysegmentation-2020-05-18-10-44-16-5bc8dc79f9-92b7z/2020-5-18/invi_skySegmentator_015897703560961000003_SqZLDv.png?Expires=1589772156&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=gXrzAUl%2BvIdYbQ9XKdho54MlkX</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentSkyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSkyResponseBodyData self = new SegmentSkyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentSkyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

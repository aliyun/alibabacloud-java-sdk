// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentSceneResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>78EC13BB-74C5-4FBE-916E-C98BD721ED61</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneResponseBody self = new SegmentSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentSceneResponseBody setData(SegmentSceneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentSceneResponseBodyData getData() {
        return this.data;
    }

    public SegmentSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentSceneResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_skySegmentator/2020-7-24/invi_skySegmentator_015955807385661000002_WqJ99N.jpg?Expires=1595582538&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=sBP5bQCErDolM4QQG5%2B0HozNoO">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_skySegmentator/2020-7-24/invi_skySegmentator_015955807385661000002_WqJ99N.jpg?Expires=1595582538&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=sBP5bQCErDolM4QQG5%2B0HozNoO</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentSceneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSceneResponseBodyData self = new SegmentSceneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentSceneResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

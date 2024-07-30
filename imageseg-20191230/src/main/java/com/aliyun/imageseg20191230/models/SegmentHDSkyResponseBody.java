// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentHDSkyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1173F38F-B4F4-4A07-AB2E-D490C01347E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentHDSkyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyResponseBody self = new SegmentHDSkyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyResponseBody setData(SegmentHDSkyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHDSkyResponseBodyData getData() {
        return this.data;
    }

    public SegmentHDSkyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentHDSkyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/sky-segmentation-hd/res/1173F38F-B4F4-4A07-AB2E-D490C01347E5_0d56_20201027-061858.jpg?Expires=1603781339&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=2F8%2Bj%2FWruWOMqDezwpnJOkcNJD">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/sky-segmentation-hd/res/1173F38F-B4F4-4A07-AB2E-D490C01347E5_0d56_20201027-061858.jpg?Expires=1603781339&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=2F8%2Bj%2FWruWOMqDezwpnJOkcNJD</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentHDSkyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDSkyResponseBodyData self = new SegmentHDSkyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHDSkyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

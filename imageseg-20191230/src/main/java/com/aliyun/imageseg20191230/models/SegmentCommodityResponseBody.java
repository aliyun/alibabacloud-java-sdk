// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommodityResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentCommodityResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D6C24839-91A7-41DA-B31F-98F08EF80CC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityResponseBody self = new SegmentCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentCommodityResponseBody setData(SegmentCommodityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentCommodityResponseBodyData getData() {
        return this.data;
    }

    public SegmentCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentCommodityResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://luban-vgd-invi.oss-cn-hangzhou.aliyuncs.com/upload/result_segmenter/2019-12-20/invi_segmenter_015768355410261076021_Z3t0fc.png?Expires=1577094741&OSSAccessKeyId=LTAI4Fc5SVvzUQ19K1Cz****&Signature=pkaKK3VlfsTR2r%2BYycJzTVEEos">http://luban-vgd-invi.oss-cn-hangzhou.aliyuncs.com/upload/result_segmenter/2019-12-20/invi_segmenter_015768355410261076021_Z3t0fc.png?Expires=1577094741&amp;OSSAccessKeyId=LTAI4Fc5SVvzUQ19K1Cz****&amp;Signature=pkaKK3VlfsTR2r%2BYycJzTVEEos</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentCommodityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentCommodityResponseBodyData self = new SegmentCommodityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentCommodityResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

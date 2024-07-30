// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommonImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentCommonImageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1B8BEF02-0672-44CA-A974-4D6FAC392497</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentCommonImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommonImageResponseBody self = new SegmentCommonImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentCommonImageResponseBody setData(SegmentCommonImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentCommonImageResponseBodyData getData() {
        return this.data;
    }

    public SegmentCommonImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentCommonImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://luban-vgd-invi.oss-cn-hangzhou.aliyuncs.com/upload/result_segmenter/2019-12-20/invi_segmenter_015768355410261076021_Z3t0fc.png?Expires=1577094741&OSSAccessKeyId=LTAI4Fc5SVvzUQ19K1Cz****&Signature=pkaKK3VlfsTR2r%2BYycJzTVEEos">http://luban-vgd-invi.oss-cn-hangzhou.aliyuncs.com/upload/result_segmenter/2019-12-20/invi_segmenter_015768355410261076021_Z3t0fc.png?Expires=1577094741&amp;OSSAccessKeyId=LTAI4Fc5SVvzUQ19K1Cz****&amp;Signature=pkaKK3VlfsTR2r%2BYycJzTVEEos</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentCommonImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentCommonImageResponseBodyData self = new SegmentCommonImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentCommonImageResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

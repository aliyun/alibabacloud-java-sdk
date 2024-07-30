// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDCommonImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentHDCommonImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EC994171-7964-44B3-85AF-A715CB56747D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentHDCommonImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDCommonImageResponseBody self = new SegmentHDCommonImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHDCommonImageResponseBody setData(SegmentHDCommonImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHDCommonImageResponseBodyData getData() {
        return this.data;
    }

    public SegmentHDCommonImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentHDCommonImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentHDCommonImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_commoditysegmenter/2020-10-27/invi_commoditysegmenter_016037842193171000000_5pn2QM.png?Expires=1603786019&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=HwUztguGBYXmXGEmuTh%2FL3ztoh">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_commoditysegmenter/2020-10-27/invi_commoditysegmenter_016037842193171000000_5pn2QM.png?Expires=1603786019&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=HwUztguGBYXmXGEmuTh%2FL3ztoh</a>****</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static SegmentHDCommonImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDCommonImageResponseBodyData self = new SegmentHDCommonImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHDCommonImageResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}

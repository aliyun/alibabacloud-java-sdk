// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentBodyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>30EDCEEA-2806-44C6-AF0B-0988849106FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyResponseBody self = new SegmentBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentBodyResponseBody setData(SegmentBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentBodyResponseBodyData getData() {
        return this.data;
    }

    public SegmentBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentBodyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_humansegmenter/2021-3-31/invi_humansegmenter_016171823500001081370_Ej0WwO.jpg?Expires=1617184150&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=ZwaWXpAOMzHar%2B1wVO7zeSD83r">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_humansegmenter/2021-3-31/invi_humansegmenter_016171823500001081370_Ej0WwO.jpg?Expires=1617184150&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=ZwaWXpAOMzHar%2B1wVO7zeSD83r</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentBodyResponseBodyData self = new SegmentBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentBodyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

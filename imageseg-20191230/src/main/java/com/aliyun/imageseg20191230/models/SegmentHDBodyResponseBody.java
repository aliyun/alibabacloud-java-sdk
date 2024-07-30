// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentHDBodyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>A8D3F5C3-E414-4981-8D84-E2CADF0B7CBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentHDBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyResponseBody self = new SegmentHDBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHDBodyResponseBody setData(SegmentHDBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHDBodyResponseBodyData getData() {
        return this.data;
    }

    public SegmentHDBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentHDBodyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/segmenthdbody-2020-05-18-16-27-45-675d9884d7-kd9dz/2020-5-18/invi_humansegmenter_015897914589851000001_wQbLq9.png?Expires=1589793259&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=Lx6xSS0t7lqEvy5Qd1keccIAjL">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/segmenthdbody-2020-05-18-16-27-45-675d9884d7-kd9dz/2020-5-18/invi_humansegmenter_015897914589851000001_wQbLq9.png?Expires=1589793259&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=Lx6xSS0t7lqEvy5Qd1keccIAjL</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentHDBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDBodyResponseBodyData self = new SegmentHDBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHDBodyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

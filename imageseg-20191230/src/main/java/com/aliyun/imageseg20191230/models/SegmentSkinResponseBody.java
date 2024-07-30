// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentSkinResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DA007354-6CF5-45BE-8333-E06318D848C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentSkinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkinResponseBody self = new SegmentSkinResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentSkinResponseBody setData(SegmentSkinResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentSkinResponseBodyData getData() {
        return this.data;
    }

    public SegmentSkinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentSkinResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_skinsegmenter/2020-9-27/invi_skinsegmenter_016011971641871000001_wQbLq9.jpg?Expires=1601198964&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=xjKc%2BScprmB86cxtI%2B1T0R6TlE">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_skinsegmenter/2020-9-27/invi_skinsegmenter_016011971641871000001_wQbLq9.jpg?Expires=1601198964&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=xjKc%2BScprmB86cxtI%2B1T0R6TlE</a>****</p>
         */
        @NameInMap("URL")
        public String URL;

        public static SegmentSkinResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSkinResponseBodyData self = new SegmentSkinResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentSkinResponseBodyData setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}

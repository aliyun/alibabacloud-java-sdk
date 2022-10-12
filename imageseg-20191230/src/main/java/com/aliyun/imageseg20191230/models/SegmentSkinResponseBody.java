// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentSkinResponseBodyData data;

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

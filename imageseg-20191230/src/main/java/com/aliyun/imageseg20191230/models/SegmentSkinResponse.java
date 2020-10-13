// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentSkinResponseData data;

    public static SegmentSkinResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkinResponse self = new SegmentSkinResponse();
        return TeaModel.build(map, self);
    }

    public SegmentSkinResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentSkinResponse setData(SegmentSkinResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentSkinResponseData getData() {
        return this.data;
    }

    public static class SegmentSkinResponseData extends TeaModel {
        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static SegmentSkinResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSkinResponseData self = new SegmentSkinResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentSkinResponseData setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}

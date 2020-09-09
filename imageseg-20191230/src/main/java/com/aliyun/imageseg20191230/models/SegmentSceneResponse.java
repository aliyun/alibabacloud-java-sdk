// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentSceneResponseData data;

    public static SegmentSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneResponse self = new SegmentSceneResponse();
        return TeaModel.build(map, self);
    }

    public SegmentSceneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentSceneResponse setData(SegmentSceneResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentSceneResponseData getData() {
        return this.data;
    }

    public static class SegmentSceneResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentSceneResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSceneResponseData self = new SegmentSceneResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentSceneResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

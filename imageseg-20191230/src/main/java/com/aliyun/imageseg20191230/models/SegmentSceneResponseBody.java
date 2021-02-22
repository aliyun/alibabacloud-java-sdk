// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentSceneResponseBodyData data;

    public static SegmentSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneResponseBody self = new SegmentSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentSceneResponseBody setData(SegmentSceneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentSceneResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentSceneResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentSceneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSceneResponseBodyData self = new SegmentSceneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentSceneResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

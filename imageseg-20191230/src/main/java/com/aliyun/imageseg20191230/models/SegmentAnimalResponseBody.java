// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentAnimalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentAnimalResponseBodyData data;

    public static SegmentAnimalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentAnimalResponseBody self = new SegmentAnimalResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentAnimalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentAnimalResponseBody setData(SegmentAnimalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentAnimalResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentAnimalResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentAnimalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentAnimalResponseBodyData self = new SegmentAnimalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentAnimalResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}

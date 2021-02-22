// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentFurnitureResponseBodyData data;

    public static SegmentFurnitureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureResponseBody self = new SegmentFurnitureResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentFurnitureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentFurnitureResponseBody setData(SegmentFurnitureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentFurnitureResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentFurnitureResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentFurnitureResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentFurnitureResponseBodyDataElements self = new SegmentFurnitureResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentFurnitureResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class SegmentFurnitureResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentFurnitureResponseBodyDataElements> elements;

        public static SegmentFurnitureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFurnitureResponseBodyData self = new SegmentFurnitureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentFurnitureResponseBodyData setElements(java.util.List<SegmentFurnitureResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentFurnitureResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}

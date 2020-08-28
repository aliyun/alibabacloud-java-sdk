// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentFurnitureResponseData data;

    public static SegmentFurnitureResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureResponse self = new SegmentFurnitureResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentFurnitureResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentFurnitureResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentFurnitureResponseDataElements self = new SegmentFurnitureResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class SegmentFurnitureResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentFurnitureResponseDataElements> elements;

        public static SegmentFurnitureResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFurnitureResponseData self = new SegmentFurnitureResponseData();
            return TeaModel.build(map, self);
        }

    }

}

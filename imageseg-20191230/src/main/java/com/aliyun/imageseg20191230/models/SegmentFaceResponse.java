// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentFaceResponseData data;

    public static SegmentFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFaceResponse self = new SegmentFaceResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentFaceResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("X")
        @Validation(required = true)
        public Integer x;

        @NameInMap("Y")
        @Validation(required = true)
        public Integer y;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static SegmentFaceResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentFaceResponseDataElements self = new SegmentFaceResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class SegmentFaceResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentFaceResponseDataElements> elements;

        public static SegmentFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFaceResponseData self = new SegmentFaceResponseData();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHairResponseData data;

    public static SegmentHairResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairResponse self = new SegmentHairResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentHairResponseDataElements extends TeaModel {
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

        public static SegmentHairResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseDataElements self = new SegmentHairResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class SegmentHairResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentHairResponseDataElements> elements;

        public static SegmentHairResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseData self = new SegmentHairResponseData();
            return TeaModel.build(map, self);
        }

    }

}

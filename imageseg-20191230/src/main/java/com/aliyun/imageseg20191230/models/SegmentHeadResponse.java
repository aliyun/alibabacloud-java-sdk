// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHeadResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHeadResponseData data;

    public static SegmentHeadResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHeadResponse self = new SegmentHeadResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentHeadResponseDataElements extends TeaModel {
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

        public static SegmentHeadResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentHeadResponseDataElements self = new SegmentHeadResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class SegmentHeadResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentHeadResponseDataElements> elements;

        public static SegmentHeadResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHeadResponseData self = new SegmentHeadResponseData();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentClothResponseData data;

    public static SegmentClothResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothResponse self = new SegmentClothResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentClothResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentClothResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentClothResponseDataElements self = new SegmentClothResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class SegmentClothResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentClothResponseDataElements> elements;

        public static SegmentClothResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentClothResponseData self = new SegmentClothResponseData();
            return TeaModel.build(map, self);
        }

    }

}

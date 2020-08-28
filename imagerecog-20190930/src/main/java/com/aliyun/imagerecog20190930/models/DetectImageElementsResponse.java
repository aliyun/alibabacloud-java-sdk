// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectImageElementsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectImageElementsResponseData data;

    public static DetectImageElementsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageElementsResponse self = new DetectImageElementsResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectImageElementsResponseDataElements extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

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

        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        public static DetectImageElementsResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectImageElementsResponseDataElements self = new DetectImageElementsResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectImageElementsResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectImageElementsResponseDataElements> elements;

        public static DetectImageElementsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectImageElementsResponseData self = new DetectImageElementsResponseData();
            return TeaModel.build(map, self);
        }

    }

}

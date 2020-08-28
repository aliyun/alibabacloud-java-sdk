// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectFruitsResponseData data;

    public static DetectFruitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsResponse self = new DetectFruitsResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectFruitsResponseDataElements extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("Box")
        @Validation(required = true)
        public java.util.List<Double> box;

        public static DetectFruitsResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseDataElements self = new DetectFruitsResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectFruitsResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectFruitsResponseDataElements> elements;

        public static DetectFruitsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectFruitsResponseData self = new DetectFruitsResponseData();
            return TeaModel.build(map, self);
        }

    }

}

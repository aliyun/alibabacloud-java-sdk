// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class IntelligentCompositionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public IntelligentCompositionResponseData data;

    public static IntelligentCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        IntelligentCompositionResponse self = new IntelligentCompositionResponse();
        return TeaModel.build(map, self);
    }

    public static class IntelligentCompositionResponseDataElements extends TeaModel {
        @NameInMap("MinX")
        @Validation(required = true)
        public Integer minX;

        @NameInMap("MinY")
        @Validation(required = true)
        public Integer minY;

        @NameInMap("MaxX")
        @Validation(required = true)
        public Integer maxX;

        @NameInMap("MaxY")
        @Validation(required = true)
        public Integer maxY;

        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        public static IntelligentCompositionResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            IntelligentCompositionResponseDataElements self = new IntelligentCompositionResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class IntelligentCompositionResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<IntelligentCompositionResponseDataElements> elements;

        public static IntelligentCompositionResponseData build(java.util.Map<String, ?> map) throws Exception {
            IntelligentCompositionResponseData self = new IntelligentCompositionResponseData();
            return TeaModel.build(map, self);
        }

    }

}

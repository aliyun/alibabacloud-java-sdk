// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class ClassifyingRubbishResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ClassifyingRubbishResponseData data;

    public static ClassifyingRubbishResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyingRubbishResponse self = new ClassifyingRubbishResponse();
        return TeaModel.build(map, self);
    }

    public static class ClassifyingRubbishResponseDataElements extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("CategoryScore")
        @Validation(required = true)
        public Double categoryScore;

        @NameInMap("Rubbish")
        @Validation(required = true)
        public String rubbish;

        @NameInMap("RubbishScore")
        @Validation(required = true)
        public Double rubbishScore;

        public static ClassifyingRubbishResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            ClassifyingRubbishResponseDataElements self = new ClassifyingRubbishResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class ClassifyingRubbishResponseData extends TeaModel {
        @NameInMap("Sensitive")
        @Validation(required = true)
        public Boolean sensitive;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<ClassifyingRubbishResponseDataElements> elements;

        public static ClassifyingRubbishResponseData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyingRubbishResponseData self = new ClassifyingRubbishResponseData();
            return TeaModel.build(map, self);
        }

    }

}

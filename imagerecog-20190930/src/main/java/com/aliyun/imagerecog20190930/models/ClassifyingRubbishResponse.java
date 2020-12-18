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

    public ClassifyingRubbishResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClassifyingRubbishResponse setData(ClassifyingRubbishResponseData data) {
        this.data = data;
        return this;
    }
    public ClassifyingRubbishResponseData getData() {
        return this.data;
    }

    public static class ClassifyingRubbishResponseDataElements extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("CategoryScore")
        @Validation(required = true)
        public Float categoryScore;

        @NameInMap("Rubbish")
        @Validation(required = true)
        public String rubbish;

        @NameInMap("RubbishScore")
        @Validation(required = true)
        public Float rubbishScore;

        public static ClassifyingRubbishResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            ClassifyingRubbishResponseDataElements self = new ClassifyingRubbishResponseDataElements();
            return TeaModel.build(map, self);
        }

        public ClassifyingRubbishResponseDataElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ClassifyingRubbishResponseDataElements setCategoryScore(Float categoryScore) {
            this.categoryScore = categoryScore;
            return this;
        }
        public Float getCategoryScore() {
            return this.categoryScore;
        }

        public ClassifyingRubbishResponseDataElements setRubbish(String rubbish) {
            this.rubbish = rubbish;
            return this;
        }
        public String getRubbish() {
            return this.rubbish;
        }

        public ClassifyingRubbishResponseDataElements setRubbishScore(Float rubbishScore) {
            this.rubbishScore = rubbishScore;
            return this;
        }
        public Float getRubbishScore() {
            return this.rubbishScore;
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

        public ClassifyingRubbishResponseData setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public ClassifyingRubbishResponseData setElements(java.util.List<ClassifyingRubbishResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ClassifyingRubbishResponseDataElements> getElements() {
            return this.elements;
        }

    }

}

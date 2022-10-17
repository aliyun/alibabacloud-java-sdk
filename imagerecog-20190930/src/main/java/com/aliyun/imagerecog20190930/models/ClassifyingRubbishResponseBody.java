// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class ClassifyingRubbishResponseBody extends TeaModel {
    @NameInMap("Data")
    public ClassifyingRubbishResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ClassifyingRubbishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClassifyingRubbishResponseBody self = new ClassifyingRubbishResponseBody();
        return TeaModel.build(map, self);
    }

    public ClassifyingRubbishResponseBody setData(ClassifyingRubbishResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClassifyingRubbishResponseBodyData getData() {
        return this.data;
    }

    public ClassifyingRubbishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClassifyingRubbishResponseBodyDataElements extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryScore")
        public Float categoryScore;

        @NameInMap("Rubbish")
        public String rubbish;

        @NameInMap("RubbishScore")
        public Float rubbishScore;

        public static ClassifyingRubbishResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            ClassifyingRubbishResponseBodyDataElements self = new ClassifyingRubbishResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public ClassifyingRubbishResponseBodyDataElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ClassifyingRubbishResponseBodyDataElements setCategoryScore(Float categoryScore) {
            this.categoryScore = categoryScore;
            return this;
        }
        public Float getCategoryScore() {
            return this.categoryScore;
        }

        public ClassifyingRubbishResponseBodyDataElements setRubbish(String rubbish) {
            this.rubbish = rubbish;
            return this;
        }
        public String getRubbish() {
            return this.rubbish;
        }

        public ClassifyingRubbishResponseBodyDataElements setRubbishScore(Float rubbishScore) {
            this.rubbishScore = rubbishScore;
            return this;
        }
        public Float getRubbishScore() {
            return this.rubbishScore;
        }

    }

    public static class ClassifyingRubbishResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<ClassifyingRubbishResponseBodyDataElements> elements;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        public static ClassifyingRubbishResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClassifyingRubbishResponseBodyData self = new ClassifyingRubbishResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClassifyingRubbishResponseBodyData setElements(java.util.List<ClassifyingRubbishResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ClassifyingRubbishResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public ClassifyingRubbishResponseBodyData setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

    }

}

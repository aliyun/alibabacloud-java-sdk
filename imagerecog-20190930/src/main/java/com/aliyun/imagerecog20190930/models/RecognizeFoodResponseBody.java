// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeFoodResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeFoodResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeFoodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodResponseBody self = new RecognizeFoodResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodResponseBody setData(RecognizeFoodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFoodResponseBodyData getData() {
        return this.data;
    }

    public RecognizeFoodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeFoodResponseBodyDataTopFives extends TeaModel {
        @NameInMap("Calorie")
        public String calorie;

        @NameInMap("Category")
        public String category;

        @NameInMap("Score")
        public Float score;

        public static RecognizeFoodResponseBodyDataTopFives build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFoodResponseBodyDataTopFives self = new RecognizeFoodResponseBodyDataTopFives();
            return TeaModel.build(map, self);
        }

        public RecognizeFoodResponseBodyDataTopFives setCalorie(String calorie) {
            this.calorie = calorie;
            return this;
        }
        public String getCalorie() {
            return this.calorie;
        }

        public RecognizeFoodResponseBodyDataTopFives setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RecognizeFoodResponseBodyDataTopFives setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class RecognizeFoodResponseBodyData extends TeaModel {
        @NameInMap("TopFives")
        public java.util.List<RecognizeFoodResponseBodyDataTopFives> topFives;

        public static RecognizeFoodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFoodResponseBodyData self = new RecognizeFoodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeFoodResponseBodyData setTopFives(java.util.List<RecognizeFoodResponseBodyDataTopFives> topFives) {
            this.topFives = topFives;
            return this;
        }
        public java.util.List<RecognizeFoodResponseBodyDataTopFives> getTopFives() {
            return this.topFives;
        }

    }

}

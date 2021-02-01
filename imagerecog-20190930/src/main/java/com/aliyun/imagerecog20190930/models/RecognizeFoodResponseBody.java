// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeFoodResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeFoodResponseBodyData data;

    public static RecognizeFoodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodResponseBody self = new RecognizeFoodResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeFoodResponseBody setData(RecognizeFoodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFoodResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeFoodResponseBodyDataTopFives extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Calorie")
        public String calorie;

        public static RecognizeFoodResponseBodyDataTopFives build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFoodResponseBodyDataTopFives self = new RecognizeFoodResponseBodyDataTopFives();
            return TeaModel.build(map, self);
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

        public RecognizeFoodResponseBodyDataTopFives setCalorie(String calorie) {
            this.calorie = calorie;
            return this;
        }
        public String getCalorie() {
            return this.calorie;
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

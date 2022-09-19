// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeFurnitureSpuResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeFurnitureSpuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuResponseBody self = new RecognizeFurnitureSpuResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureSpuResponseBody setData(RecognizeFurnitureSpuResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFurnitureSpuResponseBodyData getData() {
        return this.data;
    }

    public RecognizeFurnitureSpuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeFurnitureSpuResponseBodyData extends TeaModel {
        @NameInMap("PredCate")
        public String predCate;

        @NameInMap("PredCateId")
        public String predCateId;

        @NameInMap("PredProbability")
        public Float predProbability;

        public static RecognizeFurnitureSpuResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFurnitureSpuResponseBodyData self = new RecognizeFurnitureSpuResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeFurnitureSpuResponseBodyData setPredCate(String predCate) {
            this.predCate = predCate;
            return this;
        }
        public String getPredCate() {
            return this.predCate;
        }

        public RecognizeFurnitureSpuResponseBodyData setPredCateId(String predCateId) {
            this.predCateId = predCateId;
            return this;
        }
        public String getPredCateId() {
            return this.predCateId;
        }

        public RecognizeFurnitureSpuResponseBodyData setPredProbability(Float predProbability) {
            this.predProbability = predProbability;
            return this;
        }
        public Float getPredProbability() {
            return this.predProbability;
        }

    }

}

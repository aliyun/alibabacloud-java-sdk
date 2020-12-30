// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeFurnitureAttributeResponseBodyData data;

    public static RecognizeFurnitureAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureAttributeResponseBody self = new RecognizeFurnitureAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeFurnitureAttributeResponseBody setData(RecognizeFurnitureAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeFurnitureAttributeResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeFurnitureAttributeResponseBodyData extends TeaModel {
        @NameInMap("PredStyle")
        public String predStyle;

        @NameInMap("PredProbability")
        public Float predProbability;

        @NameInMap("PredStyleId")
        public String predStyleId;

        public static RecognizeFurnitureAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFurnitureAttributeResponseBodyData self = new RecognizeFurnitureAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeFurnitureAttributeResponseBodyData setPredStyle(String predStyle) {
            this.predStyle = predStyle;
            return this;
        }
        public String getPredStyle() {
            return this.predStyle;
        }

        public RecognizeFurnitureAttributeResponseBodyData setPredProbability(Float predProbability) {
            this.predProbability = predProbability;
            return this;
        }
        public Float getPredProbability() {
            return this.predProbability;
        }

        public RecognizeFurnitureAttributeResponseBodyData setPredStyleId(String predStyleId) {
            this.predStyleId = predStyleId;
            return this;
        }
        public String getPredStyleId() {
            return this.predStyleId;
        }

    }

}

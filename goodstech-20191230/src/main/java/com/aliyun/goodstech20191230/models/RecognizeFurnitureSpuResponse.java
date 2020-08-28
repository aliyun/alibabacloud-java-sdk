// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeFurnitureSpuResponseData data;

    public static RecognizeFurnitureSpuResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuResponse self = new RecognizeFurnitureSpuResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeFurnitureSpuResponseData extends TeaModel {
        @NameInMap("PredCateId")
        @Validation(required = true)
        public String predCateId;

        @NameInMap("PredCate")
        @Validation(required = true)
        public String predCate;

        @NameInMap("PredProbability")
        @Validation(required = true)
        public Double predProbability;

        public static RecognizeFurnitureSpuResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFurnitureSpuResponseData self = new RecognizeFurnitureSpuResponseData();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeFurnitureAttributeResponseData data;

    public static RecognizeFurnitureAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureAttributeResponse self = new RecognizeFurnitureAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeFurnitureAttributeResponseData extends TeaModel {
        @NameInMap("PredStyleId")
        @Validation(required = true)
        public String predStyleId;

        @NameInMap("PredStyle")
        @Validation(required = true)
        public String predStyle;

        @NameInMap("PredProbability")
        @Validation(required = true)
        public Double predProbability;

        public static RecognizeFurnitureAttributeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeFurnitureAttributeResponseData self = new RecognizeFurnitureAttributeResponseData();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessCompositionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AssessCompositionResponseData data;

    public static AssessCompositionResponse build(java.util.Map<String, ?> map) throws Exception {
        AssessCompositionResponse self = new AssessCompositionResponse();
        return TeaModel.build(map, self);
    }

    public static class AssessCompositionResponseData extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        public static AssessCompositionResponseData build(java.util.Map<String, ?> map) throws Exception {
            AssessCompositionResponseData self = new AssessCompositionResponseData();
            return TeaModel.build(map, self);
        }

    }

}

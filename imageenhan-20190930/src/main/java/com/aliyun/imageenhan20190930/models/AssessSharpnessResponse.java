// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AssessSharpnessResponseData data;

    public static AssessSharpnessResponse build(java.util.Map<String, ?> map) throws Exception {
        AssessSharpnessResponse self = new AssessSharpnessResponse();
        return TeaModel.build(map, self);
    }

    public static class AssessSharpnessResponseData extends TeaModel {
        @NameInMap("Sharpness")
        @Validation(required = true)
        public Double sharpness;

        public static AssessSharpnessResponseData build(java.util.Map<String, ?> map) throws Exception {
            AssessSharpnessResponseData self = new AssessSharpnessResponseData();
            return TeaModel.build(map, self);
        }

    }

}

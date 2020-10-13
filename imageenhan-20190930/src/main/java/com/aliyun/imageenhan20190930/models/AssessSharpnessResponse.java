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

    public AssessSharpnessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssessSharpnessResponse setData(AssessSharpnessResponseData data) {
        this.data = data;
        return this;
    }
    public AssessSharpnessResponseData getData() {
        return this.data;
    }

    public static class AssessSharpnessResponseData extends TeaModel {
        @NameInMap("Sharpness")
        @Validation(required = true)
        public Float sharpness;

        public static AssessSharpnessResponseData build(java.util.Map<String, ?> map) throws Exception {
            AssessSharpnessResponseData self = new AssessSharpnessResponseData();
            return TeaModel.build(map, self);
        }

        public AssessSharpnessResponseData setSharpness(Float sharpness) {
            this.sharpness = sharpness;
            return this;
        }
        public Float getSharpness() {
            return this.sharpness;
        }

    }

}

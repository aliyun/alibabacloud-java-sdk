// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessResponseBody extends TeaModel {
    @NameInMap("Data")
    public AssessSharpnessResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C0B594A1-383E-4F97-A740-0D51CF8E37D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssessSharpnessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssessSharpnessResponseBody self = new AssessSharpnessResponseBody();
        return TeaModel.build(map, self);
    }

    public AssessSharpnessResponseBody setData(AssessSharpnessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AssessSharpnessResponseBodyData getData() {
        return this.data;
    }

    public AssessSharpnessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssessSharpnessResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Sharpness")
        public Float sharpness;

        public static AssessSharpnessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AssessSharpnessResponseBodyData self = new AssessSharpnessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AssessSharpnessResponseBodyData setSharpness(Float sharpness) {
            this.sharpness = sharpness;
            return this;
        }
        public Float getSharpness() {
            return this.sharpness;
        }

    }

}

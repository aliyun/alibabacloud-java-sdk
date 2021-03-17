// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessExposureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AssessExposureResponseBodyData data;

    public static AssessExposureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssessExposureResponseBody self = new AssessExposureResponseBody();
        return TeaModel.build(map, self);
    }

    public AssessExposureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssessExposureResponseBody setData(AssessExposureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AssessExposureResponseBodyData getData() {
        return this.data;
    }

    public static class AssessExposureResponseBodyData extends TeaModel {
        @NameInMap("Exposure")
        public Float exposure;

        public static AssessExposureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AssessExposureResponseBodyData self = new AssessExposureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AssessExposureResponseBodyData setExposure(Float exposure) {
            this.exposure = exposure;
            return this;
        }
        public Float getExposure() {
            return this.exposure;
        }

    }

}

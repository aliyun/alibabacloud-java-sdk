// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectMaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectMaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectMaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectMaskResponseBody self = new DetectMaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectMaskResponseBody setData(DetectMaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectMaskResponseBodyData getData() {
        return this.data;
    }

    public DetectMaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectMaskResponseBodyData extends TeaModel {
        @NameInMap("FaceProbability")
        public Float faceProbability;

        @NameInMap("Mask")
        public Integer mask;

        public static DetectMaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectMaskResponseBodyData self = new DetectMaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectMaskResponseBodyData setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

        public DetectMaskResponseBodyData setMask(Integer mask) {
            this.mask = mask;
            return this;
        }
        public Integer getMask() {
            return this.mask;
        }

    }

}

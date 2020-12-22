// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectMaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectMaskResponseBodyData data;

    public static DetectMaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectMaskResponseBody self = new DetectMaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectMaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectMaskResponseBody setData(DetectMaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectMaskResponseBodyData getData() {
        return this.data;
    }

    public static class DetectMaskResponseBodyData extends TeaModel {
        @NameInMap("Mask")
        public Integer mask;

        @NameInMap("FaceProbability")
        public Float faceProbability;

        public static DetectMaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectMaskResponseBodyData self = new DetectMaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectMaskResponseBodyData setMask(Integer mask) {
            this.mask = mask;
            return this;
        }
        public Integer getMask() {
            return this.mask;
        }

        public DetectMaskResponseBodyData setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

    }

}

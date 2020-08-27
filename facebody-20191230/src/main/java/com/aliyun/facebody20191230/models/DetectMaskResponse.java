// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectMaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectMaskResponseData data;

    public static DetectMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectMaskResponse self = new DetectMaskResponse();
        return TeaModel.build(map, self);
    }

    public DetectMaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectMaskResponse setData(DetectMaskResponseData data) {
        this.data = data;
        return this;
    }
    public DetectMaskResponseData getData() {
        return this.data;
    }

    public static class DetectMaskResponseData extends TeaModel {
        @NameInMap("Mask")
        @Validation(required = true)
        public Integer mask;

        @NameInMap("FaceProbability")
        @Validation(required = true)
        public Float faceProbability;

        public static DetectMaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectMaskResponseData self = new DetectMaskResponseData();
            return TeaModel.build(map, self);
        }

        public DetectMaskResponseData setMask(Integer mask) {
            this.mask = mask;
            return this;
        }
        public Integer getMask() {
            return this.mask;
        }

        public DetectMaskResponseData setFaceProbability(Float faceProbability) {
            this.faceProbability = faceProbability;
            return this;
        }
        public Float getFaceProbability() {
            return this.faceProbability;
        }

    }

}

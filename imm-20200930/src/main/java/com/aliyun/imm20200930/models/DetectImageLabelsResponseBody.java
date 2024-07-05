// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageLabelsResponseBody extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <strong>example:</strong>
     * <p>91AC8C98-0F36-49D2-8290-742E24DF1F69</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLabelsResponseBody self = new DetectImageLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageLabelsResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public DetectImageLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

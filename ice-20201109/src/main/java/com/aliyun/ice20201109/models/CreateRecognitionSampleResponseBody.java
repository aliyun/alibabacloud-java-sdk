// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateRecognitionSampleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong><strong><strong><strong><strong>4d2ba728e2f</strong></strong></strong></strong></strong></strong></strong></p>
     */
    @NameInMap("SampleId")
    public String sampleId;

    public static CreateRecognitionSampleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecognitionSampleResponseBody self = new CreateRecognitionSampleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecognitionSampleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRecognitionSampleResponseBody setSampleId(String sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public String getSampleId() {
        return this.sampleId;
    }

}

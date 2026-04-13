// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DetectTerraformStateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>job-dcsdxxxxxx</p>
     */
    @NameInMap("detectionId")
    public String detectionId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF75EF50-955D-5E1F-AB23-A657C2C6D3C7</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DetectTerraformStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectTerraformStateResponseBody self = new DetectTerraformStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectTerraformStateResponseBody setDetectionId(String detectionId) {
        this.detectionId = detectionId;
        return this;
    }
    public String getDetectionId() {
        return this.detectionId;
    }

    public DetectTerraformStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

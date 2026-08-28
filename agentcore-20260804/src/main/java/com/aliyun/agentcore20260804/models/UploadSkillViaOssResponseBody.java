// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UploadSkillViaOssResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-1234567890abcdef</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UploadSkillViaOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadSkillViaOssResponseBody self = new UploadSkillViaOssResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadSkillViaOssResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadSkillViaOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

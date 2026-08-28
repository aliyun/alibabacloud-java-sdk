// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DownloadSkillVersionViaOssResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/artifacts/example.zip">https://example.com/artifacts/example.zip</a></p>
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

    public static DownloadSkillVersionViaOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSkillVersionViaOssResponseBody self = new DownloadSkillVersionViaOssResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSkillVersionViaOssResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DownloadSkillVersionViaOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

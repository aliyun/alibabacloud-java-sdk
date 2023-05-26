// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ArmsAgentDownloadUrl")
    public String armsAgentDownloadUrl;

    /**
     * <p>Obtains the download URL of the Application Real-Time Monitoring Service (ARMS) agent.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDownloadUrlResponseBody self = new GetAgentDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentDownloadUrlResponseBody setArmsAgentDownloadUrl(String armsAgentDownloadUrl) {
        this.armsAgentDownloadUrl = armsAgentDownloadUrl;
        return this;
    }
    public String getArmsAgentDownloadUrl() {
        return this.armsAgentDownloadUrl;
    }

    public GetAgentDownloadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

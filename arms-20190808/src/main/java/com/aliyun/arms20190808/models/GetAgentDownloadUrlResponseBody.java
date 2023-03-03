// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The download URL of the ARMS agent.</p>
     */
    @NameInMap("ArmsAgentDownloadUrl")
    public String armsAgentDownloadUrl;

    /**
     * <p>The ID of the request.</p>
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

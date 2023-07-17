// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlResponseBody extends TeaModel {
    @NameInMap("ArmsAgentDownloadUrl")
    public String armsAgentDownloadUrl;

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

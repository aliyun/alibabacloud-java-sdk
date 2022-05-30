// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetArmsAgentDownLoadUrlResponseBody extends TeaModel {
    @NameInMap("ArmsAgentDownloadUrl")
    public String armsAgentDownloadUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static GetArmsAgentDownLoadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArmsAgentDownLoadUrlResponseBody self = new GetArmsAgentDownLoadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArmsAgentDownLoadUrlResponseBody setArmsAgentDownloadUrl(String armsAgentDownloadUrl) {
        this.armsAgentDownloadUrl = armsAgentDownloadUrl;
        return this;
    }
    public String getArmsAgentDownloadUrl() {
        return this.armsAgentDownloadUrl;
    }

    public GetArmsAgentDownLoadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

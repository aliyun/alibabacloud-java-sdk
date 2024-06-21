// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAgentDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The download URL of the ARMS agent.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://arms-apm-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/2.7.1.1/">http://arms-apm-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/2.7.1.1/</a></p>
     */
    @NameInMap("ArmsAgentDownloadUrl")
    public String armsAgentDownloadUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14043452-D486-4EA1-80C9-BA73FB81****</p>
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

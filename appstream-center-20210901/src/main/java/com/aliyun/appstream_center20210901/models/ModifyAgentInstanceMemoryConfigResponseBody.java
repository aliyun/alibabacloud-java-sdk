// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAgentInstanceMemoryConfigResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAgentInstanceMemoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentInstanceMemoryConfigResponseBody self = new ModifyAgentInstanceMemoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAgentInstanceMemoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

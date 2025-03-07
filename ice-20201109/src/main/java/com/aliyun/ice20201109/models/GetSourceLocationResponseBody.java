// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSourceLocationResponseBody extends TeaModel {
    /**
     * <p><strong>Request ID</strong></p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source location information.</p>
     */
    @NameInMap("SourceLocation")
    public ChannelAssemblySourceLocation sourceLocation;

    public static GetSourceLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceLocationResponseBody self = new GetSourceLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourceLocationResponseBody setSourceLocation(ChannelAssemblySourceLocation sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public ChannelAssemblySourceLocation getSourceLocation() {
        return this.sourceLocation;
    }

}

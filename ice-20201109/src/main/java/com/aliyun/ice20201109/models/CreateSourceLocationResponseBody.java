// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSourceLocationResponseBody extends TeaModel {
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

    public static CreateSourceLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceLocationResponseBody self = new CreateSourceLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSourceLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSourceLocationResponseBody setSourceLocation(ChannelAssemblySourceLocation sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public ChannelAssemblySourceLocation getSourceLocation() {
        return this.sourceLocation;
    }

}

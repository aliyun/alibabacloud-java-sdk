// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Source")
    public ChannelAssemblySource source;

    public static GetSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceResponseBody self = new GetSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSourceResponseBody setSource(ChannelAssemblySource source) {
        this.source = source;
        return this;
    }
    public ChannelAssemblySource getSource() {
        return this.source;
    }

}

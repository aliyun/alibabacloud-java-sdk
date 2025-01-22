// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Source")
    public ChannelAssemblySource source;

    public static CreateSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSourceResponseBody self = new CreateSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSourceResponseBody setSource(ChannelAssemblySource source) {
        this.source = source;
        return this;
    }
    public ChannelAssemblySource getSource() {
        return this.source;
    }

}

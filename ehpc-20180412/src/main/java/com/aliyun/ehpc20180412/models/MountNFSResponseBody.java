// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class MountNFSResponseBody extends TeaModel {
    /**
     * <p>The ID of the execution.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MountNFSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MountNFSResponseBody self = new MountNFSResponseBody();
        return TeaModel.build(map, self);
    }

    public MountNFSResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public MountNFSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

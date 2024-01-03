// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ModifyDiskReplicaPairResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskReplicaPairResponseBody self = new ModifyDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

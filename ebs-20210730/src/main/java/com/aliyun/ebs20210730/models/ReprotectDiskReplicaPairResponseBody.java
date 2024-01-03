// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaPairResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReprotectDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReprotectDiskReplicaPairResponseBody self = new ReprotectDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public ReprotectDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class FailoverDiskReplicaPairResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FailoverDiskReplicaPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FailoverDiskReplicaPairResponseBody self = new FailoverDiskReplicaPairResponseBody();
        return TeaModel.build(map, self);
    }

    public FailoverDiskReplicaPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

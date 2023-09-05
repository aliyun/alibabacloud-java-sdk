// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskReplicaPairProgressResponseBody extends TeaModel {
    /**
     * <p>The replication progress of the replication pair.</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The timestamp that indicates the last recovery point in time. The value is returned only after the replication pair works for replicating data.</p>
     */
    @NameInMap("RecoverPoint")
    public Long recoverPoint;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskReplicaPairProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskReplicaPairProgressResponseBody self = new DescribeDiskReplicaPairProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskReplicaPairProgressResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public DescribeDiskReplicaPairProgressResponseBody setRecoverPoint(Long recoverPoint) {
        this.recoverPoint = recoverPoint;
        return this;
    }
    public Long getRecoverPoint() {
        return this.recoverPoint;
    }

    public DescribeDiskReplicaPairProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

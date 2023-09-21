// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ReprotectDiskReplicaPairRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReplicaPairId")
    public String replicaPairId;

    /**
     * <p>反向复制开关：false代表恢复原方向，true代表反向复制。默认值是true。</p>
     */
    @NameInMap("ReverseReplicate")
    public Boolean reverseReplicate;

    public static ReprotectDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ReprotectDiskReplicaPairRequest self = new ReprotectDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public ReprotectDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReprotectDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReprotectDiskReplicaPairRequest setReplicaPairId(String replicaPairId) {
        this.replicaPairId = replicaPairId;
        return this;
    }
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public ReprotectDiskReplicaPairRequest setReverseReplicate(Boolean reverseReplicate) {
        this.reverseReplicate = reverseReplicate;
        return this;
    }
    public Boolean getReverseReplicate() {
        return this.reverseReplicate;
    }

}

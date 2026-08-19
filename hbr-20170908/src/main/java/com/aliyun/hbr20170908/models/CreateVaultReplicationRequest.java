// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateVaultReplicationRequest extends TeaModel {
    /**
     * <p>The ID of the source region. If you do not specify this parameter, the region where the API is called is used.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ReplicationSourceRegionId")
    public String replicationSourceRegionId;

    /**
     * <p>The ID of the source backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("ReplicationSourceVaultId")
    public String replicationSourceVaultId;

    /**
     * <p>The ID of the destination backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-*********************</p>
     */
    @NameInMap("ReplicationTargetVaultId")
    public String replicationTargetVaultId;

    public static CreateVaultReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVaultReplicationRequest self = new CreateVaultReplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateVaultReplicationRequest setReplicationSourceRegionId(String replicationSourceRegionId) {
        this.replicationSourceRegionId = replicationSourceRegionId;
        return this;
    }
    public String getReplicationSourceRegionId() {
        return this.replicationSourceRegionId;
    }

    public CreateVaultReplicationRequest setReplicationSourceVaultId(String replicationSourceVaultId) {
        this.replicationSourceVaultId = replicationSourceVaultId;
        return this;
    }
    public String getReplicationSourceVaultId() {
        return this.replicationSourceVaultId;
    }

    public CreateVaultReplicationRequest setReplicationTargetVaultId(String replicationTargetVaultId) {
        this.replicationTargetVaultId = replicationTargetVaultId;
        return this;
    }
    public String getReplicationTargetVaultId() {
        return this.replicationTargetVaultId;
    }

}

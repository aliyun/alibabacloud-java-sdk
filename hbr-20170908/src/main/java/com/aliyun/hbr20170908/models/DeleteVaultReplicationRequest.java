// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteVaultReplicationRequest extends TeaModel {
    /**
     * <p>The ID of the source region. If you leave this parameter empty, the region where you call the API is used.</p>
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

    public static DeleteVaultReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVaultReplicationRequest self = new DeleteVaultReplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVaultReplicationRequest setReplicationSourceRegionId(String replicationSourceRegionId) {
        this.replicationSourceRegionId = replicationSourceRegionId;
        return this;
    }
    public String getReplicationSourceRegionId() {
        return this.replicationSourceRegionId;
    }

    public DeleteVaultReplicationRequest setReplicationSourceVaultId(String replicationSourceVaultId) {
        this.replicationSourceVaultId = replicationSourceVaultId;
        return this;
    }
    public String getReplicationSourceVaultId() {
        return this.replicationSourceVaultId;
    }

    public DeleteVaultReplicationRequest setReplicationTargetVaultId(String replicationTargetVaultId) {
        this.replicationTargetVaultId = replicationTargetVaultId;
        return this;
    }
    public String getReplicationTargetVaultId() {
        return this.replicationTargetVaultId;
    }

}

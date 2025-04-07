// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Backup client. If you delete a backup snapshot for Elastic Compute Service (ECS) instances, you must specify one of the ClientId and <strong>InstanceId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>c-*********************</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>Deprected.</p>
     */
    @NameInMap("Force")
    @Deprecated
    public Boolean force;

    /**
     * <p>The ID of the ECS instance. If you delete a backup snapshot for ECS instances, you must specify one of the InstanceId and <strong>ClientId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>i-*********************</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the backup snapshot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-*********************</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The type of the backup source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: backup snapshots for ECS files</li>
     * <li><strong>OSS</strong>: backup snapshots for Object Storage Service (OSS) buckets</li>
     * <li><strong>NAS</strong>: backup snapshots for Apsara File Storage NAS (NAS) file systems</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The token that you want to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>02WJDOE7</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DeleteSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotRequest self = new DeleteSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    @Deprecated
    public DeleteSnapshotRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteSnapshotRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DeleteSnapshotRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DeleteSnapshotRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public DeleteSnapshotRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}

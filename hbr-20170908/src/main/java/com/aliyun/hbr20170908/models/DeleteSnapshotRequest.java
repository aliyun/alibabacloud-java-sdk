// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteSnapshotRequest extends TeaModel {
    /**
     * <p>The client ID. When deleting a backup snapshot of ECS File Backup Essential Edition, you must specify either this parameter or <strong>InstanceId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>c-*********************</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    @Deprecated
    public Boolean force;

    /**
     * <p>The ECS instance ID. When deleting a backup snapshot of ECS File Backup Essential Edition, you must specify either this parameter or <strong>ClientId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>i-*********************</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The backup snapshot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-*********************</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The backup source type. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: backup snapshot of ECS File Backup Essential Edition.</li>
     * <li><strong>OSS</strong>: backup snapshot of Alibaba Cloud OSS.</li>
     * <li><strong>NAS</strong>: backup snapshot of Alibaba Cloud NAS.</li>
     * <li><strong>UDM_ECS</strong>: backup snapshot of an entire ECS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The token for the deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>02WJDOE7</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The backup vault ID.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UninstallBackupClientsRequest extends TeaModel {
    /**
     * <p>The IDs of Cloud Backup clients. The sum of the number of Cloud Backup client IDs and the number of ECS instance IDs cannot exceed 20. Otherwise, an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;c-*********************&quot;]</p>
     */
    @NameInMap("ClientIds")
    public java.util.Map<String, ?> clientIds;

    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <ul>
     * <li>SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</li>
     * <li>CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>129349237xxxxx</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The IDs of Elastic Compute Service (ECS) instances. You can specify a maximum of 20 ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-0xi5wj5*****v3j3bh2gj5&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.Map<String, ?> instanceIds;

    public static UninstallBackupClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientsRequest self = new UninstallBackupClientsRequest();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientsRequest setClientIds(java.util.Map<String, ?> clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public java.util.Map<String, ?> getClientIds() {
        return this.clientIds;
    }

    public UninstallBackupClientsRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public UninstallBackupClientsRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public UninstallBackupClientsRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public UninstallBackupClientsRequest setInstanceIds(java.util.Map<String, ?> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
    }

}

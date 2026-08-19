// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class InstallBackupClientsRequest extends TeaModel {
    /**
     * <p>The name of the RAM role that is created in the source account for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The type of cross-account backup. Valid values:</p>
     * <ul>
     * <li><p>SELF_ACCOUNT: Backs up data within the current account.</p>
     * </li>
     * <li><p>CROSS_ACCOUNT: Backs up data across accounts.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CROSS_ACCOUNT</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source account that is used for cross-account backup.</p>
     * 
     * <strong>example:</strong>
     * <p>16392782xxxxxx</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The IDs of the ECS instances. You can specify a maximum of 20 instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-0xi5wj5*****v3j3bh2gj5&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.Map<String, ?> instanceIds;

    public static InstallBackupClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallBackupClientsRequest self = new InstallBackupClientsRequest();
        return TeaModel.build(map, self);
    }

    public InstallBackupClientsRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public InstallBackupClientsRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public InstallBackupClientsRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public InstallBackupClientsRequest setInstanceIds(java.util.Map<String, ?> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
    }

}

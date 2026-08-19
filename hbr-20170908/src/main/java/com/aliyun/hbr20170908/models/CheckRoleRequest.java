// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CheckRoleRequest extends TeaModel {
    /**
     * <p>The role type. Valid values:</p>
     * <ul>
     * <li>EcsRole: access permissions for ECS resources</li>
     * <li>CsgRole: permissions to back up Cloud Storage Gateway resources</li>
     * <li>NasRole: permissions to back up NAS resources</li>
     * <li>OssRole: permissions to back up OSS resources</li>
     * <li>UdmRole: permissions to back up entire ECS instances</li>
     * <li>VMwareLocalRole: permissions to back up on-premises VMware virtual machines</li>
     * <li>VMwareCloudRole: permissions to back up cloud-based VMware virtual machines</li>
     * <li>EcsBackupRole: permissions for ECS backup</li>
     * <li>OtsRole: permissions to back up OTS resources</li>
     * <li>CrossAccountRole: permissions for cross-account backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OssRole</p>
     */
    @NameInMap("CheckRoleType")
    public String checkRoleType;

    /**
     * <p>The name of the RAM role created in the source account for cross-account backup managed by the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The ID of the source account for cross-account backup managed by the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>158975xxxxx4625</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    public static CheckRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRoleRequest self = new CheckRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckRoleRequest setCheckRoleType(String checkRoleType) {
        this.checkRoleType = checkRoleType;
        return this;
    }
    public String getCheckRoleType() {
        return this.checkRoleType;
    }

    public CheckRoleRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CheckRoleRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

}

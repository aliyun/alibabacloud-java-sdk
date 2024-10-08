// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CheckRoleRequest extends TeaModel {
    /**
     * <p>The type of the role. Valid values:</p>
     * <ul>
     * <li>EcsRole: a role with the permissions to access Elastic Compute Service (ECS) resources</li>
     * <li>CsgRole: a role with the permissions to perform Cloud Storage Gateway (CSG) backup</li>
     * <li>NasRole: a role with the permissions to perform NAS backup</li>
     * <li>OssRole: a role with the permissions to perform Object Storage Service (OSS) backup</li>
     * <li>UdmRole: a role with the permissions to perform ECS instance backup</li>
     * <li>VMwareLocalRole: a role with the permissions to back up on-premises VMware virtual machines (VMs)</li>
     * <li>VMwareCloudRole: a role with the permissions to back up VMs deployed on Alibaba Cloud VMware Service (ACVS)</li>
     * <li>EcsBackupRole: a role with the permissions to perform ECS backup</li>
     * <li>OtsRole: a role with the permissions to perform Tablestore backup</li>
     * <li>CrossAccountRole: a role with the permissions to perform cross-account backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OssRole</p>
     */
    @NameInMap("CheckRoleType")
    public String checkRoleType;

    /**
     * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>BackupRole</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
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

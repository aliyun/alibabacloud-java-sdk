// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UninstallBackupClientsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the backup client. The sum of the number of backup client IDs and the number of ECS instance IDs cannot exceed 20. Otherwise, an error occurs.</p>
     */
    @NameInMap("ClientIds")
    public String clientIdsShrink;

    /**
     * <p>The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    /**
     * <p>Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:</p>
     * <br>
     * <p>*   SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.</p>
     * <p>*   CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountType")
    public String crossAccountType;

    /**
     * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.</p>
     */
    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    /**
     * <p>The ID of the ECS instance. You can specify up to 20 IDs.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    public static UninstallBackupClientsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallBackupClientsShrinkRequest self = new UninstallBackupClientsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UninstallBackupClientsShrinkRequest setClientIdsShrink(String clientIdsShrink) {
        this.clientIdsShrink = clientIdsShrink;
        return this;
    }
    public String getClientIdsShrink() {
        return this.clientIdsShrink;
    }

    public UninstallBackupClientsShrinkRequest setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public UninstallBackupClientsShrinkRequest setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public UninstallBackupClientsShrinkRequest setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    public UninstallBackupClientsShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

}

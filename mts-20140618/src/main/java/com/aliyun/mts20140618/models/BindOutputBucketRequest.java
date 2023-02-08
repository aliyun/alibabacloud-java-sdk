// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class BindOutputBucketRequest extends TeaModel {
    /**
     * <p>The name of the output media bucket to be bound. The name can be up to 64 bytes in size and can contain letters, digits, and hyphens (-). The name cannot start with a special character.</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ARN of the RAM role.</p>
     * <br>
     * <p>The trust entity of the RAM role is a SAML IdP. For more information, see [Create a RAM role for a trusted IdP](~~116805~~) or [CreateRole](~~28710~~).</p>
     * <br>
     * <p>Format: `acs:ram::<account_id>:role/<role_name>`.</p>
     * <br>
     * <p>You can view the ARN in the RAM console or by calling operations.</p>
     * <br>
     * <p>- For more information about how to view the ARN in the RAM console, see [How do I view the ARN of the RAM role?](~~39744~~).</p>
     * <p>- For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    public static BindOutputBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        BindOutputBucketRequest self = new BindOutputBucketRequest();
        return TeaModel.build(map, self);
    }

    public BindOutputBucketRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public BindOutputBucketRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BindOutputBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindOutputBucketRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindOutputBucketRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindOutputBucketRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}

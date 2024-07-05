// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UnbindInputBucketRequest extends TeaModel {
    /**
     * <p>The name of the input media bucket to be unbound. To obtain the media bucket name, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane. Alternatively, you can log on to the <strong>Object Storage Service (OSS) console</strong> and click <strong>Historical Paths</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-bucket-****</p>
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
     * <p>The Alibaba Cloud Resource Name (ARN) of the role used for delegated authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::174809843091****:role/exampleRole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    public static UnbindInputBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInputBucketRequest self = new UnbindInputBucketRequest();
        return TeaModel.build(map, self);
    }

    public UnbindInputBucketRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public UnbindInputBucketRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UnbindInputBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindInputBucketRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindInputBucketRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindInputBucketRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}

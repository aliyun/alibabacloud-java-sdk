// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class BindInputBucketRequest extends TeaModel {
    /**
     * <p>The name of the input media bucket to be bound. The name can be up to 64 bytes in size. To obtain the media bucket name, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane.</p>
     * <blockquote>
     * <p>The bucket name can contain lowercase letters, digits, and hyphens (-), and cannot start or end with a hyphen (-).</p>
     * </blockquote>
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

    /**
     * <p>The settings of Object Storage Service (OSS) hotlink protection. For more information, see <a href="https://help.aliyun.com/document_detail/31869.html">Hotlink protection</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">http://www.example.com</a></p>
     */
    @NameInMap("Referer")
    public String referer;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BindInputBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInputBucketRequest self = new BindInputBucketRequest();
        return TeaModel.build(map, self);
    }

    public BindInputBucketRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public BindInputBucketRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BindInputBucketRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindInputBucketRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public BindInputBucketRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindInputBucketRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

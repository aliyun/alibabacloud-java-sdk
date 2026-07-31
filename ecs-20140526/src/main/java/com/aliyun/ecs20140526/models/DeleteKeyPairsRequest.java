// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsRequest extends TeaModel {
    /**
     * <p>The names of the SSH key pairs. The value is a JSON array of SSH key pair names. You can specify up to 100 SSH key pairs. Separate multiple names with commas (,).</p>
     * <blockquote>
     * <p>Before you delete SSH key pairs, you can call <a href="https://help.aliyun.com/document_detail/51773.html">DescribeKeyPairs</a> to query existing key pairs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TestKeyPairName-1&quot;, &quot;TestKeyPairName-2&quot;, … &quot;TestKeyPairName-100&quot;]</p>
     */
    @NameInMap("KeyPairNames")
    public String keyPairNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the SSH key pairs. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsRequest self = new DeleteKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsRequest setKeyPairNames(String keyPairNames) {
        this.keyPairNames = keyPairNames;
        return this;
    }
    public String getKeyPairNames() {
        return this.keyPairNames;
    }

    public DeleteKeyPairsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteKeyPairsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteKeyPairsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteKeyPairsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

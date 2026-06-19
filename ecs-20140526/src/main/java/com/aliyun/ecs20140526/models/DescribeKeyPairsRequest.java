// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsRequest extends TeaModel {
    /**
     * <p>Specifies whether to include PublicKey in the response.
     * Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludePublicKey")
    public Boolean includePublicKey;

    /**
     * <p>The fingerprint of the key pair. The fingerprint uses the message-digest algorithm 5 (MD5) based on the public key fingerprint format defined in RFC 4716. For more information, see <a href="https://tools.ietf.org/html/rfc4716">RFC 4716</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ABC1234567</p>
     */
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    /**
     * <p>The name of the key pair. You can use regular expressions for fuzzy search, with the asterisk (*) to match child table expressions. Examples:</p>
     * <ul>
     * <li><code>*SshKey</code>: searches for key pair names that end with SshKey, including SshKey.</li>
     * <li><code>SshKey*</code>: searches for key pair names that start with SshKey, including SshKey.</li>
     * <li><code>*SshKey*</code>: searches for key pair names that contain SshKey, including SshKey.</li>
     * <li><code>SshKey</code>: exact match of SshKey.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><em>SshKey</em></p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the key pair list. Minimum value: 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in paging queries. Settings: Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the key pairs. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the key pairs belong. When you use this parameter to filter resources, the resource count cannot exceed 1000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-amnhr7u7c7hj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeKeyPairsRequestTag> tag;

    public static DescribeKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsRequest self = new DescribeKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsRequest setIncludePublicKey(Boolean includePublicKey) {
        this.includePublicKey = includePublicKey;
        return this;
    }
    public Boolean getIncludePublicKey() {
        return this.includePublicKey;
    }

    public DescribeKeyPairsRequest setKeyPairFingerPrint(String keyPairFingerPrint) {
        this.keyPairFingerPrint = keyPairFingerPrint;
        return this;
    }
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    public DescribeKeyPairsRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeKeyPairsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeKeyPairsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeyPairsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeKeyPairsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeKeyPairsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeKeyPairsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeKeyPairsRequest setTag(java.util.List<DescribeKeyPairsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeKeyPairsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeKeyPairsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the key pair. Valid values of N: 1 to 20.</p>
         * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count of resources that are attached with all specified tags cannot exceed 1000. If the resource count exceeds 1000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the key pair. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeKeyPairsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsRequestTag self = new DescribeKeyPairsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeKeyPairsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

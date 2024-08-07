// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsRequest extends TeaModel {
    /**
     * <p>Specifies whether to include PublicKey in the response. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludePublicKey")
    public Boolean includePublicKey;

    /**
     * <p>The fingerprint of the key pair. The message-digest algorithm 5 (MD5) is used based on the public key fingerprint format defined in RFC 4716. For more information, see <a href="https://tools.ietf.org/html/rfc4716">RFC 4716</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ABC1234567</p>
     */
    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    /**
     * <p>The name of the key pair. You can use the asterisk (\*) symbol as a wildcard in regular expressions to perform a fuzzy search for key pairs. Sample patterns:</p>
     * <ul>
     * <li><code>*SshKey</code>: queries key pairs whose names end with SshKey, including the key pair named SshKey.</li>
     * <li><code>SshKey*</code>: queries key pairs whose names start with SshKey, including the key pair named SshKey.</li>
     * <li><code>*SshKey*</code>: queries key pairs whose names include SshKey, including the key pair named SshKey.</li>
     * <li><code>SshKey</code>: queries the key pair named SshKey.</li>
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
     * <p>The number of the page to return. Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the key pair. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <blockquote>
     * <p> Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
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
         * <p>The key of tag N of the key pair. Valid values of N: 1 to 20.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that are bound with this tag can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that are bound with all these tags can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the key pair. Valid values of N: 1 to 20.</p>
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

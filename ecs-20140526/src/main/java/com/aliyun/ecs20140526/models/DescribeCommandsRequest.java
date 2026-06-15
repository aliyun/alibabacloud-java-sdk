// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsRequest extends TeaModel {
    /**
     * <p>The ID of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz01272yr52****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The encoding format for the <code>CommandContent</code> and <code>Output</code> values in the response. Valid values:</p>
     * <ul>
     * <li><p>PlainText: returns the raw script content and output.</p>
     * </li>
     * <li><p>Base64: returns the Base64-encoded script content and output.</p>
     * </li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The description of the command.</p>
     * <ul>
     * <li><p>If you specify the <code>Provider</code> parameter to query public commands, fuzzy search is supported by default.</p>
     * </li>
     * <li><p>If you do not specify the <code>Provider</code> parameter to query private commands, fuzzy search is supported. You can use an asterisk (\*) as a wildcard. For example, <code>test*</code> returns all commands whose descriptions start with <code>test</code>, <code>*test</code> returns all commands whose descriptions end with <code>test</code>, and <code>*test*</code> returns all commands whose descriptions contain <code>test</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to return only the latest version of public commands. This parameter does not affect private commands.</p>
     * <ul>
     * <li><p>true: returns only the latest version of public commands.</p>
     * </li>
     * <li><p>false: returns all versions of public commands.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Latest")
    public Boolean latest;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the command.</p>
     * <ul>
     * <li><p>If you specify the <code>Provider</code> parameter to query public commands, fuzzy search is supported by default.</p>
     * </li>
     * <li><p>If you do not specify the <code>Provider</code> parameter to query private commands, fuzzy search is supported. You can use an asterisk (\*) as a wildcard. For example, <code>command*</code> returns all commands whose names start with <code>command</code>, <code>*command</code> returns all commands whose names end with <code>command</code>, and <code>*command*</code> returns all commands whose names contain <code>command</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token for the next page of results. To retrieve the next page, set this parameter to the <code>NextToken</code> value from a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter is being deprecated. We recommend using NextToken and MaxResults for pagination instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is being deprecated. We recommend using NextToken and MaxResults for pagination instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The provider of the public command.</p>
     * <ul>
     * <li><p>If you omit this parameter, the operation queries your private commands by default.</p>
     * </li>
     * <li><p>Set this parameter to <code>AlibabaCloud</code> to query all public commands from Alibaba Cloud.</p>
     * </li>
     * <li><p>If you set the value to a specific provider, the public commands from that provider are queried. For example:</p>
     * <ul>
     * <li><p>If you set <code>Provider</code> to <code>AlibabaCloud.ECS.GuestOS</code>, the public commands provided by AlibabaCloud.ECS.GuestOS are queried.</p>
     * </li>
     * <li><p>If you set <code>Provider</code> to <code>AlibabaCloud.ECS.GuestOSDiagnose</code>, the public commands provided by AlibabaCloud.ECS.GuestOSDiagnose are queried.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AlibabaCloud</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The ID of the region. To view the latest list of regions, call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the command belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags used to filter commands.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCommandsRequestTag> tag;

    /**
     * <p>The type of the command. Valid values:</p>
     * <ul>
     * <li><p>RunBatScript: A Bat script for Windows instances.</p>
     * </li>
     * <li><p>RunPowerShellScript: A PowerShell script for Windows instances.</p>
     * </li>
     * <li><p>RunShellScript: A Shell script for Linux instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCommandsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandsRequest self = new DescribeCommandsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommandsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DescribeCommandsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeCommandsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCommandsRequest setLatest(Boolean latest) {
        this.latest = latest;
        return this;
    }
    public Boolean getLatest() {
        return this.latest;
    }

    public DescribeCommandsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCommandsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCommandsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCommandsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCommandsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCommandsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommandsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCommandsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public DescribeCommandsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCommandsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCommandsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCommandsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCommandsRequest setTag(java.util.List<DescribeCommandsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCommandsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeCommandsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeCommandsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. You can specify up to 20 tags. The tag key cannot be an empty string.</p>
         * <p>A query can return a maximum of 1,000 resources that match the specified tags. If more than 1,000 resources match, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query all matching resources.</p>
         * <p>The key can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tags. The tag value can be an empty string.</p>
         * <p>The value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCommandsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommandsRequestTag self = new DescribeCommandsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCommandsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCommandsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

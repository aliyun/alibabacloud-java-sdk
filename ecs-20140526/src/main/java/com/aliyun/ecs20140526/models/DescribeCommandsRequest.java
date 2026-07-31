// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsRequest extends TeaModel {
    /**
     * <p>The command ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz01272yr52****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The encoding mode of the CommandContent and Output fields in the response. Valid values:</p>
     * <ul>
     * <li>PlainText: returns the original script content and output.</li>
     * <li>Base64: returns Base64-encoded script content and output.</li>
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
     * <li><p>If the Provider parameter is specified parameter query public commands, fuzzy match is supported by default.</p>
     * </li>
     * <li><p>If the Provider parameter is not specified parameter query private commands, fuzzy match is supported. For example, enter <code>test*</code> to search for all commands whose descriptions start with <code>test</code>, enter <code>*test</code> to search for all commands whose descriptions end with <code>test</code>, or enter <code>*test*</code> to search for all commands whose descriptions contain <code>test</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to query only the latest version of public commands when the query results include public commands. This parameter does not affect the query of private commands.</p>
     * <ul>
     * <li><p>true: queries only the latest version of public commands.</p>
     * </li>
     * <li><p>false: queries all versions of public commands.</p>
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
     * <p>The maximum number of entries per page for paging queries.</p>
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
     * <li><p>If the Provider parameter is specified parameter query public commands, fuzzy match is supported by default.</p>
     * </li>
     * <li><p>If the Provider parameter is not specified parameter query private commands, fuzzy match is supported. For example, enter <code>command*</code> to search for all commands whose names start with <code>command</code>, enter <code>*command</code> to search for all commands whose names end with <code>command</code>, or enter <code>*command*</code> to search for all commands whose names contain <code>command</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
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
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults to perform paging queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is about to be deprecated. Use NextToken and MaxResults to perform paging queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The provider of the public command. Valid values:</p>
     * <ul>
     * <li>If you do not specify this parameter, all Cloud Assistant commands that you manually created are queried by default.</li>
     * <li>If you set this parameter to <code>AlibabaCloud</code>, all public commands provided by Alibaba Cloud are queried.</li>
     * <li>If you set this parameter to a specific public command provider, all public commands provided by the provider are queried. Examples:<ul>
     * <li>If you set Provider to <code>AlibabaCloud.ECS.GuestOS</code>, all public commands provided by <code>AlibabaCloud.ECS.GuestOS</code> are queried.</li>
     * <li>If you set Provider to <code>AlibabaCloud.ECS.GuestOSDiagnose</code>, all public commands provided by <code>AlibabaCloud.ECS.GuestOSDiagnose</code> are queried.</li>
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
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCommandsRequestTag> tag;

    /**
     * <p>The type of the command. Valid values: </p>
     * <ul>
     * <li>RunBatScript: Bat script that runs on Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell script that runs on Windows instances.</li>
     * <li>RunShellScript: shell script that runs on Linux instances.</li>
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
         * <p>The tag key of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count with the tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count with all the specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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

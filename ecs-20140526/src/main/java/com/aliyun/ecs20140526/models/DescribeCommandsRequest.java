// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCommandsRequest extends TeaModel {
    // The ID of the command.
    @NameInMap("CommandId")
    public String commandId;

    // The encoding mode of the `CommandContent` and `Output` response parameters. Valid values:
    // 
    // *   PlainText: returns the original command content and command output.
    // *   Base64: returns the Base64-encoded command content and command output.
    // 
    // Default value: Base64.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // >  This parameter is deprecated and does not take effect.
    @NameInMap("Description")
    public String description;

    // Specifies whether to query only the latest version of common commands if common commands are queried. This parameter does not affect the query for private commands. Valid values:
    // 
    // *   true: queries only the latest version of common commands.
    // *   false: queries all versions of common commands.
    // 
    // Default value: false.
    @NameInMap("Latest")
    public Boolean latest;

    // The name of the command. Partial command names are not supported.
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries to return per page.
    // 
    // Maximum value: 50.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Long pageSize;

    // The provider of the common command. Take note of the following items:
    // 
    // *   If you do not specify this parameter, all the commands that you created are queried.
    // 
    // *   If you set this parameter to `AlibabaCloud`, all the common commands provided by Alibaba Cloud are queried.
    // 
    // *   If you set this parameter to a specific provider, all the common commands provided by the provider are queried, such as the following ones:
    // 
    //     *   If you set `Provider` to AlibabaCloud.ECS.GuestOS, all the common commands provided by `AlibabaCloud.ECS.GuestOS` are queried.
    //     *   If you set `Provider` to AlibabaCloud.ECS.GuestOSDiagnose, all the common commands provided by `AlibabaCloud.ECS.GuestOSDiagnose` are queried.
    @NameInMap("Provider")
    public String provider;

    // The region ID of the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeCommandsRequestTag> tag;

    // The command type. Valid values:
    // 
    // *   RunBatScript: batch command, applicable to Windows instances
    // *   RunPowerShellScript: PowerShell command, applicable to Windows instances
    // *   RunShellScript: shell command, applicable to Linux instances
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

    public DescribeCommandsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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
        // The key of tag N of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        // 
        // The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the command. Valid values of N: 1 to 20. The tag value can be an empty string.
        // 
        // The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.
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

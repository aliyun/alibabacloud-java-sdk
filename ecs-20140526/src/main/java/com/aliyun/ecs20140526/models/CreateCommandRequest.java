// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The Base64-encoded content of the command.</p>
     * <ul>
     * <li><p>The value of this parameter must be Base64-encoded, and the script content cannot exceed 18 KB in size after Base64 encoding.</p>
     * </li>
     * <li><p>The command content supports custom parameters. To enable the custom parameter feature, set <code>EnableParameter=true</code>:</p>
     * <ul>
     * <li>Custom parameters are defined by enclosing them in <code>{{}}</code>. Spaces and line breaks before and after the parameter name within <code>{{}}</code> are ignored.</li>
     * <li>The number of custom parameters cannot exceed 20.</li>
     * <li>Custom parameter names can contain letters (a-z, A-Z), digits (0-9), hyphens (-), and underscores (_). The acs:: prefix for specifying non-built-in environment parameters is not supported. Other characters are not supported. Parameter names are case-insensitive.</li>
     * <li>Each parameter name cannot exceed 64 bytes in length.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment parameters as custom parameters. When the command is run, Cloud Assistant automatically replaces them with the corresponding values from the environment without requiring manual assignment. The following built-in environment parameters are supported:</p>
     * <ul>
     * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
     * </li>
     * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. When a command is sent to multiple instances and you want to use <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. When a command is sent to multiple instances and you want to use <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than:</p>
     * <ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InvokeId}}</code>: the command execution ID. To use <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::CommandId}}</code>: the command ID. When you run a command by calling the <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation and want to use <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyAxMjM=</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The encoding mode of the command content (CommandContent). Valid values:</p>
     * <ul>
     * <li><p>PlainText: no encoding. The content is transmitted in plaintext.</p>
     * </li>
     * <li><p>Base64: Base64 encoding.</p>
     * </li>
     * </ul>
     * <p>Default value: Base64.</p>
     * <blockquote>
     * <p>If an invalid value is specified, it is treated as Base64.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The command description. All character sets are supported. The description cannot exceed 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the command uses custom parameters.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The bootstrap program for script execution. The value cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The command name. All character sets are supported. The name cannot exceed 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCommandRequestTag> tag;

    /**
     * <p>The maximum timeout period for the command to run on the ECS instance. Unit: seconds. If the command cannot be run for any reason, a timeout occurs. After the timeout, the command process is forcefully terminated by canceling the PID of the command.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The type of the command. Valid values: </p>
     * <ul>
     * <li>RunBatScript: creates a Bat script to run on Windows instances.</li>
     * <li>RunPowerShellScript: creates a PowerShell script to run on Windows instances.</li>
     * <li>RunShellScript: creates a Shell script to run on Linux instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The directory where the command is run on the ECS instance. The value cannot exceed 200 characters in length.</p>
     * <p>Default value: </p>
     * <ul>
     * <li>Linux instances: the home directory of the root user, which is <code>/root</code>.  </li>
     * <li>Windows instances: the directory where the Cloud Assistant Agent process is located, such as <code>C:\\Windows\\System32</code>.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to a different directory, make sure that the directory exists on the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/user</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static CreateCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandRequest self = new CreateCommandRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public CreateCommandRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public CreateCommandRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCommandRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public CreateCommandRequest setLauncher(String launcher) {
        this.launcher = launcher;
        return this;
    }
    public String getLauncher() {
        return this.launcher;
    }

    public CreateCommandRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCommandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCommandRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCommandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCommandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCommandRequest setTag(java.util.List<CreateCommandRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCommandRequestTag> getTag() {
        return this.tag;
    }

    public CreateCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public CreateCommandRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateCommandRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class CreateCommandRequestTag extends TeaModel {
        /**
         * <p>The tag key of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources that have all specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query resources.</p>
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

        public static CreateCommandRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCommandRequestTag self = new CreateCommandRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCommandRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCommandRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

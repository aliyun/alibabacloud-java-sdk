// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The Base64-encoded content of the command. Take note of the following items:</p>
     * <ul>
     * <li><p>The value must be Base64-encoded and cannot exceed 18 KB in size.</p>
     * </li>
     * <li><p>You can use custom parameters in the command content. To enable the custom parameter feature, you must set <code>EnableParameter</code> to true.</p>
     * <ul>
     * <li>Custom parameters are defined in the <code>{{}}</code> format. Within <code>{{}}</code>, the spaces and line feeds before and after the parameter names are ignored.</li>
     * <li>You can specify up to 20 custom parameters.</li>
     * <li>A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is case-insensitive. The ACS:: prefix cannot be used to specify non-built-in environment parameters.</li>
     * <li>Each custom parameter name can be up to 64 bytes in length.</li>
     * </ul>
     * </li>
     * <li><p>You can specify built-in environment parameters as custom parameters in a command. When you run the command, Cloud Assistant automatically uses the environment parameter values for the custom parameters. You can specify the following built-in environment variables:</p>
     * <ul>
     * <li><p><code>{{ACS::RegionId}}</code>: the region ID.</p>
     * </li>
     * <li><p><code>{{ACS::AccountId}}</code>: the UID of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><code>{{ACS::InstanceId}}</code>: the instance ID. If you want to run the command on multiple instances and specify <code>{{ACS::InstanceId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InstanceName}}</code>: the instance name. If you want to run the command on multiple instances and specify <code>{{ACS::InstanceName}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::InvokeId}}</code>: the ID of the task. If you want to specify <code>{{ACS::InvokeId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
     * </ul>
     * </li>
     * <li><p><code>{{ACS::CommandId}}</code>: the command ID. If you want to call the <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation to run the command and specify <code>{{ACS::CommandId}}</code> as a built-in environment parameter, make sure that the Cloud Assistant Agent version is not earlier than the following versions:</p>
     * <ul>
     * <li>Linux: 2.2.3.309</li>
     * <li>Windows: 2.1.3.309</li>
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
     * <li>PlainText: The command content is not encoded.</li>
     * <li>Base64: The command content is Base64-encoded.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * <blockquote>
     * <p>If the specified value of this parameter is invalid, Base64 is used by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The description of the command. The description supports all character sets and can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to use custom parameters in the command.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
     */
    @NameInMap("Launcher")
    public String launcher;

    /**
     * <p>The name of the command. The name supports all character sets and can be up to 128 characters in length.</p>
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
     * <p>The ID of the region in which to create the command. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the command.</p>
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
     * <p>The tags to add to the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCommandRequestTag> tag;

    /**
     * <p>he maximum timeout period for the command execution on the instance. Unit: seconds. When a command that you created cannot be run, the command times out. When a command execution times out, Cloud Assistant Agent forcefully terminates the command process by canceling the PID. </p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>RunBatScript: batch commands. These commands are applicable to Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell commands. These commands are applicable to Windows instances.</li>
     * <li>RunShellScript: shell commands. These commands are applicable to Linux instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The execution path of the command on ECS instances. The value can be up to 200 characters in length.</p>
     * <p>Default values:</p>
     * <ul>
     * <li>For Linux instance, the default value is the home directory of the root user, which is the <code>/root</code> directory.</li>
     * <li>For Windows instances, the default value is the directory where the Cloud Assistant Agent process resides, such as <code>C:\\Windows\\System32\\</code>.</li>
     * </ul>
     * <blockquote>
     * <p> If you set WorkingDir to a directory other than default ones, make sure that the directory exists on the instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/root/</p>
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
         * <p>The key of tag N. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags, call <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandRequest extends TeaModel {
    /**
     * <p>The working directory of the command on the instance.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   For Linux instances, the default value is the home directory of the root user, which is the `/root` directory.</p>
     * <p>*   For Windows instances, the default value is the directory where the Cloud Assistant client process resides. Example: `C:\Windows\System32\`.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The tags to add to the command.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>The command type. Valid values:</p>
     * <br>
     * <p>*   RunBatScript: batch commands. These commands are applicable to Windows instances.</p>
     * <p>*   RunPowerShellScript: PowerShell commands. These commands are applicable to Windows instances.</p>
     * <p>*   RunShellScript: shell commands. These commands are applicable to Linux instances.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The encoding mode of the command content (CommandContent). Valid values:</p>
     * <br>
     * <p>*   PlainText: The command content is not encoded.</p>
     * <p>*   Base64: The command content is Base64-encoded.</p>
     * <br>
     * <p>Default value: Base64.</p>
     * <br>
     * <p>> If the specified value of this parameter is invalid, Base64 is used by default.</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The description of the command. The description supports all character sets and can be up to 512 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the command. The name supports all character sets and can be up to 128 characters in length.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Tag N to add to the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCommandRequestTag> tag;

    /**
     * <p>Specifies whether to use custom parameters in the command.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The Base64-encoded content of the command.</p>
     * <br>
     * <p>*   The parameter value must be Base64-encoded and cannot exceed 18 KB in size.</p>
     * <br>
     * <p>*   Custom parameters can be added to the command. To enable the custom parameter feature, you must set `EnableParameter` to true.</p>
     * <br>
     * <p>    *   Custom parameters are defined in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>    *   The number of custom parameters cannot exceed 20.</p>
     * <p>    *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive.</p>
     * <p>    *   Each custom parameter name cannot exceed 64 bytes in length.</p>
     * <br>
     * <p>*   You can specify built-in environment parameters as custom parameters. Then, when you run the command, these parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:</p>
     * <br>
     * <p>    *   `{{ACS::RegionId}}`: the ID of the region.</p>
     * <br>
     * <p>    *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.</p>
     * <br>
     * <p>    *   `{{ACS::InstanceId}}`: the ID of the instance. When the command is run on multiple instances, if you want to specify `{{ACS::InstanceId}}` as a built-in environment variable, make sure that the version of the Cloud Assistant client is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::InstanceName}}`: the name of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.344</p>
     * <p>        *   Windows: 2.1.3.344</p>
     * <br>
     * <p>    *   `{{ACS::InvokeId}}`: the ID of the command task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment variable, make sure that the version of the Cloud Assistant client is not earlier than the following one:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     * <br>
     * <p>    *   `{{ACS::CommandId}}`: the ID of the command. When you call the [RunCommand](~~141751~~) operation, if you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:</p>
     * <br>
     * <p>        *   Linux: 2.2.3.309</p>
     * <p>        *   Windows: 2.1.3.309</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>/root/</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static CreateCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandRequest self = new CreateCommandRequest();
        return TeaModel.build(map, self);
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
         * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <br>
         * <p>It can be up to 128 characters in length and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the command.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandRequest extends TeaModel {
    // The Base64-encoded content of the command.
    // 
    // *   The parameter value must be Base64-encoded and cannot exceed 18 KB in size.
    // 
    // *   The command content can be specified by using custom parameters. To enable the custom parameter feature, you must set `EnableParameter` to true.
    // 
    //     *   Custom parameters are defined in the `{{}}` format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.
    //     *   The number of custom parameters cannot exceed 20.
    //     *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive.
    //     *   Each custom parameter name cannot exceed 64 bytes in length.
    // 
    // *   You can specify built-in environment parameters as custom parameters. Then, when you run the command, these parameters are automatically specified by Cloud Assistant. You can specify the following built-in environment parameters:
    // 
    //     *   `{{ACS::RegionId}}`: the ID of the region.
    // 
    //     *   `{{ACS::AccountId}}`: the UID of the Alibaba Cloud account.
    // 
    //     *   `{{ACS::InstanceId}}`: the ID of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:
    // 
    //         *   Linux: 2.2.3.309
    //         *   Windows: 2.1.3.309
    // 
    //     *   `{{ACS::InstanceName}}`: the name of the instance. If you want to run the command on multiple instances and specify `{{ACS::InstanceName}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:
    // 
    //         *   Linux: 2.2.3.344
    //         *   Windows: 2.1.3.344
    // 
    //     *   `{{ACS::InvokeId}}`: the ID of the command execution task. If you want to specify `{{ACS::InvokeId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:
    // 
    //         *   Linux: 2.2.3.309
    //         *   Windows: 2.1.3.309
    // 
    //     *   `{{ACS::CommandId}}`: the ID of the command. When you call the [RunCommand](~~141751~~) operation, if you want to specify `{{ACS::CommandId}}` as a built-in environment parameter, make sure that the version of the Cloud Assistant client is not earlier than the following ones:
    // 
    //         *   Linux: 2.2.3.309
    //         *   Windows: 2.1.3.309
    @NameInMap("CommandContent")
    public String commandContent;

    // The encoding mode of the command content (CommandContent). Valid values:
    // 
    // *   PlainText: The command content is not encoded.
    // *   Base64: The command content is Base64-encoded.
    // 
    // Default value: Base64.
    // 
    // >  If the specified value of this parameter is invalid, Base64 is used by default.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // The description of the command. The description supports all character sets and can be up to 512 characters in length.
    @NameInMap("Description")
    public String description;

    // Specifies whether to use custom parameters in the command.
    // 
    // Default value: false.
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    // The name of the command. The name supports all character sets and can be up to 128 characters in length.
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the region in which to create the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreateCommandRequestTag> tag;

    // The maximum timeout period for the command execution on the instance. Unit: seconds. When a command cannot be run, a timeout error occurs. After that, the command process is forcefully terminated by canceling the PID of the command.
    // 
    // Default value: 60.
    @NameInMap("Timeout")
    public Long timeout;

    // The type of the command. Valid values:
    // 
    // *   RunBatScript: batch commands. These commands are applicable to Windows instances.
    // *   RunPowerShellScript: PowerShell commands. These commands are applicable to Windows instances.
    // *   RunShellScript: shell commands. These commands are applicable to Linux instances.
    @NameInMap("Type")
    public String type;

    // The working directory of the command on the instance.
    // 
    // Default value:
    // 
    // *   Linux instance: the home directory of the root user, which is the `/root` directory.
    // *   Windows instance: the directory where the Cloud Assistant client process resides, such as `C:\Windows\System32\`.
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
        @NameInMap("Key")
        public String key;

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

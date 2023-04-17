// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>The content of the file. The content must not exceed 32 KB in size after it is encoded in Base64.</p>
     * <br>
     * <p>*   If `ContentType` is set to `PlainText`, the Content value is in plaintext.</p>
     * <p>*   If `ContentType` is set to `Base64`, the Content value is Base64-encoded.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The content type of the file. Valid values:</p>
     * <br>
     * <p>*   PlainText: The command content is not encoded.</p>
     * <p>*   Base64: The command content is Base64-encoded.</p>
     * <br>
     * <p>Default value: PlainText.</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The description of the file. The description supports all character sets and can be up to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The user group of the file. This parameter takes effect only on Linux instances. Default value: root.</p>
     */
    @NameInMap("FileGroup")
    public String fileGroup;

    /**
     * <p>The permissions on the file. This parameter takes effect only on Linux instances. You can configure this parameter in the same way as you configure the chmod command.</p>
     * <br>
     * <p>Default value: 0644, which indicates that the owner of the file has the read and write permissions on the file and that the user group of the file and other users have only the read permissions on the file.</p>
     */
    @NameInMap("FileMode")
    public String fileMode;

    /**
     * <p>The owner of the file. This parameter takes effect only on Linux instances. Default value: root.</p>
     */
    @NameInMap("FileOwner")
    public String fileOwner;

    /**
     * <p>The IDs of instances to which to send the file. A maximum of 50 instance IDs can be specified.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The name of the file. The name supports all character sets and can be up to 255 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to overwrite a file in the destination directory if the file has the same name as the sent file.</p>
     * <br>
     * <p>*   true: overwrites the file.</p>
     * <p>*   false: does not overwrite the file.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance to which to send the file. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group for send files. When specify this parameter:</p>
     * <br>
     * <p>- The InstanceId of the ECS instance must belongs to the resource group.</p>
     * <p>- Support via the parameter to filter out results of send file(via Call [DescribeSendFileResults](~~184117~~)).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<SendFileRequestTag> tag;

    /**
     * <p>The destination directory on the instance to which to send the file. If the specified directory does not exist, the system creates the directory on the instance.</p>
     */
    @NameInMap("TargetDir")
    public String targetDir;

    /**
     * <p>The timeout period for sending the file. Unit: seconds.</p>
     * <br>
     * <p>*   A timeout error occurs when a file cannot be sent because the process slows down or because a specific module or the Cloud Assistant client does not exist.</p>
     * <p>*   If the specified timeout period is less than 10 seconds, the system automatically sets the timeout period to 10 seconds to ensure that the file is sent to the instances.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static SendFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFileRequest self = new SendFileRequest();
        return TeaModel.build(map, self);
    }

    public SendFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendFileRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SendFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SendFileRequest setFileGroup(String fileGroup) {
        this.fileGroup = fileGroup;
        return this;
    }
    public String getFileGroup() {
        return this.fileGroup;
    }

    public SendFileRequest setFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }
    public String getFileMode() {
        return this.fileMode;
    }

    public SendFileRequest setFileOwner(String fileOwner) {
        this.fileOwner = fileOwner;
        return this;
    }
    public String getFileOwner() {
        return this.fileOwner;
    }

    public SendFileRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public SendFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SendFileRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public SendFileRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SendFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SendFileRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SendFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendFileRequest setTag(java.util.List<SendFileRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<SendFileRequestTag> getTag() {
        return this.tag;
    }

    public SendFileRequest setTargetDir(String targetDir) {
        this.targetDir = targetDir;
        return this;
    }
    public String getTargetDir() {
        return this.targetDir;
    }

    public SendFileRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public static class SendFileRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SendFileRequestTag build(java.util.Map<String, ?> map) throws Exception {
            SendFileRequestTag self = new SendFileRequestTag();
            return TeaModel.build(map, self);
        }

        public SendFileRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SendFileRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

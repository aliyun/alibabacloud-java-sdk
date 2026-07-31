// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The content of the file. The file content cannot exceed 32 KB after Base64 encoding.</p>
     * <ul>
     * <li>If <code>ContentType</code> is set to <code>PlainText</code>, this parameter specifies the plain text content.</li>
     * <li>If <code>ContentType</code> is set to <code>Base64</code>, this parameter specifies the Base64-encoded content.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>#!/bin/bash  echo &quot;Current User is :&quot;  echo $(ps | grep &quot;$$&quot; | awk \&quot;{print $2}\&quot;)  --------  oss://bucketName/objectName</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The content type of the file. Valid values:</p>
     * <ul>
     * <li>PlainText: plain text.</li>
     * <li>Base64: Base64-encoded.</li>
     * </ul>
     * <p>Default value: PlainText.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The description of the file. The full character set is supported. The description cannot exceed 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test file.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The group of the file. This parameter takes effect only on Linux instances. Default value: root. The value cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you specify a different user group, make sure that the user group exists on the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FileGroup")
    public String fileGroup;

    /**
     * <p>The permissions on the file. This parameter takes effect only on Linux instances. You can configure this parameter in the same way as you run the chmod command.</p>
     * <p>Default value: 0644, which indicates that the owner has read and write permissions, and the group and other users have read-only permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>0644</p>
     */
    @NameInMap("FileMode")
    public String fileMode;

    /**
     * <p>The owner of the file. This parameter takes effect only on Linux instances. Default value: root. The value cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you specify a different user, make sure that the user exists on the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FileOwner")
    public String fileOwner;

    /**
     * <p>The IDs of the ECS instances to which you want to send the file. You can specify up to 50 instance IDs. Valid values of N: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp185dy2o3o6n****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The name of the file. The full character set is supported. The name cannot exceed 255 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file.txt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to overwrite a file with the same name in the destination directory. Valid values:</p>
     * <ul>
     * <li>true: Overwrite the file.</li>
     * <li>false: Do not overwrite the file.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the target ECS instances. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group for file sending. If you specify this parameter:</p>
     * <ul>
     * <li><p>The ECS instances specified by InstanceId must belong to this resource group.</p>
     * </li>
     * <li><p>You can filter file sending results by specifying this parameter when you call <a href="https://help.aliyun.com/document_detail/184117.html">DescribeSendFileResults</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
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
    public java.util.List<SendFileRequestTag> tag;

    /**
     * <p>The destination directory on the target ECS instances where the file is sent. If the directory does not exist, it is automatically created. The directory path cannot exceed 255 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("TargetDir")
    public String targetDir;

    /**
     * <p>The timeout period for sending the file. Unit: seconds.</p>
     * <ul>
     * <li>A timeout may occur when the file cannot be sent due to a process issue, a missing module, or a missing Cloud Assistant Agent.</li>
     * <li>If the specified timeout period is less than 10 seconds, the system automatically sets the timeout period to 10 seconds to ensure successful delivery.</li>
     * </ul>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static SendFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFileRequest self = new SendFileRequest();
        return TeaModel.build(map, self);
    }

    public SendFileRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
        /**
         * <p>The key of the tag for file sending. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count with this tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count with all the specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, call <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> to query the resources.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag for file sending. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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

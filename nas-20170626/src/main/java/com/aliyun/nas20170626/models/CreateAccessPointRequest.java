// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessPointRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required for a General-purpose File Storage NAS (NAS) file system.</p>
     * <p>The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_VPC_GROUP_NAME</p>
     */
    @NameInMap("AccessGroup")
    public String accessGroup;

    /**
     * <p>The name of the access point.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AccessPointName")
    public String accessPointName;

    /**
     * <p>Specifies whether to enable the RAM policy. Valid values:</p>
     * <ul>
     * <li>true: The RAM policy is enabled.</li>
     * <li>false (default): The RAM policy is disabled.</li>
     * </ul>
     * <blockquote>
     * <p> After the RAM policy is enabled for access points, no RAM user is allowed to use access points to mount and access data by default. To use access points to mount and access data as a RAM user, you must grant the related access permissions to the RAM user. If the RAM policy is disabled, access points can be anonymously mounted. For more information about how to configure permissions on access points, see <a href="https://help.aliyun.com/document_detail/2545998.html">Configure a policy for the access point</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledRam")
    public Boolean enabledRam;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the owner group.</p>
     * <p>This parameter is required if the RootDirectory directory does not exist.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerGroupId")
    public Integer ownerGroupId;

    /**
     * <p>The owner ID.</p>
     * <p>This parameter is required if the RootDirectory directory does not exist.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerUserId")
    public Integer ownerUserId;

    /**
     * <p>The Portable Operating System Interface for UNIX (POSIX) permission. Default value: 0777.</p>
     * <p>This field takes effect only if you specify the OwnerUserId and OwnerGroupId parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>0777</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The ID of the POSIX user group.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PosixGroupId")
    public Integer posixGroupId;

    /**
     * <p>The secondary user group. Separate multiple user group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>123,345</p>
     */
    @NameInMap("PosixSecondaryGroupIds")
    public String posixSecondaryGroupIds;

    /**
     * <p>The ID of the POSIX user.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PosixUserId")
    public Integer posixUserId;

    /**
     * <p>The root directory of the access point. The default value is /. If the directory does not exist, you must also specify the OwnerUserId and OwnerGroupId parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("RootDirectory")
    public String rootDirectory;

    /**
     * <p>The tags of the access point.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAccessPointRequestTag> tag;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zesj9afh3y518k9o****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zevmwkwyztjuoffg****</p>
     */
    @NameInMap("VswId")
    public String vswId;

    public static CreateAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPointRequest self = new CreateAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessPointRequest setAccessGroup(String accessGroup) {
        this.accessGroup = accessGroup;
        return this;
    }
    public String getAccessGroup() {
        return this.accessGroup;
    }

    public CreateAccessPointRequest setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }
    public String getAccessPointName() {
        return this.accessPointName;
    }

    public CreateAccessPointRequest setEnabledRam(Boolean enabledRam) {
        this.enabledRam = enabledRam;
        return this;
    }
    public Boolean getEnabledRam() {
        return this.enabledRam;
    }

    public CreateAccessPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateAccessPointRequest setOwnerGroupId(Integer ownerGroupId) {
        this.ownerGroupId = ownerGroupId;
        return this;
    }
    public Integer getOwnerGroupId() {
        return this.ownerGroupId;
    }

    public CreateAccessPointRequest setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateAccessPointRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public CreateAccessPointRequest setPosixGroupId(Integer posixGroupId) {
        this.posixGroupId = posixGroupId;
        return this;
    }
    public Integer getPosixGroupId() {
        return this.posixGroupId;
    }

    public CreateAccessPointRequest setPosixSecondaryGroupIds(String posixSecondaryGroupIds) {
        this.posixSecondaryGroupIds = posixSecondaryGroupIds;
        return this;
    }
    public String getPosixSecondaryGroupIds() {
        return this.posixSecondaryGroupIds;
    }

    public CreateAccessPointRequest setPosixUserId(Integer posixUserId) {
        this.posixUserId = posixUserId;
        return this;
    }
    public Integer getPosixUserId() {
        return this.posixUserId;
    }

    public CreateAccessPointRequest setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public String getRootDirectory() {
        return this.rootDirectory;
    }

    public CreateAccessPointRequest setTag(java.util.List<CreateAccessPointRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAccessPointRequestTag> getTag() {
        return this.tag;
    }

    public CreateAccessPointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateAccessPointRequest setVswId(String vswId) {
        this.vswId = vswId;
        return this;
    }
    public String getVswId() {
        return this.vswId;
    }

    public static class CreateAccessPointRequestTag extends TeaModel {
        /**
         * <p>The key of a tag. Limits:</p>
         * <ul>
         * <li>Cannot be null or an empty string.</li>
         * <li>Can be up to 128 characters in length.</li>
         * <li>Cannot start with aliyun or acs:.</li>
         * <li>Cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag. Limits:</p>
         * <ul>
         * <li>Cannot be null or an empty string.</li>
         * <li>Can be up to 128 characters in length.</li>
         * <li>Cannot contain http:// or https://.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAccessPointRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessPointRequestTag self = new CreateAccessPointRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAccessPointRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAccessPointRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

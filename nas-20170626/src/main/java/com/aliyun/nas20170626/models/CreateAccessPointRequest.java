// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessPointRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>This parameter is required if the file system is a General-purpose NAS file system.</p>
     * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
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
     * <p>The AgenticSpace ID.</p>
     * <blockquote>
     * <p>This parameter is required for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>agentic-229oypxjgpau2****</p>
     */
    @NameInMap("AgenticSpaceId")
    public String agenticSpaceId;

    /**
     * <p>Specifies whether to enable access point policy.
     * Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false (default): not enabled.</li>
     * </ul>
     * <blockquote>
     * <p>After you enable access point policy for the access point, all Resource Access Management (RAM) users are denied access to mount and access data through the access point by default. You must grant the corresponding access permissions through authorization and then mount and access the file system through the access point. After you disable access point policy, the access point allows anonymity mounting. For more information about how to configure access point permissions, see <a href="https://help.aliyun.com/document_detail/2545998.html">Configure access point policies</a>.</p>
     * </blockquote>
     * <blockquote>
     * <p>For Agentic file systems, this parameter must be set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnabledRam")
    public Boolean enabledRam;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The owner group ID.</p>
     * <p>This parameter is required if the RootDirectory directory does not exist.</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerGroupId")
    public Integer ownerGroupId;

    /**
     * <p>The owner user ID.</p>
     * <p>This parameter is required if the RootDirectory directory does not exist.</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerUserId")
    public Integer ownerUserId;

    /**
     * <p>The POSIX permission. Default value: &quot;0755&quot;. The value must be a four-digit octal number that starts with 0.</p>
     * <p>This parameter takes effect only after you specify the OwnerUserId and OwnerGroupId parameters.</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0755</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The POSIX group ID.</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PosixGroupId")
    public Integer posixGroupId;

    /**
     * <p>The secondary group IDs. Separate multiple group IDs with commas (,).</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123,345</p>
     */
    @NameInMap("PosixSecondaryGroupIds")
    public String posixSecondaryGroupIds;

    /**
     * <p>The POSIX user ID.</p>
     * <blockquote>
     * <p>Not supported for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PosixUserId")
    public Integer posixUserId;

    /**
     * <p>The root directory of the access point.
     * Default value: &quot;/&quot;. If the access point directory does not exist, you must also specify the OwnerUserId and OwnerGroupId parameters.</p>
     * <blockquote>
     * <p>Supported only for Agentic file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("RootDirectory")
    public String rootDirectory;

    /**
     * <p>The list of access point tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAccessPointRequestTag> tag;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
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

    public CreateAccessPointRequest setAgenticSpaceId(String agenticSpaceId) {
        this.agenticSpaceId = agenticSpaceId;
        return this;
    }
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
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
         * <p>The tag key.
         * Limits:</p>
         * <ul>
         * <li>Cannot be empty or an empty string.</li>
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
         * <p>The tag value.
         * Limits:</p>
         * <ul>
         * <li>Cannot be empty or an empty string.</li>
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

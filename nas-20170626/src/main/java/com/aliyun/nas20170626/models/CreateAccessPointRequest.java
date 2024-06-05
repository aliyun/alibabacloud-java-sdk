// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessPointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessGroup")
    public String accessGroup;

    @NameInMap("AccessPointName")
    public String accessPointName;

    @NameInMap("EnabledRam")
    public Boolean enabledRam;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("OwnerGroupId")
    public Integer ownerGroupId;

    @NameInMap("OwnerUserId")
    public Integer ownerUserId;

    @NameInMap("Permission")
    public String permission;

    @NameInMap("PosixGroupId")
    public Integer posixGroupId;

    @NameInMap("PosixSecondaryGroupIds")
    public String posixSecondaryGroupIds;

    @NameInMap("PosixUserId")
    public Integer posixUserId;

    @NameInMap("RootDirectory")
    public String rootDirectory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>This parameter is required.</p>
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

}

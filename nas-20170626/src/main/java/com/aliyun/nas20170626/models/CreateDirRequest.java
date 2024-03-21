// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDirRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("OwnerGroupId")
    public Integer ownerGroupId;

    @NameInMap("OwnerUserId")
    public Integer ownerUserId;

    @NameInMap("Permission")
    public String permission;

    @NameInMap("Recursion")
    public Boolean recursion;

    @NameInMap("RootDirectory")
    public String rootDirectory;

    public static CreateDirRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDirRequest self = new CreateDirRequest();
        return TeaModel.build(map, self);
    }

    public CreateDirRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDirRequest setOwnerGroupId(Integer ownerGroupId) {
        this.ownerGroupId = ownerGroupId;
        return this;
    }
    public Integer getOwnerGroupId() {
        return this.ownerGroupId;
    }

    public CreateDirRequest setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }

    public CreateDirRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public CreateDirRequest setRecursion(Boolean recursion) {
        this.recursion = recursion;
        return this;
    }
    public Boolean getRecursion() {
        return this.recursion;
    }

    public CreateDirRequest setRootDirectory(String rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public String getRootDirectory() {
        return this.rootDirectory;
    }

}

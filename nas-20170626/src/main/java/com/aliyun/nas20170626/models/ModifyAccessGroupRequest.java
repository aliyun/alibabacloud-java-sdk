// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupRequest extends TeaModel {
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    public static ModifyAccessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupRequest self = new ModifyAccessGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public ModifyAccessGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAccessGroupRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}

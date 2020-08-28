// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessGroupRequest extends TeaModel {
    @NameInMap("AccessGroupName")
    @Validation(required = true)
    public String accessGroupName;

    @NameInMap("AccessGroupType")
    @Validation(required = true)
    public String accessGroupType;

    @NameInMap("Description")
    public String description;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    public static CreateAccessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessGroupRequest self = new CreateAccessGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateAccessGroupRequest setAccessGroupType(String accessGroupType) {
        this.accessGroupType = accessGroupType;
        return this;
    }
    public String getAccessGroupType() {
        return this.accessGroupType;
    }

    public CreateAccessGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccessGroupRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}

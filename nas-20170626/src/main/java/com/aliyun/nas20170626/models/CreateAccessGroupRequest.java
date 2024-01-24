// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessGroupRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The name must be 3 to 64 characters in length.</p>
     * <p>*   The name must start with a letter and can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must be different from the name of the default permission group.</p>
     * <br>
     * <p>The default permission group for virtual private clouds (VPCs) is named DEFAULT_VPC_GROUP_NAME.</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The network type of the permission group. Valid value: **Vpc**.</p>
     */
    @NameInMap("AccessGroupType")
    public String accessGroupType;

    /**
     * <p>The description of the permission group.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   By default, the description of a permission group is the same as the name of the permission group. The description must be 2 to 128 characters in length.</p>
     * <p>*   The name must start with a letter and cannot start with `http://` or `https://`.</p>
     * <p>*   The description can contain digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard (default): General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     */
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

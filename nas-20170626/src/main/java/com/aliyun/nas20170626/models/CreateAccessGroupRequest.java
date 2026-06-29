// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessGroupRequest extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The name must be 3 to 64 characters in length.</li>
     * <li>The name must start with a letter and can contain letters, digits, underscores (_), or hyphens (-).</li>
     * <li>The name of the new permission group cannot be the same as the name of the default permission group.</li>
     * </ul>
     * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (default VPC permission group).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The type of the permission group. Set the value to <strong>Vpc</strong>, which indicates VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Vpc</p>
     */
    @NameInMap("AccessGroupType")
    public String accessGroupType;

    /**
     * <p>The description of the permission group.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description defaults to the permission group name and must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpctestaccessgroup</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>standard (default): General-purpose NAS.</li>
     * <li>extreme: Extreme NAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDirRequest extends TeaModel {
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
     * <p>The ID of the owner group for the directory. Valid values: 0 to 4294967295.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OwnerGroupId")
    public Integer ownerGroupId;

    /**
     * <p>The owner ID for the directory. Valid values: 0 to 4294967295.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerUserId")
    public Integer ownerUserId;

    /**
     * <p>The Portable Operating System Interface (POSIX) permissions applied to the root directory. The value is a valid octal number, such as 0755.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0755</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>Specifies whether to create a multi-level directory. Valid values:</p>
     * <ul>
     * <li>true (default): If no multi-level directory exists, directories are created level by level.</li>
     * <li>false: Only the last level of directory is created. An error message is returned because the parent directory does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Recursion")
    public Boolean recursion;

    /**
     * <p>The directory name.</p>
     * <ul>
     * <li>The directory must start with a forward slash (/).</li>
     * <li>The directory can contain digits and letters.</li>
     * <li>The directory can contain underscores (_), hyphens (-), and periods (.).</li>
     * <li>The directory cannot contain symbolic links, such as the current directory (.), the upper-level directory (..), and other symbolic links.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the root directory does not exist, configure the information for directory creation. The system then automatically creates the specified root directory based on your settings.</li>
     * <li>If the root directory exists, you do not need to configure the information for directory creation. The configurations for directory creation are ignored even if you configure the information.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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

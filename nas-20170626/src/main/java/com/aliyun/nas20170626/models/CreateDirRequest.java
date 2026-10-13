// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDirRequest extends TeaModel {
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
     * <p>The user group ID of the directory owner. Valid values: 0 to 4294967295.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OwnerGroupId")
    public Integer ownerGroupId;

    /**
     * <p>The user ID of the directory owner. Valid values: 0 to 4294967295.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OwnerUserId")
    public Integer ownerUserId;

    /**
     * <p>The POSIX permissions to apply to the root directory path. The value is a valid octal number, such as 0755.</p>
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
     * <li>true (default): If the multi-level directory does not exist, the system creates the directories level by level.</li>
     * <li>false: Only the last-level directory is created. If the parent directory does not exist, an error message is returned.</li>
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
     * <li>The name must start with a forward slash (/).</li>
     * <li>The name can contain digits and uppercase and lowercase letters.</li>
     * <li>The name can contain underscores (_), hyphens (-), or periods (.).</li>
     * <li>The path cannot contain symbolic links, such as the current directory (.), the parent directory (..), or other symbolic links.<blockquote>
     * <ul>
     * <li>If the root directory does not exist, configure the automatic creation information. The system automatically creates the specified root directory based on the settings.</li>
     * <li>If the root directory already exists, you do not need to configure the automatic creation information. If you configure the information, the automatic creation settings are ignored.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
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

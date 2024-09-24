// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the portable account. The ID must be a 16-digit string. The string can contain digits and lowercase letters.</p>
     * 
     * <strong>example:</strong>
     * <p>378cc7630f26****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>Specifies whether to share the directory. Valid values:</p>
     * <ul>
     * <li>false (default): does not share the directory.</li>
     * <li>true: shares the directory.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only if the Type parameter is set to Directory and the Owner parameter is not empty.</li>
     * <li>The permissions on a directory can be inherited by the owner. The owner has read and write permissions on the subdirectories and subfiles created in the directory, even if they are created by others.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OwnerAccessInheritable")
    public Boolean ownerAccessInheritable;

    /**
     * <p>The absolute path of the directory or file. The path must start and end with a forward slash (/) and must be 2 to 1024 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The type of the object. Valid values:</p>
     * <ul>
     * <li>File</li>
     * <li>Directory</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateFileRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateFileRequest setOwnerAccessInheritable(Boolean ownerAccessInheritable) {
        this.ownerAccessInheritable = ownerAccessInheritable;
        return this;
    }
    public Boolean getOwnerAccessInheritable() {
        return this.ownerAccessInheritable;
    }

    public CreateFileRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

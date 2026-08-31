// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The portable account ID.
     * Limit: The value is a 16-character string that supports digits and lowercase letters.</p>
     * 
     * <strong>example:</strong>
     * <p>378cc7630f26****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>Specifies whether to share directory permissions. Valid values:</p>
     * <ul>
     * <li>false (default): does not share directory permissions.</li>
     * <li>true: shares directory permissions.<blockquote>
     * <ul>
     * <li>This parameter takes effect only when Type is set to Directory and Owner is not empty.</li>
     * <li>The directory has inheritable Owner permissions. The Owner has read and write permissions on subdirectories and files created under this directory, even if they are created by other users.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OwnerAccessInheritable")
    public Boolean ownerAccessInheritable;

    /**
     * <p>The absolute path of the directory or file.</p>
     * <ul>
     * <li>The path must start and end with a forward slash (/).</li>
     * <li>The path must be 1 to 1,023 characters in length.</li>
     * <li>The path must be encoded in UTF-8.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The object type. Valid values:</p>
     * <ul>
     * <li>File: file.</li>
     * <li>Directory: directory.</li>
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

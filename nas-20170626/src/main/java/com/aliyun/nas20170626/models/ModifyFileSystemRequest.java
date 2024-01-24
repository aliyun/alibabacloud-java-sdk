// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the file system.</p>
     * <br>
     * <p>Limits:</p>
     * <br>
     * <p>*   The description must be 2 to 128 characters in length.</p>
     * <p>*   It must start with a letter but cannot start with `http://` or `https://`.</p>
     * <p>*   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>*   Sample ID of a General-purpose NAS file system: `31a8e4****`.</p>
     * <p>*   The IDs of Extreme NAS file systems must start with `extreme-`. Example: `extreme-0015****`.</p>
     * <p>*   The IDs of Cloud Paralleled File System (CPFS) file systems must start with `cpfs-`. Example: `cpfs-125487****`.</p>
     * <p>>CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static ModifyFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemRequest self = new ModifyFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}

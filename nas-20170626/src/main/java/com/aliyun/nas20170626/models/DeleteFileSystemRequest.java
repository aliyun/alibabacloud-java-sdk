// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFileSystemRequest extends TeaModel {
    /**
     * <p>The ID of the file system that you want to delete.</p>
     * <br>
     * <p>*   Sample ID of a General-purpose NAS file system: 31a8e4\\*\\*\\*\\*.</p>
     * <p>*   The IDs of Extreme NAS file systems must start with `extreme-`, for example, extreme-0015\\*\\*\\*\\*.</p>
     * <p>*   The IDs of Cloud Parallel File Storage (CPFS) file systems must start with `cpfs-`, for example, cpfs-00cb6fa094ca\\*\\*\\*\\*.</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DeleteFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileSystemRequest self = new DeleteFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}

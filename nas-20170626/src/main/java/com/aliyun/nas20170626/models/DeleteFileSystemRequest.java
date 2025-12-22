// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteFileSystemRequest extends TeaModel {
    /**
     * <p>The ID of the file system that you want to delete.</p>
     * <ul>
     * <li>Sample ID of a General-purpose NAS file system: 31a8e4\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>, for example, extreme-0015\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of Cloud Parallel File Storage (CPFS) file systems must start with <code>cpfs-</code>, for example, cpfs-00cb6fa094ca\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
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

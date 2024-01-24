// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteMountTargetRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>*   Sample ID of a General-purpose NAS file system: 31a8e4\*\*\*\*.</p>
     * <p>*   The IDs of Extreme NAS file systems must start with `extreme-`, for example, extreme-0015\*\*\*\*.</p>
     * <p>*   The IDs of Cloud Parallel File Storage (CPFS) file systems must start with `cpfs-`, for example, cpfs-125487\*\*\*\*.</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The domain name of the mount target.</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    public static DeleteMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountTargetRequest self = new DeleteMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteMountTargetRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

}

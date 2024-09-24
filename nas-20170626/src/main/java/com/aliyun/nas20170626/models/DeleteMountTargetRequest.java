// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteMountTargetRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>Sample ID of a General-purpose NAS file system: 31a8e4\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>, for example, extreme-0015\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of Cloud Parallel File Storage (CPFS) file systems must start with <code>cpfs-</code>, for example, cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <blockquote>
     * <p>CPFS file systems are available only on the China site (aliyun.com).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174494****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The domain name of the mount target.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174494b666-x****.cn-hangzhou.nas.aliyuncs.com</p>
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

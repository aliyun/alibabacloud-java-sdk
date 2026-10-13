// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteMountTargetRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>General-purpose NAS: 31a8e4\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>Extreme NAS: must start with <code>extreme-</code>, for example, extreme-0015\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>Cloud Parallel File Storage (CPFS): must start with <code>cpfs-</code>, for example, cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174494****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The mount target.</p>
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

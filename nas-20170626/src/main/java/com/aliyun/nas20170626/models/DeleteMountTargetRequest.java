// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteMountTargetRequest extends TeaModel {
    @NameInMap("FileSystemId")
    @Validation(required = true)
    public String fileSystemId;

    @NameInMap("MountTargetDomain")
    @Validation(required = true)
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

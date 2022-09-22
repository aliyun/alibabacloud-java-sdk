// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteFileSystemRequest extends TeaModel {
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static DeleteFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileSystemRequest self = new DeleteFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileSystemRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DeleteFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}

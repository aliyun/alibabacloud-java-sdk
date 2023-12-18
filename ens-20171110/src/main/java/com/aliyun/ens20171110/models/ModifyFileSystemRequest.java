// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyFileSystemRequest extends TeaModel {
    /**
     * <p>The description of the file system.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the file system.</p>
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

    public ModifyFileSystemRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public ModifyFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}

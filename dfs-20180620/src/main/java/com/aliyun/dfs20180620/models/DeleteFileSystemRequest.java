// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteFileSystemRequest extends TeaModel {
    /**
     * <p>The instance ID of the file system to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

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

    public DeleteFileSystemRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}

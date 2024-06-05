// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLogAnalysisRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLogAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogAnalysisRequest self = new DeleteLogAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogAnalysisRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteLogAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

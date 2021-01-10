// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class BatchDeleteWebHostingFilesRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    public static BatchDeleteWebHostingFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteWebHostingFilesRequest self = new BatchDeleteWebHostingFilesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteWebHostingFilesRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public BatchDeleteWebHostingFilesRequest setFilePaths(java.util.List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

}

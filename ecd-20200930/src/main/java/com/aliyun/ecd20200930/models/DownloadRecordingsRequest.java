// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DownloadRecordingsRequest extends TeaModel {
    @NameInMap("FilePath")
    public java.util.List<String> filePath;

    @NameInMap("RegionId")
    public String regionId;

    public static DownloadRecordingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingsRequest self = new DownloadRecordingsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingsRequest setFilePath(java.util.List<String> filePath) {
        this.filePath = filePath;
        return this;
    }
    public java.util.List<String> getFilePath() {
        return this.filePath;
    }

    public DownloadRecordingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeWebHostingFileRequest extends TeaModel {
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeWebHostingFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebHostingFileRequest self = new DescribeWebHostingFileRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebHostingFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public DescribeWebHostingFileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}

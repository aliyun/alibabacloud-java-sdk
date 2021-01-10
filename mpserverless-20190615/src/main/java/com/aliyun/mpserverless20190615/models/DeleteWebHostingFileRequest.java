// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteWebHostingFileRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("FilePath")
    public String filePath;

    public static DeleteWebHostingFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebHostingFileRequest self = new DeleteWebHostingFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWebHostingFileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DeleteWebHostingFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}

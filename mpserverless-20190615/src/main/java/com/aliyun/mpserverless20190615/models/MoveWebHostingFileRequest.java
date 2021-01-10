// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class MoveWebHostingFileRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    @NameInMap("TargetFilePath")
    public String targetFilePath;

    public static MoveWebHostingFileRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveWebHostingFileRequest self = new MoveWebHostingFileRequest();
        return TeaModel.build(map, self);
    }

    public MoveWebHostingFileRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public MoveWebHostingFileRequest setSourceFilePath(String sourceFilePath) {
        this.sourceFilePath = sourceFilePath;
        return this;
    }
    public String getSourceFilePath() {
        return this.sourceFilePath;
    }

    public MoveWebHostingFileRequest setTargetFilePath(String targetFilePath) {
        this.targetFilePath = targetFilePath;
        return this;
    }
    public String getTargetFilePath() {
        return this.targetFilePath;
    }

}

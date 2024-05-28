// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineArtifactUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("filePath")
    public String filePath;

    public static GetPipelineArtifactUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineArtifactUrlRequest self = new GetPipelineArtifactUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineArtifactUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetPipelineArtifactUrlRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}

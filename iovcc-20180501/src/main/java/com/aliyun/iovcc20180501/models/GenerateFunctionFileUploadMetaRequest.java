// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateFunctionFileUploadMetaRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileName")
    public String fileName;

    public static GenerateFunctionFileUploadMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFunctionFileUploadMetaRequest self = new GenerateFunctionFileUploadMetaRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFunctionFileUploadMetaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GenerateFunctionFileUploadMetaRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateOssUploadMetaRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Ext")
    public String ext;

    public static GenerateOssUploadMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssUploadMetaRequest self = new GenerateOssUploadMetaRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOssUploadMetaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GenerateOssUploadMetaRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}

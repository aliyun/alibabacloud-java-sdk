// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetOssUploadMetaRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Ext")
    public String ext;

    public static GetOssUploadMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadMetaRequest self = new GetOssUploadMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetOssUploadMetaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetOssUploadMetaRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetMediaMetaRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceURI")
    public String sourceURI;

    public static GetMediaMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMetaRequest self = new GetMediaMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaMetaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetMediaMetaRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}

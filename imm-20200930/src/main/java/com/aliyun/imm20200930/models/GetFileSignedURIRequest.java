// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileSignedURIRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("URI")
    public String URI;

    public static GetFileSignedURIRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileSignedURIRequest self = new GetFileSignedURIRequest();
        return TeaModel.build(map, self);
    }

    public GetFileSignedURIRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetFileSignedURIRequest setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}

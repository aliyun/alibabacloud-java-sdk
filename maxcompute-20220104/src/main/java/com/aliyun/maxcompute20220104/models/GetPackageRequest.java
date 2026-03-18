// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetPackageRequest extends TeaModel {
    @NameInMap("sourceProject")
    public String sourceProject;

    public static GetPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPackageRequest self = new GetPackageRequest();
        return TeaModel.build(map, self);
    }

    public GetPackageRequest setSourceProject(String sourceProject) {
        this.sourceProject = sourceProject;
        return this;
    }
    public String getSourceProject() {
        return this.sourceProject;
    }

}

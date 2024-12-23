// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetPackageRequest extends TeaModel {
    /**
     * <p>The project to which the package belongs. This parameter is required if the package is installed in the MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>projectB</p>
     */
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

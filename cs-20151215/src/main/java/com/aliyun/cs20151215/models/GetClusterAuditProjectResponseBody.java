// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAuditProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>k8s-log-cad1230511cbb4db4a488e58518******</p>
     */
    @NameInMap("sls_project_name")
    public String slsProjectName;

    public static GetClusterAuditProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAuditProjectResponseBody self = new GetClusterAuditProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterAuditProjectResponseBody setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

}

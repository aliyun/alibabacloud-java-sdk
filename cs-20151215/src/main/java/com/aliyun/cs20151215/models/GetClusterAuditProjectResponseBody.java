// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAuditProjectResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the cluster auditing feature is enabled for the cluster. </p>
     * <ul>
     * <li><code>true</code>: The cluster auditing feature is enabled for the cluster. </li>
     * <li><code>false</code>: The cluster auditing feature is disabled for the cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("audit_enabled")
    public Boolean auditEnabled;

    /**
     * <p>The SLS project in which the audit logs of the API server are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-cad1230511cbb4db4a488e58518******</p>
     */
    @NameInMap("sls_project_name")
    public String slsProjectName;

    public static GetClusterAuditProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAuditProjectResponseBody self = new GetClusterAuditProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterAuditProjectResponseBody setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return this.auditEnabled;
    }

    public GetClusterAuditProjectResponseBody setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterAuditLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable the cluster audit log feature. Valid values:</p>
     * <ul>
     * <li>false: enables the audit log feature or updates the audit log configurations.</li>
     * <li>true: disables the audit log feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable")
    public Boolean disable;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS project</a> where the <a href="https://help.aliyun.com/document_detail/48874.html">Logstore</a> for cluster audit logs is located.</p>
     * <ul>
     * <li><p>The default value is k8s-log-{clusterid}.</p>
     * </li>
     * <li><p>After you enable the cluster audit log feature, a Logstore for cluster audit logs is created in the specified SLS project.</p>
     * </li>
     * <li><p>If you need to change the SLS project after enabling the cluster audit log feature, you can use this parameter to specify a new SLS project. Only ACK managed clusters support changing the SLS project.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>k8s-log-c82e6987e2961451182edacd74faf****</p>
     */
    @NameInMap("sls_project_name")
    public String slsProjectName;

    public static UpdateClusterAuditLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAuditLogConfigRequest self = new UpdateClusterAuditLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAuditLogConfigRequest setDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }
    public Boolean getDisable() {
        return this.disable;
    }

    public UpdateClusterAuditLogConfigRequest setSlsProjectName(String slsProjectName) {
        this.slsProjectName = slsProjectName;
        return this;
    }
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

}

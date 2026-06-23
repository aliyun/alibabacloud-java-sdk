// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterAuditLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable the cluster audit log feature. Valid values:</p>
     * <ul>
     * <li><p>false: enables the audit log feature or updates the audit log configuration.</p>
     * </li>
     * <li><p>true: disables the audit log feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable")
    public Boolean disable;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS Project</a> that contains the <a href="https://help.aliyun.com/document_detail/48874.html">Logstore</a> for cluster audit logs.</p>
     * <ul>
     * <li><p>Default value: k8s-log-{clusterid}.</p>
     * </li>
     * <li><p>After you enable the cluster audit log feature, a Logstore for cluster audit logs is created in the specified SLS Project.</p>
     * </li>
     * <li><p>If you need to change the SLS Project after enabling the cluster audit log feature, use this parameter to specify a new SLS Project. Only ACK managed clusters support changing the SLS Project.</p>
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

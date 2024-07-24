// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterAuditLogConfigRequest extends TeaModel {
    /**
     * <p>Enable or disable the audit log feature.</p>
     * <ul>
     * <li>false: enables the audit log feature or updates the audit log configuration.</li>
     * <li>true: disables the audit log feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable")
    public Boolean disable;

    /**
     * <p>The <a href="https://help.aliyun.com/zh/sls/product-overview/project?spm=a2c4g.11186623.0.i3">SLS project</a> to which the <a href="https://help.aliyun.com/zh/sls/product-overview/logstore?spm=a2c4g.11186623.0.0.48287ce0jAUWWM">Logstore</a> belongs.</p>
     * <ul>
     * <li>Default value: k8s-log-{clusterid}.</li>
     * <li>After the cluster audit log feature is enabled, a Logstore is created in the specified SLS project to store the cluster audit logs.</li>
     * <li>If you want to change the project after the cluster audit log feature is enabled, you can use this parameter to specify another SLS project. You can perform this operation only in ACK managed clusters.</li>
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

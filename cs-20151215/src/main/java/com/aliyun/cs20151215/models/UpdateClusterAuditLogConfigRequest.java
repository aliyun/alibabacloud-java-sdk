// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterAuditLogConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable")
    public Boolean disable;

    /**
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

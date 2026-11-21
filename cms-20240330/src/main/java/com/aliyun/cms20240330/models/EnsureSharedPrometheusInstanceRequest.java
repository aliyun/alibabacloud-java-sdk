// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnsureSharedPrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The language of the returned information. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.
     * Default value: zh.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <p>The share scope. Currently, only Workspace is supported, which indicates the shared Prometheus instance for the workspace in the requested region. Workspaces in the same region share the same instance, and no additional instances are created. Policy and Environment are not currently supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Workspace</p>
     */
    @NameInMap("shareScope")
    public String shareScope;

    /**
     * <p>The name of the workspace. If the workspace does not exist, a 404 error is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>team-workspace</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static EnsureSharedPrometheusInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnsureSharedPrometheusInstanceRequest self = new EnsureSharedPrometheusInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EnsureSharedPrometheusInstanceRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public EnsureSharedPrometheusInstanceRequest setShareScope(String shareScope) {
        this.shareScope = shareScope;
        return this;
    }
    public String getShareScope() {
        return this.shareScope;
    }

    public EnsureSharedPrometheusInstanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}

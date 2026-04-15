// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPayOrderToMsenceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIPUBE5C3F6D091419</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>test_custom_id</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <strong>example:</strong>
     * <p>123321</p>
     */
    @NameInMap("MiniProgramId")
    public String miniProgramId;

    /**
     * <strong>example:</strong>
     * <p>mPaaS_Goosefish</p>
     */
    @NameInMap("PlatformId")
    public String platformId;

    /**
     * <strong>example:</strong>
     * <p>CBIGWCFH</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryPayOrderToMsenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPayOrderToMsenceRequest self = new QueryPayOrderToMsenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryPayOrderToMsenceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryPayOrderToMsenceRequest setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public QueryPayOrderToMsenceRequest setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
        return this;
    }
    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public QueryPayOrderToMsenceRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public QueryPayOrderToMsenceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryPayOrderToMsenceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

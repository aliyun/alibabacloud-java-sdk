// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMscpRiskInfoRequest extends TeaModel {
    /**
     * <p>ApdidToken</p>
     * 
     * <strong>example:</strong>
     * <p>ApdidToken</p>
     */
    @NameInMap("ApdidToken")
    public String apdidToken;

    /**
     * <p>AppId</p>
     * 
     * <strong>example:</strong>
     * <p>AppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>TenantId</p>
     * 
     * <strong>example:</strong>
     * <p>TenantId</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>TerminalType</p>
     * 
     * <strong>example:</strong>
     * <p>TerminalType</p>
     */
    @NameInMap("TerminalType")
    public String terminalType;

    /**
     * <p>WorkspaceId</p>
     * 
     * <strong>example:</strong>
     * <p>WorkspaceId</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryMscpRiskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMscpRiskInfoRequest self = new QueryMscpRiskInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMscpRiskInfoRequest setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public QueryMscpRiskInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryMscpRiskInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMscpRiskInfoRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

    public QueryMscpRiskInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

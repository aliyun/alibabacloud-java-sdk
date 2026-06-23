// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryMscpRiskInfoRequest extends TeaModel {
    @NameInMap("ApdidToken")
    public String apdidToken;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TerminalType")
    public String terminalType;

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

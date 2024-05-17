// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class LogMsaQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Id")
    public String id;

    @NameInMap("OnexFlag")
    public String onexFlag;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static LogMsaQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        LogMsaQueryRequest self = new LogMsaQueryRequest();
        return TeaModel.build(map, self);
    }

    public LogMsaQueryRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LogMsaQueryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LogMsaQueryRequest setOnexFlag(String onexFlag) {
        this.onexFlag = onexFlag;
        return this;
    }
    public String getOnexFlag() {
        return this.onexFlag;
    }

    public LogMsaQueryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public LogMsaQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

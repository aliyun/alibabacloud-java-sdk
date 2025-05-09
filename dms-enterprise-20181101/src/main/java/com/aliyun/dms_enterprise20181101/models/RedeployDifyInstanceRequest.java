// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RedeployDifyInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DataRegion")
    public String dataRegion;

    @NameInMap("DryRun")
    public String dryRun;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RedeployDifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeployDifyInstanceRequest self = new RedeployDifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RedeployDifyInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RedeployDifyInstanceRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public RedeployDifyInstanceRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public RedeployDifyInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaWorkspaceAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1781058524719073</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-zky4h2wey01</p>
     */
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGrafanaWorkspaceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaWorkspaceAccountRequest self = new DeleteGrafanaWorkspaceAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaWorkspaceAccountRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public DeleteGrafanaWorkspaceAccountRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public DeleteGrafanaWorkspaceAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

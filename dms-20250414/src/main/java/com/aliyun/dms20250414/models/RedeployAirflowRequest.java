// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class RedeployAirflowRequest extends TeaModel {
    /**
     * <p>The unique ID of the Airflow instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af-b3a7f110a6vmvn7****</p>
     */
    @NameInMap("AirflowId")
    public String airflowId;

    /**
     * <p>The ID of the DMS workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RedeployAirflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeployAirflowRequest self = new RedeployAirflowRequest();
        return TeaModel.build(map, self);
    }

    public RedeployAirflowRequest setAirflowId(String airflowId) {
        this.airflowId = airflowId;
        return this;
    }
    public String getAirflowId() {
        return this.airflowId;
    }

    public RedeployAirflowRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

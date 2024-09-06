// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentStatusResponseBody extends TeaModel {
    /**
     * <p>2</p>
     */
    @NameInMap("ImportAgentStatus")
    public GetAgentStatusResp importAgentStatus;

    public static GetAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatusResponseBody self = new GetAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentStatusResponseBody setImportAgentStatus(GetAgentStatusResp importAgentStatus) {
        this.importAgentStatus = importAgentStatus;
        return this;
    }
    public GetAgentStatusResp getImportAgentStatus() {
        return this.importAgentStatus;
    }

}

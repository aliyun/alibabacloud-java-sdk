// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentStatusResp extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetAgentStatusResp build(java.util.Map<String, ?> map) throws Exception {
        GetAgentStatusResp self = new GetAgentStatusResp();
        return TeaModel.build(map, self);
    }

    public GetAgentStatusResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

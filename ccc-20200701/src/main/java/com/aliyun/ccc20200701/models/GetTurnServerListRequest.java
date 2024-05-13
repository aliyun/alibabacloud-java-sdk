// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnServerListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTurnServerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTurnServerListRequest self = new GetTurnServerListRequest();
        return TeaModel.build(map, self);
    }

    public GetTurnServerListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

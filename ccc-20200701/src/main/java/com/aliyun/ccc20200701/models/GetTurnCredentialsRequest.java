// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnCredentialsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    public static GetTurnCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTurnCredentialsRequest self = new GetTurnCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public GetTurnCredentialsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTurnCredentialsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

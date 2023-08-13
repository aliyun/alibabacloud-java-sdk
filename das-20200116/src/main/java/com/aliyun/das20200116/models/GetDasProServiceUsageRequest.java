// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDasProServiceUsageRequest extends TeaModel {
    /**
     * <p>The database instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
     * <br>
     * <p>>  This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetDasProServiceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDasProServiceUsageRequest self = new GetDasProServiceUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetDasProServiceUsageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDasProServiceUsageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

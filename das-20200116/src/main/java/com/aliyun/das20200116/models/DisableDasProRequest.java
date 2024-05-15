// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableDasProRequest extends TeaModel {
    /**
     * <p>The database instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
     * <br>
     * <p>>  This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId that you set when you call this operation.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DisableDasProRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDasProRequest self = new DisableDasProRequest();
        return TeaModel.build(map, self);
    }

    public DisableDasProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableDasProRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

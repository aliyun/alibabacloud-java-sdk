// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableDasProRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SqlRetention")
    public Integer sqlRetention;

    @NameInMap("UserId")
    public String userId;

    public static EnableDasProRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDasProRequest self = new EnableDasProRequest();
        return TeaModel.build(map, self);
    }

    public EnableDasProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableDasProRequest setSqlRetention(Integer sqlRetention) {
        this.sqlRetention = sqlRetention;
        return this;
    }
    public Integer getSqlRetention() {
        return this.sqlRetention;
    }

    public EnableDasProRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableDasProRequest extends TeaModel {
    /**
     * <p>The database instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The storage duration of SQL Explorer data. Unit: day. Default value: **30**. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **180**</p>
     * <p>*   **365**</p>
     * <p>*   **1095**</p>
     * <p>*   **1825**</p>
     */
    @NameInMap("SqlRetention")
    public Integer sqlRetention;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
     * <br>
     * <p>>  This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.</p>
     */
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

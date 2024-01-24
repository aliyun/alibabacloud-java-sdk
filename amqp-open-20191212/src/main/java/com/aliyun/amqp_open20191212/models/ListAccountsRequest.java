// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListAccountsRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance for which you want to query the static username and password.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsRequest self = new ListAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

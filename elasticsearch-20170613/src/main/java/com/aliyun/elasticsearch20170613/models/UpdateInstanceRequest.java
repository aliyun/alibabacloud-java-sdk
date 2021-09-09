// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    @NameInMap("orderActionType")
    public String orderActionType;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    public UpdateInstanceRequest setOrderActionType(String orderActionType) {
        this.orderActionType = orderActionType;
        return this;
    }
    public String getOrderActionType() {
        return this.orderActionType;
    }

}

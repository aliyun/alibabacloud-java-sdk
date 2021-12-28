// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TriggerNetworkRequest extends TeaModel {
    @NameInMap("actionType")
    public String actionType;

    @NameInMap("networkType")
    public String networkType;

    @NameInMap("nodeType")
    public String nodeType;

    @NameInMap("clientToken")
    public String clientToken;

    public static TriggerNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerNetworkRequest self = new TriggerNetworkRequest();
        return TeaModel.build(map, self);
    }

    public TriggerNetworkRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public TriggerNetworkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public TriggerNetworkRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public TriggerNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

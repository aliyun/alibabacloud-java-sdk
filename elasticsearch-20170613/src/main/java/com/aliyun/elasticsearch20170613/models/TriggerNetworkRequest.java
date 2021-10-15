// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TriggerNetworkRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("nodeType")
    public String nodeType;

    @NameInMap("networkType")
    public String networkType;

    @NameInMap("actionType")
    public String actionType;

    public static TriggerNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerNetworkRequest self = new TriggerNetworkRequest();
        return TeaModel.build(map, self);
    }

    public TriggerNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TriggerNetworkRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public TriggerNetworkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public TriggerNetworkRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

}

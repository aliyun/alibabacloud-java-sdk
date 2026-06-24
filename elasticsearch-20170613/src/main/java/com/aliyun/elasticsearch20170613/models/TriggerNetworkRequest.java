// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TriggerNetworkRequest extends TeaModel {
    /**
     * <p>The action type. Valid values:</p>
     * <ul>
     * <li>CLOSE: disable.</li>
     * <li>OPEN: enable.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("actionType")
    public String actionType;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li>PUBLIC: public network.</li>
     * <li>PRIVATE: private network.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("networkType")
    public String networkType;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li>KIBANA: Kibana cluster.</li>
     * <li>WORKER: Elasticsearch cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KIBANA</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>407d02b74c49beb5bfdac7ec8bde2488</p>
     */
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

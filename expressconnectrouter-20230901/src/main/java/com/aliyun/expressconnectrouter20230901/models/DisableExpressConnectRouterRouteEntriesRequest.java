// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DisableExpressConnectRouterRouteEntriesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("NexthopInstanceId")
    public String nexthopInstanceId;

    public static DisableExpressConnectRouterRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableExpressConnectRouterRouteEntriesRequest self = new DisableExpressConnectRouterRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DisableExpressConnectRouterRouteEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableExpressConnectRouterRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DisableExpressConnectRouterRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableExpressConnectRouterRouteEntriesRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DisableExpressConnectRouterRouteEntriesRequest setNexthopInstanceId(String nexthopInstanceId) {
        this.nexthopInstanceId = nexthopInstanceId;
        return this;
    }
    public String getNexthopInstanceId() {
        return this.nexthopInstanceId;
    }

}

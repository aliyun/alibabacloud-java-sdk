// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class EnableExpressConnectRouterRouteEntriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.153.32.16/28</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-hp3u4u5f03tfuljis****</p>
     */
    @NameInMap("NexthopInstanceId")
    public String nexthopInstanceId;

    public static EnableExpressConnectRouterRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableExpressConnectRouterRouteEntriesRequest self = new EnableExpressConnectRouterRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public EnableExpressConnectRouterRouteEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableExpressConnectRouterRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public EnableExpressConnectRouterRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableExpressConnectRouterRouteEntriesRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public EnableExpressConnectRouterRouteEntriesRequest setNexthopInstanceId(String nexthopInstanceId) {
        this.nexthopInstanceId = nexthopInstanceId;
        return this;
    }
    public String getNexthopInstanceId() {
        return this.nexthopInstanceId;
    }

}

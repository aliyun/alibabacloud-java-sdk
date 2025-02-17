// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DisableExpressConnectRouterRouteEntriesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The destination CIDR block of the route entry in the route table of the ECR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.153.32.16/28</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ECR ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The ID of the next-hop instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-hp3u4u5f03tfuljis****</p>
     */
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

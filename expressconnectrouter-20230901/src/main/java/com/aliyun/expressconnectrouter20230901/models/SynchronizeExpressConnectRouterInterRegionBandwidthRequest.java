// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class SynchronizeExpressConnectRouterInterRegionBandwidthRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures the idempotence of the request. The token must be unique for each request and can contain only ASCII characters.</p>
     * <p>Generate a unique value from your client for each request. The ClientToken parameter can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends a check request. The service resource is not modified.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the Express Connect Router (ECR) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-fu8rszhgv7623c****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("Version")
    public String version;

    public static SynchronizeExpressConnectRouterInterRegionBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeExpressConnectRouterInterRegionBandwidthRequest self = new SynchronizeExpressConnectRouterInterRegionBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public SynchronizeExpressConnectRouterInterRegionBandwidthRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

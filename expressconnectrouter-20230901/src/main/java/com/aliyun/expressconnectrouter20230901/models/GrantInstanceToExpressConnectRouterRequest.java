// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class GrantInstanceToExpressConnectRouterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcrOwnerAliUid")
    public Long ecrOwnerAliUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    public static GrantInstanceToExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToExpressConnectRouterRequest self = new GrantInstanceToExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GrantInstanceToExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GrantInstanceToExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public GrantInstanceToExpressConnectRouterRequest setEcrOwnerAliUid(Long ecrOwnerAliUid) {
        this.ecrOwnerAliUid = ecrOwnerAliUid;
        return this;
    }
    public Long getEcrOwnerAliUid() {
        return this.ecrOwnerAliUid;
    }

    public GrantInstanceToExpressConnectRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantInstanceToExpressConnectRouterRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public GrantInstanceToExpressConnectRouterRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}

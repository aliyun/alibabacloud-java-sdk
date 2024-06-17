// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class GrantInstanceToExpressConnectRouterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>121012345612****</p>
     */
    @NameInMap("EcrOwnerAliUid")
    public Long ecrOwnerAliUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-j6cwxhgg0s5nuephp****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
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

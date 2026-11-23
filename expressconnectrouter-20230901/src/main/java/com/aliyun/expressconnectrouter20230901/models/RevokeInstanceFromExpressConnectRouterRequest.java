// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromExpressConnectRouterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without sending the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without modifying service resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Express Connect Router (ECR) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the ECR instance for which authorization is being revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121012345612****</p>
     */
    @NameInMap("EcrOwnerAliUid")
    public Long ecrOwnerAliUid;

    /**
     * <p>The ID of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-j6cwxhgg0s5nuephp****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region of the network instance for which authorization is being revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong>: virtual border router instance.</li>
     * <li><strong>VPC</strong>: virtual private cloud instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Version")
    public String version;

    public static RevokeInstanceFromExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromExpressConnectRouterRequest self = new RevokeInstanceFromExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setEcrOwnerAliUid(Long ecrOwnerAliUid) {
        this.ecrOwnerAliUid = ecrOwnerAliUid;
        return this;
    }
    public Long getEcrOwnerAliUid() {
        return this.ecrOwnerAliUid;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RevokeInstanceFromExpressConnectRouterRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

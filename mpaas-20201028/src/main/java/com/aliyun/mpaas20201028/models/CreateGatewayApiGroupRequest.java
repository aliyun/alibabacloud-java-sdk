// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateGatewayApiGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Centers")
    public java.util.Map<String, ?> centers;

    @NameInMap("Description")
    public String description;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EnableMTLS")
    public Boolean enableMTLS;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Host")
    public String host;

    @NameInMap("HttpsModel")
    public Boolean httpsModel;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstancePort")
    public Integer instancePort;

    @NameInMap("RegionMode")
    public Boolean regionMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpstreamType")
    public String upstreamType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcModel")
    public Boolean vpcModel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateGatewayApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayApiGroupRequest self = new CreateGatewayApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayApiGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateGatewayApiGroupRequest setCenters(java.util.Map<String, ?> centers) {
        this.centers = centers;
        return this;
    }
    public java.util.Map<String, ?> getCenters() {
        return this.centers;
    }

    public CreateGatewayApiGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGatewayApiGroupRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateGatewayApiGroupRequest setEnableMTLS(Boolean enableMTLS) {
        this.enableMTLS = enableMTLS;
        return this;
    }
    public Boolean getEnableMTLS() {
        return this.enableMTLS;
    }

    public CreateGatewayApiGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateGatewayApiGroupRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateGatewayApiGroupRequest setHttpsModel(Boolean httpsModel) {
        this.httpsModel = httpsModel;
        return this;
    }
    public Boolean getHttpsModel() {
        return this.httpsModel;
    }

    public CreateGatewayApiGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGatewayApiGroupRequest setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public CreateGatewayApiGroupRequest setRegionMode(Boolean regionMode) {
        this.regionMode = regionMode;
        return this;
    }
    public Boolean getRegionMode() {
        return this.regionMode;
    }

    public CreateGatewayApiGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateGatewayApiGroupRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CreateGatewayApiGroupRequest setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public CreateGatewayApiGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateGatewayApiGroupRequest setVpcModel(Boolean vpcModel) {
        this.vpcModel = vpcModel;
        return this;
    }
    public Boolean getVpcModel() {
        return this.vpcModel;
    }

    public CreateGatewayApiGroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

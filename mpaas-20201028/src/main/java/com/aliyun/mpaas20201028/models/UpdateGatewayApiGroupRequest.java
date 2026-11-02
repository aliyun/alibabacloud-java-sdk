// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateGatewayApiGroupRequest extends TeaModel {
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
    @NameInMap("GroupId")
    public Long groupId;

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

    public static UpdateGatewayApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayApiGroupRequest self = new UpdateGatewayApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayApiGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGatewayApiGroupRequest setCenters(java.util.Map<String, ?> centers) {
        this.centers = centers;
        return this;
    }
    public java.util.Map<String, ?> getCenters() {
        return this.centers;
    }

    public UpdateGatewayApiGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayApiGroupRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateGatewayApiGroupRequest setEnableMTLS(Boolean enableMTLS) {
        this.enableMTLS = enableMTLS;
        return this;
    }
    public Boolean getEnableMTLS() {
        return this.enableMTLS;
    }

    public UpdateGatewayApiGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateGatewayApiGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateGatewayApiGroupRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UpdateGatewayApiGroupRequest setHttpsModel(Boolean httpsModel) {
        this.httpsModel = httpsModel;
        return this;
    }
    public Boolean getHttpsModel() {
        return this.httpsModel;
    }

    public UpdateGatewayApiGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateGatewayApiGroupRequest setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public UpdateGatewayApiGroupRequest setRegionMode(Boolean regionMode) {
        this.regionMode = regionMode;
        return this;
    }
    public Boolean getRegionMode() {
        return this.regionMode;
    }

    public UpdateGatewayApiGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateGatewayApiGroupRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateGatewayApiGroupRequest setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public UpdateGatewayApiGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public UpdateGatewayApiGroupRequest setVpcModel(Boolean vpcModel) {
        this.vpcModel = vpcModel;
        return this;
    }
    public Boolean getVpcModel() {
        return this.vpcModel;
    }

    public UpdateGatewayApiGroupRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateNetworkAccessEndpointRequest extends TeaModel {
    /**
     * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>专属网络端点名称。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkAccessEndpointName")
    public String networkAccessEndpointName;

    /**
     * <p>专属网络端点连接的指定vSwitch。</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <p>专属网络端点连接的VpcID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>专属网络端点连接的VpcID所属地域，该地域取值必须在ListNetworkAccessEndpointAvailableRegions接口中返回。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static CreateNetworkAccessEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkAccessEndpointRequest self = new CreateNetworkAccessEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkAccessEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkAccessEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNetworkAccessEndpointRequest setNetworkAccessEndpointName(String networkAccessEndpointName) {
        this.networkAccessEndpointName = networkAccessEndpointName;
        return this;
    }
    public String getNetworkAccessEndpointName() {
        return this.networkAccessEndpointName;
    }

    public CreateNetworkAccessEndpointRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateNetworkAccessEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateNetworkAccessEndpointRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}

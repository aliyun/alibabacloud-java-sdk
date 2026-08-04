// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <p>Acceleration pattern:</p>
     * <ul>
     * <li><p><strong>whitelist</strong>: Whitelist acceleration</p>
     * </li>
     * <li><p><strong>global</strong>: Global acceleration</p>
     * </li>
     * <li><p><strong>build-in-list</strong>: Built-in application acceleration</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("AccelerationType")
    public String accelerationType;

    /**
     * <p>Policy description. Length: 1 to 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>用于全局网络访问的加速策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Policy Name.</p>
     * 
     * <strong>example:</strong>
     * <p>全局加速策略</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Priority.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>Whether to display this policy in the client:</p>
     * <ul>
     * <li><p><strong>0</strong>: Do not display</p>
     * </li>
     * <li><p><strong>1</strong>: Display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowInClient")
    public Integer showInClient;

    /**
     * <p>The IP address or domain name of the acceleration instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12.34.56.XX</p>
     */
    @NameInMap("UpstreamHost")
    public String upstreamHost;

    /**
     * <p>Port for the accelerated instance. The port must be between 1000 and 60000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UpstreamPort")
    public Integer upstreamPort;

    /**
     * <p>Accelerated instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga</p>
     */
    @NameInMap("UpstreamType")
    public String upstreamType;

    /**
     * <p>User group for acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试用户组</p>
     */
    @NameInMap("UserAttributeGroup")
    public String userAttributeGroup;

    public static CreateEnterpriseAcceleratePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseAcceleratePolicyRequest self = new CreateEnterpriseAcceleratePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseAcceleratePolicyRequest setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public CreateEnterpriseAcceleratePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnterpriseAcceleratePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnterpriseAcceleratePolicyRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public CreateEnterpriseAcceleratePolicyRequest setShowInClient(Integer showInClient) {
        this.showInClient = showInClient;
        return this;
    }
    public Integer getShowInClient() {
        return this.showInClient;
    }

    public CreateEnterpriseAcceleratePolicyRequest setUpstreamHost(String upstreamHost) {
        this.upstreamHost = upstreamHost;
        return this;
    }
    public String getUpstreamHost() {
        return this.upstreamHost;
    }

    public CreateEnterpriseAcceleratePolicyRequest setUpstreamPort(Integer upstreamPort) {
        this.upstreamPort = upstreamPort;
        return this;
    }
    public Integer getUpstreamPort() {
        return this.upstreamPort;
    }

    public CreateEnterpriseAcceleratePolicyRequest setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public CreateEnterpriseAcceleratePolicyRequest setUserAttributeGroup(String userAttributeGroup) {
        this.userAttributeGroup = userAttributeGroup;
        return this;
    }
    public String getUserAttributeGroup() {
        return this.userAttributeGroup;
    }

}

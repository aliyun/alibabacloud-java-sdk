// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <p>The acceleration mode. Valid values:</p>
     * <ul>
     * <li><strong>whiltelist</strong>: whitelist-based acceleration.</li>
     * <li><strong>global</strong>: global acceleration.</li>
     * <li><strong>build-in-list</strong>: built-in application acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("AccelerationType")
    public String accelerationType;

    /**
     * <p>The description of the enterprise management policy. The description must be 1 to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Acceleration policy for global network access</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>GlobalAccelerationPolicy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>Specifies whether to display the policy in the client. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not displayed.</li>
     * <li><strong>1</strong>: displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowInClient")
    public Integer showInClient;

    /**
     * <p>The address (IP address or domain name) of the acceleration instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12.34.56.XX</p>
     */
    @NameInMap("UpstreamHost")
    public String upstreamHost;

    /**
     * <p>The port of the acceleration instance. Valid values: 1000 to 60000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UpstreamPort")
    public Integer upstreamPort;

    /**
     * <p>The acceleration instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga</p>
     */
    @NameInMap("UpstreamType")
    public String upstreamType;

    /**
     * <p>The acceleration user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestUserGroup</p>
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

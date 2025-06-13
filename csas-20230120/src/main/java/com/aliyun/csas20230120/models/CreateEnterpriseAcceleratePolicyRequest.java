// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("AccelerationType")
    public String accelerationType;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowInClient")
    public Integer showInClient;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12.34.56.XX</p>
     */
    @NameInMap("UpstreamHost")
    public String upstreamHost;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UpstreamPort")
    public Integer upstreamPort;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga</p>
     */
    @NameInMap("UpstreamType")
    public String upstreamType;

    /**
     * <p>This parameter is required.</p>
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

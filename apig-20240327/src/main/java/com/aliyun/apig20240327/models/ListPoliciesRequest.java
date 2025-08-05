// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>api-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-cq2fm65lhtgm9nrrl7ag</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withAttachments")
    public Boolean withAttachments;

    @NameInMap("withSystemPolicy")
    public Boolean withSystemPolicy;

    public static ListPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesRequest self = new ListPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesRequest setAttachResourceId(String attachResourceId) {
        this.attachResourceId = attachResourceId;
        return this;
    }
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    public ListPoliciesRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public ListPoliciesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListPoliciesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListPoliciesRequest setWithAttachments(Boolean withAttachments) {
        this.withAttachments = withAttachments;
        return this;
    }
    public Boolean getWithAttachments() {
        return this.withAttachments;
    }

    public ListPoliciesRequest setWithSystemPolicy(Boolean withSystemPolicy) {
        this.withSystemPolicy = withSystemPolicy;
        return this;
    }
    public Boolean getWithSystemPolicy() {
        return this.withSystemPolicy;
    }

}

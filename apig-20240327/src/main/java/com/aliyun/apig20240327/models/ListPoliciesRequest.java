// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <p>The ID of the mount point.</p>
     * 
     * <strong>example:</strong>
     * <p>api-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("attachResourceId")
    public String attachResourceId;

    /**
     * <p>The type of mount points supported by the policy. Valid values:</p>
     * <ul>
     * <li>HttpApi: HTTP API.</li>
     * <li>Operation: The operation of the HTTP API.</li>
     * <li>GatewayRoute: Gateway route.</li>
     * <li>GatewayService: Gateway service.</li>
     * <li>GatewayServicePort: Gateway service port.</li>
     * <li>Domain: Gateway domain name.</li>
     * <li>Gateway: Gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The ID of the environment.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq2fm65lhtgm9nrrl7ag</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to return mount information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withAttachments")
    public Boolean withAttachments;

    /**
     * <p>Specifies whether the policy is a system policy.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public ListPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

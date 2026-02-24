// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateDiscoveredResourceRequest extends TeaModel {
    /**
     * <p>The account group ID.</p>
     * <p>For more information about how to obtain the account group ID, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-5885626622af0008****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>Specifies whether to query the compliance results of the resource. Valid values:</p>
     * <ul>
     * <li><p>0 (default): does not query the compliance results of the resource.</p>
     * </li>
     * <li><p>1: queries the compliance results of the resource.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ComplianceOption")
    public Integer complianceOption;

    /**
     * <p>The region ID of the resource.</p>
     * <p>For more information about how to obtain the region ID of the resource, see <a href="https://help.aliyun.com/document_detail/411691.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Required. The ID of the Alibaba Cloud account to which the resource to be queried belongs in the account group.</p>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The resource ID.</p>
     * <p>For more information about how to obtain the resource ID, see <a href="https://help.aliyun.com/document_detail/411691.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp12g4xbl4i0brkn****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The resource type.</p>
     * <p>For more information about how to obtain the resource type, see <a href="https://help.aliyun.com/document_detail/411691.html">ListAggregateDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetAggregateDiscoveredResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateDiscoveredResourceRequest self = new GetAggregateDiscoveredResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateDiscoveredResourceRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateDiscoveredResourceRequest setComplianceOption(Integer complianceOption) {
        this.complianceOption = complianceOption;
        return this;
    }
    public Integer getComplianceOption() {
        return this.complianceOption;
    }

    public GetAggregateDiscoveredResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateDiscoveredResourceRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    @Deprecated
    public GetAggregateDiscoveredResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

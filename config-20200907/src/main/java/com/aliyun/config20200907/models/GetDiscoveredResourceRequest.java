// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceRequest extends TeaModel {
    @NameInMap("ComplianceOption")
    public Integer complianceOption;

    /**
     * <p>The ID of the region in which the resource resides.</p>
     * <br>
     * <p>For more information about how to query the region ID of a resource, see [ListDiscoveredResources](https://help.aliyun.com/document_detail/411702.html).</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource IDs.</p>
     * <br>
     * <p>For more information about how to query the ID of a resource, see [ListDiscoveredResources](https://help.aliyun.com/document_detail/411702.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>For more information about how to obtain the type of a resource, see [ListDiscoveredResources](https://help.aliyun.com/document_detail/411702.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetDiscoveredResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceRequest self = new GetDiscoveredResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceRequest setComplianceOption(Integer complianceOption) {
        this.complianceOption = complianceOption;
        return this;
    }
    public Integer getComplianceOption() {
        return this.complianceOption;
    }

    public GetDiscoveredResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetDiscoveredResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetDiscoveredResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the compliance results of the resource. Valid values:</p>
     * <ul>
     * <li>0 (default): does not query the compliance results of the resource.</li>
     * <li>1: queries the compliance results of the resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ComplianceOption")
    public Integer complianceOption;

    /**
     * <p>The ID of the region in which the resource resides.</p>
     * <p>For more information about how to query the region ID of a resource, see <a href="https://help.aliyun.com/document_detail/411702.html">ListDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The resource ID.</p>
     * <p>For more information about how to obtain the ID of a resource, see <a href="https://help.aliyun.com/document_detail/411702.html">ListDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new-bucket</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <p>For more information about how to obtain the type of a resource, see <a href="https://help.aliyun.com/document_detail/411702.html">ListDiscoveredResources</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::OSS::Bucket</p>
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

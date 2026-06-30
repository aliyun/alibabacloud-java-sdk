// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetGlobalAcceleratorResourcesRequest extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The ID of the linked peripheral resource.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-x0r****gr1i</p>
     */
    @NameInMap("AssociatedResourceId")
    public String associatedResourceId;

    /**
     * <p>The Region ID where the linked instance is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociatedResourceRegionId")
    public String associatedResourceRegionId;

    /**
     * <p>The resource type of the linked peripheral resource.</p>
     * 
     * <strong>example:</strong>
     * <p>WAF</p>
     */
    @NameInMap("AssociatedResourceType")
    public String associatedResourceType;

    /**
     * <p>The Region ID where the Alibaba Cloud Global Accelerator (GA) instance is located. The only valid value is cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetGlobalAcceleratorResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAcceleratorResourcesRequest self = new GetGlobalAcceleratorResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetGlobalAcceleratorResourcesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetGlobalAcceleratorResourcesRequest setAssociatedResourceId(String associatedResourceId) {
        this.associatedResourceId = associatedResourceId;
        return this;
    }
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    public GetGlobalAcceleratorResourcesRequest setAssociatedResourceRegionId(String associatedResourceRegionId) {
        this.associatedResourceRegionId = associatedResourceRegionId;
        return this;
    }
    public String getAssociatedResourceRegionId() {
        return this.associatedResourceRegionId;
    }

    public GetGlobalAcceleratorResourcesRequest setAssociatedResourceType(String associatedResourceType) {
        this.associatedResourceType = associatedResourceType;
        return this;
    }
    public String getAssociatedResourceType() {
        return this.associatedResourceType;
    }

    public GetGlobalAcceleratorResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

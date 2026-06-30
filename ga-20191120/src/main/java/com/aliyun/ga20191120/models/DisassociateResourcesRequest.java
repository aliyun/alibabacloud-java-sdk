// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DisassociateResourcesRequest extends TeaModel {
    /**
     * <p>Alibaba Cloud Global Accelerator (GA) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Linked instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd498437eb9a346c38be8482689800e91</p>
     */
    @NameInMap("AssociatedResourceId")
    public String associatedResourceId;

    /**
     * <p>Region ID of the linked instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociatedResourceRegionId")
    public String associatedResourceRegionId;

    /**
     * <p>Resource type of the linked peripheral resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WAF</p>
     */
    @NameInMap("AssociatedResourceType")
    public String associatedResourceType;

    /**
     * <p>Specifies whether to perform a dry run of the request. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Sends a dry run request without detaching the resource. The system checks whether required parameters are specified, whether the request format is valid, and whether business limits are met. If the check fails, an error is returned. If the check passes, an HTTP 2xx status code is returned.  </li>
     * <li><strong>false</strong> (default): Sends a normal request. If the check passes, an HTTP 2xx status code is returned and the endpoint group is created immediately.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Region ID of the Alibaba Cloud Global Accelerator (GA) instance. Valid value: <strong>cn-hangzhou</strong> only.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisassociateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourcesRequest self = new DisassociateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateResourcesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DisassociateResourcesRequest setAssociatedResourceId(String associatedResourceId) {
        this.associatedResourceId = associatedResourceId;
        return this;
    }
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    public DisassociateResourcesRequest setAssociatedResourceRegionId(String associatedResourceRegionId) {
        this.associatedResourceRegionId = associatedResourceRegionId;
        return this;
    }
    public String getAssociatedResourceRegionId() {
        return this.associatedResourceRegionId;
    }

    public DisassociateResourcesRequest setAssociatedResourceType(String associatedResourceType) {
        this.associatedResourceType = associatedResourceType;
        return this;
    }
    public String getAssociatedResourceType() {
        return this.associatedResourceType;
    }

    public DisassociateResourcesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisassociateResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

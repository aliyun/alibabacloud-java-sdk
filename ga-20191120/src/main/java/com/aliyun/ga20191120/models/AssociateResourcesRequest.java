// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateResourcesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <strong>example:</strong>
     * <p>Associated</p>
     */
    @NameInMap("AssociatedMode")
    public String associatedMode;

    /**
     * <strong>example:</strong>
     * <p>waf_xx</p>
     */
    @NameInMap("AssociatedResourceId")
    public String associatedResourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociatedResourceRegionId")
    public String associatedResourceRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WAF</p>
     */
    @NameInMap("AssociatedResourceType")
    public String associatedResourceType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourcesRequest self = new AssociateResourcesRequest();
        return TeaModel.build(map, self);
    }

    public AssociateResourcesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public AssociateResourcesRequest setAssociatedMode(String associatedMode) {
        this.associatedMode = associatedMode;
        return this;
    }
    public String getAssociatedMode() {
        return this.associatedMode;
    }

    public AssociateResourcesRequest setAssociatedResourceId(String associatedResourceId) {
        this.associatedResourceId = associatedResourceId;
        return this;
    }
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    public AssociateResourcesRequest setAssociatedResourceRegionId(String associatedResourceRegionId) {
        this.associatedResourceRegionId = associatedResourceRegionId;
        return this;
    }
    public String getAssociatedResourceRegionId() {
        return this.associatedResourceRegionId;
    }

    public AssociateResourcesRequest setAssociatedResourceType(String associatedResourceType) {
        this.associatedResourceType = associatedResourceType;
        return this;
    }
    public String getAssociatedResourceType() {
        return this.associatedResourceType;
    }

    public AssociateResourcesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

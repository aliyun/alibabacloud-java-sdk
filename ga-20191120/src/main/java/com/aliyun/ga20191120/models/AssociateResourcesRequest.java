// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateResourcesRequest extends TeaModel {
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
     * <p>Association pattern:  </p>
     * <ul>
     * <li><strong>Managed</strong>: Managed mode. GA restricts user operations based on management policies. Currently, no resources use this type.  </li>
     * <li><strong>Associated</strong> (default): Loose coupling association. GA does not restrict user operations. WAF uses loose coupling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Associated</p>
     */
    @NameInMap("AssociatedMode")
    public String associatedMode;

    /**
     * <p>Resource ID of the linked instance.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_xx</p>
     */
    @NameInMap("AssociatedResourceId")
    public String associatedResourceId;

    /**
     * <p>Region of the linked instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociatedResourceRegionId")
    public String associatedResourceRegionId;

    /**
     * <p>Resource type of the linked instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WAF</p>
     */
    @NameInMap("AssociatedResourceType")
    public String associatedResourceType;

    /**
     * <p>Indicates whether to perform a dry run of the request. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Sends a dry run request without associating resources. Checks include required parameters, request format, and business restrictions. If the check fails, an error is returned. If the check passes, an HTTP 2xx status code is returned.  </li>
     * <li><strong>false</strong> (Default Value): Sends a normal request. If the check passes, an HTTP 2xx status code is returned and the endpoint group is created immediately.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Region ID of the basic Alibaba Cloud Global Accelerator (GA) instance. Valid value: <strong>cn-hangzhou</strong> only.</p>
     * 
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

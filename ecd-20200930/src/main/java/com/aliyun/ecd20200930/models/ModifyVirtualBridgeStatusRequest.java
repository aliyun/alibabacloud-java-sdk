// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyVirtualBridgeStatusRequest extends TeaModel {
    /**
     * <p>The virtual bridge ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-sjfiahsiufhisda***</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The virtual bridge status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>unuse</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyVirtualBridgeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualBridgeStatusRequest self = new ModifyVirtualBridgeStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualBridgeStatusRequest setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public ModifyVirtualBridgeStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualBridgeStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

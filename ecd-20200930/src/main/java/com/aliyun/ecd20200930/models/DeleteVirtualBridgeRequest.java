// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteVirtualBridgeRequest extends TeaModel {
    /**
     * <p>The virtual bridge ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-fjsidhfishfiu****</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The region ID. Call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteVirtualBridgeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBridgeRequest self = new DeleteVirtualBridgeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualBridgeRequest setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public DeleteVirtualBridgeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

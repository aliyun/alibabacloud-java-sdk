// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSiteBridgeInfoRequest extends TeaModel {
    /**
     * <p>The virtual bridge ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-sdfsifhisdhf****</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeOfficeSiteBridgeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSiteBridgeInfoRequest self = new DescribeOfficeSiteBridgeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSiteBridgeInfoRequest setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public DescribeOfficeSiteBridgeInfoRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeOfficeSiteBridgeInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

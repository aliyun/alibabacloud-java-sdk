// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoRequest extends TeaModel {
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>Desktop ID. Set 1 to 100.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("NeedExtraInfo")
    public Boolean needExtraInfo;

    /**
     * <p>Region ID. Call <a href="t2167755.xdita#"></a>to get a list of regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDesktopInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopInfoRequest self = new DescribeDesktopInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopInfoRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeDesktopInfoRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DescribeDesktopInfoRequest setNeedExtraInfo(Boolean needExtraInfo) {
        this.needExtraInfo = needExtraInfo;
        return this;
    }
    public Boolean getNeedExtraInfo() {
        return this.needExtraInfo;
    }

    public DescribeDesktopInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

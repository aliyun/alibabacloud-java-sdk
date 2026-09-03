// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoRequest extends TeaModel {
    /**
     * <p>The business channel. Valid values:</p>
     * <ul>
     * <li>Enterprise: Enterprise Edition.</li>
     * <li>Business: Business Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The cloud computer ID. You can specify 1 to 100 IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>Specifies whether to return the extended information of the cloud computer.</p>
     */
    @NameInMap("NeedExtraInfo")
    public Boolean needExtraInfo;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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

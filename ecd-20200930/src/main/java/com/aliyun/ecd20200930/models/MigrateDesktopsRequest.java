// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopsRequest extends TeaModel {
    /**
     * <p>The IDs of cloud computers. You can specify 1 to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The member IP address of the target node for migration.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.10</p>
     */
    @NameInMap("TargetMemberIp")
    public String targetMemberIp;

    /**
     * <p>The ID of the target office network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen+dir-388505****</p>
     */
    @NameInMap("TargetOfficeSiteId")
    public String targetOfficeSiteId;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1m3o4kbjxwe****</p>
     */
    @NameInMap("TargetSubnetId")
    public String targetSubnetId;

    public static MigrateDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDesktopsRequest self = new MigrateDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public MigrateDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MigrateDesktopsRequest setTargetMemberIp(String targetMemberIp) {
        this.targetMemberIp = targetMemberIp;
        return this;
    }
    public String getTargetMemberIp() {
        return this.targetMemberIp;
    }

    public MigrateDesktopsRequest setTargetOfficeSiteId(String targetOfficeSiteId) {
        this.targetOfficeSiteId = targetOfficeSiteId;
        return this;
    }
    public String getTargetOfficeSiteId() {
        return this.targetOfficeSiteId;
    }

    public MigrateDesktopsRequest setTargetSubnetId(String targetSubnetId) {
        this.targetSubnetId = targetSubnetId;
        return this;
    }
    public String getTargetSubnetId() {
        return this.targetSubnetId;
    }

}

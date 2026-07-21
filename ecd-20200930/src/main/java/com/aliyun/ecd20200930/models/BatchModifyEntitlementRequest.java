// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BatchModifyEntitlementRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers for which you want to modify authorized users.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The user IDs (usernames).</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The number of cloud computers to assign to each user.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxDesktopPerUser")
    public Integer maxDesktopPerUser;

    /**
     * <p>The number of users to assign to each cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxUserPerDesktop")
    public Integer maxUserPerDesktop;

    /**
     * <p>Specifies whether to preview the assignment. If set to true, the assignment is not actually performed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Preview")
    public Boolean preview;

    /**
     * <p>The region ID. You can call DescribeRegions to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The policy used when the ratio of cloud computers to users cannot be evenly matched. Valid values:</p>
     * <ul>
     * <li><p>AVERAGE: prioritizes assigning a cloud computer to each user. When the number of selected cloud computers and users cannot be evenly matched, the system prioritizes assigning a cloud computer to each user.</p>
     * </li>
     * <li><p>CENTRAL: prioritizes assigning the specified number of cloud computers to users. When the number of selected cloud computers and users cannot be evenly matched, the system prioritizes assigning the specified number of cloud computers to users.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVERAGE</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static BatchModifyEntitlementRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyEntitlementRequest self = new BatchModifyEntitlementRequest();
        return TeaModel.build(map, self);
    }

    public BatchModifyEntitlementRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public BatchModifyEntitlementRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public BatchModifyEntitlementRequest setMaxDesktopPerUser(Integer maxDesktopPerUser) {
        this.maxDesktopPerUser = maxDesktopPerUser;
        return this;
    }
    public Integer getMaxDesktopPerUser() {
        return this.maxDesktopPerUser;
    }

    public BatchModifyEntitlementRequest setMaxUserPerDesktop(Integer maxUserPerDesktop) {
        this.maxUserPerDesktop = maxUserPerDesktop;
        return this;
    }
    public Integer getMaxUserPerDesktop() {
        return this.maxUserPerDesktop;
    }

    public BatchModifyEntitlementRequest setPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }
    public Boolean getPreview() {
        return this.preview;
    }

    public BatchModifyEntitlementRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchModifyEntitlementRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}

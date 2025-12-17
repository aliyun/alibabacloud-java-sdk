// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BatchModifyEntitlementRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers for which you want to modify end users.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The IDs of the users.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The number of cloud computers allocated to each user.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxDesktopPerUser")
    public Integer maxDesktopPerUser;

    /**
     * <p>The number of users assigned to each cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxUserPerDesktop")
    public Integer maxUserPerDesktop;

    /**
     * <p>Whether to preview the assign results instead of actually assigning cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Preview")
    public Boolean preview;

    /**
     * <p>The ID of the region. Call the DescribeRegions operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The disproportional assignment policy. Valid values:</p>
     * <p>AVERAGE: The system preferentially guarantees that each user is assigned with at least a cloud computer. If the number of selected cloud computers cannot be proportionally assigned to the selected users, ensure that each user is assigned a cloud computer.</p>
     * <p>CENTRAL: The system preferentially assigns the designated number of cloud computers to each user. If the number of selected cloud computers cannot be proportionally assigned to the selected users, ensure that each user is assigned the specified number of cloud computers.</p>
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

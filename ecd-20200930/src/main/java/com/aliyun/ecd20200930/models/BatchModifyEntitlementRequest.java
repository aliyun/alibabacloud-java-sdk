// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BatchModifyEntitlementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxDesktopPerUser")
    public Integer maxDesktopPerUser;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxUserPerDesktop")
    public Integer maxUserPerDesktop;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Preview")
    public Boolean preview;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
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

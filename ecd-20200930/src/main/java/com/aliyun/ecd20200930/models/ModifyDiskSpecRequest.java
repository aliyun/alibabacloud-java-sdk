// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * <ul>
     * <li><p>If set to <code>true</code>, ensure your account has a sufficient balance. Otherwise, an abnormal order is generated.</p>
     * </li>
     * <li><p>If set to <code>false</code>, log on to the console. Then, go to the <strong>Expenses and Costs</strong> page to pay for the order using the returned order ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the cloud desktop.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-2yjhqxo1monbf****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The promotion ID. Call a pricing inquiry API to get a list of applicable promotion IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. Call <a href="~~DescribeRegions~~">DescribeRegions</a> to get a list of supported regions for WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The performance level of the system disk. You can set the performance level for Graphics or High-frequency workspaces.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The performance level of the data disk. You can set the performance level for Graphics or High-frequency workspaces.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    public static ModifyDiskSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecRequest self = new ModifyDiskSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDiskSpecRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyDiskSpecRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ModifyDiskSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDiskSpecRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public ModifyDiskSpecRequest setRootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
        this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
        return this;
    }
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    public ModifyDiskSpecRequest setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
        this.userDiskPerformanceLevel = userDiskPerformanceLevel;
        return this;
    }
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ChangeCloudPhoneNodeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DisplayConfig")
    public String displayConfig;

    @NameInMap("DownBandwidthLimit")
    public Integer downBandwidthLimit;

    /**
     * <strong>example:</strong>
     * <p>ac.max</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>cpn-0ugbptfu473fy****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PhoneCount")
    public Integer phoneCount;

    @NameInMap("PhoneDataVolume")
    public Integer phoneDataVolume;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("ShareDataVolume")
    public Integer shareDataVolume;

    @NameInMap("SwapSize")
    public Integer swapSize;

    @NameInMap("UpBandwidthLimit")
    public Integer upBandwidthLimit;

    public static ChangeCloudPhoneNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCloudPhoneNodeRequest self = new ChangeCloudPhoneNodeRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCloudPhoneNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ChangeCloudPhoneNodeRequest setDisplayConfig(String displayConfig) {
        this.displayConfig = displayConfig;
        return this;
    }
    public String getDisplayConfig() {
        return this.displayConfig;
    }

    public ChangeCloudPhoneNodeRequest setDownBandwidthLimit(Integer downBandwidthLimit) {
        this.downBandwidthLimit = downBandwidthLimit;
        return this;
    }
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    public ChangeCloudPhoneNodeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ChangeCloudPhoneNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ChangeCloudPhoneNodeRequest setPhoneCount(Integer phoneCount) {
        this.phoneCount = phoneCount;
        return this;
    }
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    public ChangeCloudPhoneNodeRequest setPhoneDataVolume(Integer phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    public ChangeCloudPhoneNodeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ChangeCloudPhoneNodeRequest setShareDataVolume(Integer shareDataVolume) {
        this.shareDataVolume = shareDataVolume;
        return this;
    }
    public Integer getShareDataVolume() {
        return this.shareDataVolume;
    }

    public ChangeCloudPhoneNodeRequest setSwapSize(Integer swapSize) {
        this.swapSize = swapSize;
        return this;
    }
    public Integer getSwapSize() {
        return this.swapSize;
    }

    public ChangeCloudPhoneNodeRequest setUpBandwidthLimit(Integer upBandwidthLimit) {
        this.upBandwidthLimit = upBandwidthLimit;
        return this;
    }
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): disables automatic payment. After an order is generated, you must go to the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/order/list">Order Hub</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/order/list">Order Hub</a> to complete the payment.</p>
     * </li>
     * <li><p><strong>true</strong>: enables automatic payment. The system automatically pays the bill.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required only for upgrade orders.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to use coupons. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The bandwidth of the bandwidth plan. Unit: Mbit/s.</p>
     * <p>Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the bandwidth plan that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The bandwidth type. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: standard bandwidth.</p>
     * </li>
     * <li><p><strong>Enhanced</strong>: enhanced bandwidth.</p>
     * </li>
     * <li><p><strong>Advanced</strong>: premium bandwidth.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can upgrade a Basic bandwidth plan to Enhanced, or downgrade an <strong>Enhanced</strong> bandwidth plan to <strong>Basic</strong>. You cannot change the bandwidth type of an <strong>Advanced</strong> bandwidth plan.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The description of the bandwidth plan.</p>
     * <p>The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the bandwidth plan.
     * The name must be 1 to 128 characters in length, start with a letter or a Chinese character, and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the Global Accelerator instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBandwidthPackageRequest self = new UpdateBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBandwidthPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpdateBandwidthPackageRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public UpdateBandwidthPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateBandwidthPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public UpdateBandwidthPackageRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public UpdateBandwidthPackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBandwidthPackageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

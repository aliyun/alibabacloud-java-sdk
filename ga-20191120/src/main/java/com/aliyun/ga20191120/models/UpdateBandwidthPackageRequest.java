// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: disables automatic payment. This is the default value. If you select this option, you must go to <a href="https://usercenter2-intl.aliyun.com/order/list">Order Center</a> to complete the payment after an order is generated.</li>
     * <li><strong>true</strong>: enables automatic payment. Payments are automatically completed.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you call the UpdateBandwidthPackage operation to upgrade a bandwidth plan.</p>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The bandwidth value of the bandwidth plan. Unit: Mbit/s.</p>
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
     * <p>The type of bandwidth. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong></li>
     * <li><strong>Enhanced</strong></li>
     * <li><strong>Advanced</strong></li>
     * </ul>
     * <blockquote>
     * <p> You can upgrade <strong>Basic</strong> bandwidth to <strong>Enhanced</strong> bandwidth or downgrade Enhanced bandwidth to Basic bandwidth. You cannot change <strong>Advanced</strong> bandwidth to another type of bandwidth.</p>
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
     * <p>The name of the bandwidth plan. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
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

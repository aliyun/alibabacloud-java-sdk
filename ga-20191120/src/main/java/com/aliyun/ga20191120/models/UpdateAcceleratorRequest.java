// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Disables automatic payment. After an order is generated, you must go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Order Hub</a> to complete the payment.</p>
     * </li>
     * <li><p><strong>true</strong>: Enables automatic payment. The system automatically pays the bill.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only for upgrade orders.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically use a coupon to pay for the bill. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Use a coupon.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Do not use a coupon.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid only if <strong>AutoPay</strong> is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The bandwidth of the standard GA instance. Unit: <strong>Mbps</strong>.</p>
     * <p>Valid values: 200 to 5000.</p>
     * <blockquote>
     * <p>This parameter is valid only when the access mode of the acceleration area is Anycast.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the GA instance. The description can be up to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the GA instance.</p>
     * <p>The name must be 1 to 128 characters in length, start with a letter or a Chinese character, and can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Small I</p>
     * </li>
     * <li><p><strong>2</strong>: Small II</p>
     * </li>
     * <li><p><strong>3</strong>: Small III</p>
     * </li>
     * <li><p><strong>5</strong>: Medium I</p>
     * </li>
     * <li><p><strong>8</strong>: Medium II</p>
     * </li>
     * <li><p><strong>10</strong>: Medium III</p>
     * </li>
     * <li><p><strong>20</strong>: Large I</p>
     * </li>
     * <li><p><strong>30</strong>: Large II</p>
     * </li>
     * <li><p><strong>40</strong>: Large III</p>
     * </li>
     * <li><p><strong>50</strong>: Large IV</p>
     * </li>
     * <li><p><strong>60</strong>: Large V</p>
     * </li>
     * <li><p><strong>70</strong>: Large VI</p>
     * </li>
     * <li><p><strong>80</strong>: Large VII</p>
     * </li>
     * <li><p><strong>90</strong>: Large VIII</p>
     * </li>
     * <li><p><strong>100</strong>: Ultra-large I</p>
     * </li>
     * <li><p><strong>200</strong>: Ultra-large II</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Large III and higher specifications are available only to whitelisted users. To use these specifications, contact your account manager.</p>
     * </blockquote>
     * <p>The definitions of instance types vary. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static UpdateAcceleratorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorRequest self = new UpdateAcceleratorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateAcceleratorRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpdateAcceleratorRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public UpdateAcceleratorRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateAcceleratorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAcceleratorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAcceleratorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    @Deprecated
    public UpdateAcceleratorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAcceleratorRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}

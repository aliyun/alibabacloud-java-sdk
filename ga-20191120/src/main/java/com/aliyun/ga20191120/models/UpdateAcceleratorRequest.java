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
     * <li><strong>false</strong>: disables automatic payment. This is the default value. After an order is generated, you must go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Order Center</a> to complete the payment.</li>
     * <li><strong>true</strong>: enables automatic payment. Payments are automatically completed.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you call the operation to upgrade a GA instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically pay bills by using coupons. Default value: false. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatically pays bills by using coupons.</li>
     * <li><strong>false</strong>: does not automatically pay bills by using coupons.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if the <strong>AutoPay</strong> parameter is set to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Small Ⅰ</li>
     * <li><strong>2</strong>: Small Ⅱ</li>
     * <li><strong>3</strong>: Small Ⅲ</li>
     * <li><strong>5</strong>: Medium Ⅰ</li>
     * <li><strong>8</strong>: Medium Ⅱ</li>
     * <li><strong>10</strong>: Medium Ⅲ</li>
     * <li><strong>20</strong>: Large Ⅰ</li>
     * <li><strong>30</strong>: Large Ⅱ</li>
     * <li><strong>40</strong>: Large Ⅲ</li>
     * <li><strong>50</strong>: Large Ⅳ</li>
     * <li><strong>60</strong>: Large Ⅴ</li>
     * <li><strong>70</strong>: Large Ⅵ</li>
     * <li><strong>80</strong>: Large VⅡ</li>
     * <li><strong>90</strong>: Large VⅢ</li>
     * <li><strong>100</strong>: Super Large Ⅰ</li>
     * <li><strong>200</strong>: Super Large Ⅱ</li>
     * </ul>
     * <blockquote>
     * <p> The Large Ⅲ specification and higher specifications are available only for accounts that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
     * </blockquote>
     * <p>Different specifications provide different capabilities. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance specifications</a>.</p>
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

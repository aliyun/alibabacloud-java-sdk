// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **false** (default): disables automatic payment. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true**: enables automatic payment. Payments are automatically completed.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically pay bills by using coupons. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: automatically pays bills by using coupons.</p>
     * <p>*   **false**: does not automatically pay bills by using coupons.</p>
     * <br>
     * <p>>  This parameter takes effect only if the **AutoPay** parameter is set to **true**.</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the GA instance. The description can be up to 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the GA instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **1**: Small Ⅰ</p>
     * <p>*   **2**: Small Ⅱ</p>
     * <p>*   **3**: Small Ⅲ</p>
     * <p>*   **5**: Medium Ⅰ</p>
     * <p>*   **8**: Medium Ⅱ</p>
     * <p>*   **10**: Medium Ⅲ</p>
     * <p>*   **20**: Large Ⅰ</p>
     * <p>*   **30**: Large Ⅱ</p>
     * <p>*   **40**: Large Ⅲ</p>
     * <p>*   **50**: Large Ⅳ</p>
     * <p>*   **60**: Large Ⅴ</p>
     * <p>*   **70**: Large Ⅵ</p>
     * <p>*   **80**: Large VⅡ</p>
     * <p>*   **90**: Large VⅢ</p>
     * <p>*   **100**: Super Large Ⅰ</p>
     * <p>*   **200**: Super Large Ⅱ</p>
     * <br>
     * <p>>  The Large Ⅲ specification and higher specifications are available only for accounts that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
     * <br>
     * <p>Different specifications provide different capabilities. For more information, see [Instance specifications](~~153127~~).</p>
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

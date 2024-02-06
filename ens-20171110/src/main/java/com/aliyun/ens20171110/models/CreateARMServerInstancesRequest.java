// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateARMServerInstancesRequest extends TeaModel {
    /**
     * <p>The number of instances to create. Valid values: **1** to **100**.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to use coupons. Valid values: true and false Default value: true.</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The refresh rate. Unit: Hz. Valid values: 30 and 60.</p>
     */
    @NameInMap("Frequency")
    public Integer frequency;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The specification of the Android in Container (AIC) instance. Valid values:</p>
     * <br>
     * <p>*   aic.cf53r.c1.np</p>
     * <p>*   aic.cf53r.c2.np</p>
     * <p>*   aic.cf53r.c3.np</p>
     * <p>*   aic.cf53r.c4.np</p>
     * <p>*   aic.cf53r.c5.np</p>
     * <p>*   aic.cf53r.c6.np</p>
     * <p>*   aic.cf53r.c7.np</p>
     * <p>*   aic.cf53r.c8.np</p>
     * <p>*   ens.a6c2</p>
     * <p>*   aic.cf52m1r.c1.np</p>
     * <p>*   aic.cf52m1r.c2.np</p>
     * <p>*   aic.cf52m1r.c3.np</p>
     * <p>*   aic.cf52m1r.c4.np</p>
     * <p>*   aic.cf52m1r.c5.np</p>
     * <p>*   aic.cf53r.c6</p>
     * <p>*   aic.cf52m1r.c6</p>
     * <p>*   aic.cf53r.c7</p>
     * <p>*   aic.cf52r.c1.np</p>
     * <p>*   aic.cf52r.c2.np</p>
     * <p>*   aic.cf52r.c3.np</p>
     * <p>*   aic.cf52r.c4.np</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the key pair.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("NameSpace")
    public String nameSpace;

    /**
     * <p>The billing method. Set the value to **PrePaid**. PrePaid specifies the subscription billing method.</p>
     * <br>
     * <p>>  Only PrePaid is supported.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>*   If you leave PeriodUnit empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</p>
     * <p>*   If you set PeriodUnit to Day, you can set Period only to 3.</p>
     * <p>*   If you set PeriodUnit to Month, you can set Period to a value within the range of \[1,9], or set the value to 12.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * <br>
     * <p>*   If you leave PeriodUnit empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</p>
     * <p>*   If you set PeriodUnit to Day, you can set Period only to 3.</p>
     * <p>*   If you set PeriodUnit to Month, you can set Period to a value within the range of \[1,9], or set the value to 12.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The resolution. Valid values:</p>
     * <br>
     * <p>*   1920\*1080</p>
     * <p>*   1080\*1920</p>
     * <p>*   1280\*720</p>
     * <p>*   720\*1280</p>
     * <p>*   2400\*1080</p>
     * <p>*   1920\*864</p>
     * <p>*   1080\*2400</p>
     * <p>*   864\*1920</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   1920\*1080</p>
     * <p>*   1080\*1920</p>
     * <p>*   1280\*720</p>
     * <p>*   720\*1280</p>
     * <p>*   2400\*1080</p>
     * <p>*   1920\*864</p>
     * <p>*   1080\*2400</p>
     * <p>*   864\*1920</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    /**
     * <p>The specification of the ARM server. Valid values:</p>
     * <br>
     * <p>*   cas.cf53r</p>
     * <p>*   cas.cf52r</p>
     * <p>*   cas.cf52m1r</p>
     * <p>*   cas.tg52g2</p>
     * <p>*   ens.afq-c2m3i.medium</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    public static CreateARMServerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateARMServerInstancesRequest self = new CreateARMServerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateARMServerInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateARMServerInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateARMServerInstancesRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateARMServerInstancesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateARMServerInstancesRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }
    public Integer getFrequency() {
        return this.frequency;
    }

    public CreateARMServerInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateARMServerInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateARMServerInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateARMServerInstancesRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public CreateARMServerInstancesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateARMServerInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateARMServerInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateARMServerInstancesRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateARMServerInstancesRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

    public CreateARMServerInstancesRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

}

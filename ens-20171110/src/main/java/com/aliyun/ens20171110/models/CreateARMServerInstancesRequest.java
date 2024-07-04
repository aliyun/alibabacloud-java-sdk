// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateARMServerInstancesRequest extends TeaModel {
    /**
     * <p>The number of instances to create. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to use coupons. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guiyang-12</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The refresh rate. Unit: Hz. Valid values: 30 and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Frequency")
    public Integer frequency;

    /**
     * <p>The ID of the image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourImage ID</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The specification of the Android in Container (AIC) instance. Examples:</p>
     * <ul>
     * <li>aic.cf52r.c1.np</li>
     * <li>aic.cf52r.c2.np</li>
     * <li>aic.cf53r.c2.np</li>
     * <li>aic.cf52r.c4.np</li>
     * <li>aic.cf53r.c3.np</li>
     * <li>aic.cf52r.c3.np</li>
     * <li>aic.cf53r.c1.np</li>
     * <li>aic.cf53r.c5.np</li>
     * <li>aic.cf53r.c6</li>
     * <li>aic.cf53r.c4.np</li>
     * <li>aic.cf53r.c6.np</li>
     * <li>aic.cf53r.c7.np</li>
     * <li>aic.cf52m1r.c5.np</li>
     * <li>aic.cf53r.c8.np</li>
     * <li>aic.cf53r.c7</li>
     * <li>aic.cf52m1r.c2.np</li>
     * <li>aic.cf52m1r.c1.np</li>
     * <li>aic.cf52m1r.c3.np</li>
     * <li>aic.cf52m1r.c4.np</li>
     * <li>aic.cf52m1r.c6</li>
     * <li>ens.a6c2</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic.cf53r.c6.np</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>TestKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>pre</p>
     */
    @NameInMap("NameSpace")
    public String nameSpace;

    /**
     * <p>The billing method. Set the value to <strong>PrePaid</strong>. PrePaid specifies the subscription billing method.</p>
     * <blockquote>
     * <p> Only PrePaid is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription duration of the instance.</p>
     * <ul>
     * <li>If you leave PeriodUnit empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</li>
     * <li>If you set PeriodUnit to Day, you can set Period only to 3.</li>
     * <li>If you set PeriodUnit to Month, you can set Period to a value within the range of [1,9], or set the value to 12.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * <ul>
     * <li>If you leave PeriodUnit empty, the instance is purchased on a monthly basis. Valid values: Day and Month.</li>
     * <li>If you set PeriodUnit to Day, you can set Period only to 3.</li>
     * <li>If you set PeriodUnit to Month, you can set Period to a value within the range of [1,9], or set the value to 12.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The resolution. Examples:</p>
     * <ul>
     * <li>1920\*864</li>
     * <li>1080\*1920</li>
     * <li>1920\*1080</li>
     * <li>720\*1280</li>
     * <li>2400\*1080</li>
     * <li>1080\*2400</li>
     * <li>1280\*720</li>
     * <li>864\*1920</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>720*1280</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>AIC-Server</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    /**
     * <p>The specification of the ARM server. Examples:</p>
     * <ul>
     * <li>cas.cf53r</li>
     * <li>cas.cf52r</li>
     * <li>cas.cf52m1r</li>
     * <li>cas.tg52g2</li>
     * <li>ens.afq-c2m3i.medium</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas.cf53r</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateARMServerInstancesRequest extends TeaModel {
    /**
     * <p>The number of instances to create. Minimum value: <strong>1</strong>. Maximum value: <strong>100</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>Specifies whether to use coupons. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>The IPv4 CIDR block used by the instance, in CIDR notation.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The ENS edge zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guiyang-12</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>One or more environment variables to set during EAIS instance initialization.</p>
     * 
     * <strong>example:</strong>
     * <p>[object Object]</p>
     */
    @NameInMap("EnvironmentVar")
    public String environmentVar;

    /**
     * <p>The refresh rate, in Hz. Valid values: 30 and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Frequency")
    public Integer frequency;

    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourImage ID</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance billing cycle. Valid values:</p>
     * <ul>
     * <li>Hour</li>
     * <li>Day</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("InstanceBillingCycle")
    public String instanceBillingCycle;

    /**
     * <p>The instance type of the AIC container instance. Valid values:</p>
     * <ul>
     * <li><p>aic.cf52r.c1.np</p>
     * </li>
     * <li><p>aic.cf52r.c2.np</p>
     * </li>
     * <li><p>aic.cf53r.c2.np</p>
     * </li>
     * <li><p>aic.cf52r.c4.np</p>
     * </li>
     * <li><p>aic.cf53r.c3.np</p>
     * </li>
     * <li><p>aic.cf52r.c3.np</p>
     * </li>
     * <li><p>aic.cf53r.c1.np</p>
     * </li>
     * <li><p>aic.cf53r.c5.np</p>
     * </li>
     * <li><p>aic.cf53r.c6</p>
     * </li>
     * <li><p>aic.cf53r.c4.np</p>
     * </li>
     * <li><p>aic.cf53r.c6.np</p>
     * </li>
     * <li><p>aic.cf53r.c7.np</p>
     * </li>
     * <li><p>aic.cf52m1r.c5.np</p>
     * </li>
     * <li><p>aic.cf53r.c8.np</p>
     * </li>
     * <li><p>aic.cf53r.c7</p>
     * </li>
     * <li><p>aic.cf52m1r.c2.np</p>
     * </li>
     * <li><p>aic.cf52m1r.c1.np</p>
     * </li>
     * <li><p>aic.cf52m1r.c3.np</p>
     * </li>
     * <li><p>aic.cf52m1r.c4.np</p>
     * </li>
     * <li><p>aic.cf52m1r.c6</p>
     * </li>
     * <li><p>ens.a6c2</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic.cf53r.c6.np</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The key pair name.</p>
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
     * <p>The billing type. Valid values: <strong>PrePaid</strong> (subscription).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The duration for which you want to purchase the resource.</p>
     * <ul>
     * <li>If you do not specify PeriodUnit, the resource is purchased on a monthly basis by default. Currently, only Days and Month are supported.</li>
     * <li>If PeriodUnit is set to Day, Period can only be set to 3.</li>
     * <li>If PeriodUnit is set to Month, Period can be set to 1 to 9 or 12.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the purchase duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The resolution. Valid values:</p>
     * <ul>
     * <li><p>1920*864</p>
     * </li>
     * <li><p>1080*1920</p>
     * </li>
     * <li><p>1920*1080</p>
     * </li>
     * <li><p>720*1280</p>
     * </li>
     * <li><p>2400*1080</p>
     * </li>
     * <li><p>1080*2400</p>
     * </li>
     * <li><p>1280*720</p>
     * </li>
     * <li><p>864*1920</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>720*1280</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>AIC-Server</p>
     */
    @NameInMap("ServerName")
    public String serverName;

    /**
     * <p>The ARM board specification. Valid values:</p>
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

    /**
     * <p>The list of tags bound to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateARMServerInstancesRequestTag> tag;

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

    public CreateARMServerInstancesRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateARMServerInstancesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateARMServerInstancesRequest setEnvironmentVar(String environmentVar) {
        this.environmentVar = environmentVar;
        return this;
    }
    public String getEnvironmentVar() {
        return this.environmentVar;
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

    public CreateARMServerInstancesRequest setInstanceBillingCycle(String instanceBillingCycle) {
        this.instanceBillingCycle = instanceBillingCycle;
        return this;
    }
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
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

    public CreateARMServerInstancesRequest setTag(java.util.List<CreateARMServerInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateARMServerInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateARMServerInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>backend</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateARMServerInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateARMServerInstancesRequestTag self = new CreateARMServerInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateARMServerInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateARMServerInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

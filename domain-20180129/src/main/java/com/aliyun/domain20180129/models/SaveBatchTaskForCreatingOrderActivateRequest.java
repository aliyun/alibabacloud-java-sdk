// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForCreatingOrderActivateRequest extends TeaModel {
    /**
     * <p>The voucher ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The language of the error message returned by the API operation. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of task details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderActivateParam")
    public java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> orderActivateParam;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123124</p>
     */
    @NameInMap("PromotionNo")
    public String promotionNo;

    /**
     * <p>Specifies whether to use a voucher.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCoupon")
    public Boolean useCoupon;

    /**
     * <p>Specifies whether to use a coupon.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UsePromotion")
    public Boolean usePromotion;

    /**
     * <p>The IP address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForCreatingOrderActivateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForCreatingOrderActivateRequest self = new SaveBatchTaskForCreatingOrderActivateRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setOrderActivateParam(java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> orderActivateParam) {
        this.orderActivateParam = orderActivateParam;
        return this;
    }
    public java.util.List<SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam> getOrderActivateParam() {
        return this.orderActivateParam;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
        return this;
    }
    public String getPromotionNo() {
        return this.promotionNo;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUseCoupon(Boolean useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUsePromotion(Boolean usePromotion) {
        this.usePromotion = usePromotion;
        return this;
    }
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    public SaveBatchTaskForCreatingOrderActivateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static class SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam extends TeaModel {
        /**
         * <p>The mailing address in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>chao yan qu *** dasha *** hao</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Specifies whether to use Alibaba Cloud DNS. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: <strong>true</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>If this parameter is set to <strong>true</strong>, you do not need to specify the <strong>OrderActivateParam.N.Dns1</strong> and <strong>OrderActivateParam.N.Dns2</strong> parameters. Otherwise, the specified <strong>OrderActivateParam.N.Dns1</strong> and <strong>OrderActivateParam.N.Dns2</strong> parameters do not take effect.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If this parameter is set to <strong>false</strong>, you must also specify the <strong>OrderActivateParam.N.Dns1</strong> and <strong>OrderActivateParam.N.Dns2</strong> parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AliyunDns")
        public Boolean aliyunDns;

        /**
         * <p>The city name in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bei jing shi</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The country code. For example, <strong>CN</strong> represents China, and <strong>US</strong> represents the United States.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The custom DNS server 1.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when the <strong>OrderActivateParam.N.AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ns2.aliyun.com</p>
         */
        @NameInMap("Dns1")
        public String dns1;

        /**
         * <p>The custom DNS server 2.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when the <strong>OrderActivateParam.N.AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ns1.aliyun.com</p>
         */
        @NameInMap("Dns2")
        public String dns2;

        /**
         * <p>The domain name to be registered.</p>
         * <blockquote>
         * <p>When you register a domain name, you must specify the domain name registrant information. Otherwise, the domain name registration fails. You can specify the domain name registrant information by using the OrderActivateParam.N.RegistrantProfileId parameter to associate a domain name registrant profile.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The email address.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Specifies whether to enable the domain name privacy protection service. Default value: <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDomainProxy")
        public Boolean enableDomainProxy;

        /**
         * <p>The domain name in Punycode format. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>xn--fiqs8s.com</p>
         */
        @NameInMap("ExpectedPunycode")
        public String expectedPunycode;

        /**
         * <p>Specifies whether to allow the registration of premium domain names. Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PermitPremiumActivation")
        public Boolean permitPremiumActivation;

        /**
         * <p>The postal code.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>102629</p>
         */
        @NameInMap("PostalCode")
        public String postalCode;

        /**
         * <p>The province name in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bei jing</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The domain name contact in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zhang san</p>
         */
        @NameInMap("RegistrantName")
        public String registrantName;

        /**
         * <p>The name of the domain name registrant in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zhang san</p>
         */
        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        /**
         * <p>The ID of the domain name registrant profile. The profile contains information such as the name of the domain name registrant, the domain name contact, the phone number, and the email address. You can only use the ID of a real-name verified domain name registrant profile to register a domain name. If you have created a domain name registrant profile, you can call the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> operation to query the profile ID.</p>
         * <blockquote>
         * <p>After you specify this parameter, you do not need to specify the <strong>OrderActivateParam.N.RegistrantType</strong>, <strong>OrderActivateParam.N.ZhRegistrantOrganization</strong>, <strong>OrderActivateParam.N.ZhRegistrantName</strong>, <strong>OrderActivateParam.N.ZhProvince</strong>, <strong>OrderActivateParam.N.ZhCity</strong>, <strong>OrderActivateParam.N.ZhAddress</strong>, <strong>OrderActivateParam.N.RegistrantOrganization</strong>, <strong>OrderActivateParam.N.RegistrantName</strong>, <strong>OrderActivateParam.N.Province</strong>, <strong>OrderActivateParam.N.City</strong>, <strong>OrderActivateParam.N.Address</strong>, <strong>OrderActivateParam.N.PostalCode</strong>, <strong>OrderActivateParam.N.Country</strong>, <strong>OrderActivateParam.N.TelArea</strong>, <strong>OrderActivateParam.N.Telephone</strong>, <strong>OrderActivateParam.N.TelExt</strong>, and <strong>OrderActivateParam.N.Email</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>000000</p>
         */
        @NameInMap("RegistrantProfileId")
        public Long registrantProfileId;

        /**
         * <p>The type of the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Individual.</li>
         * <li><strong>2</strong>: Enterprise or organization.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegistrantType")
        public String registrantType;

        /**
         * <p>The resource group ID.</p>
         * <blockquote>
         * <p>If this parameter is not specified or the specified resource group ID does not exist, the default resource group ID is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-XX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The subscription duration. Unit: <strong>year</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubscriptionDuration")
        public Integer subscriptionDuration;

        /**
         * <p>The country code for the phone number. For example, the country code for China is <strong>86</strong>.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("TelArea")
        public String telArea;

        /**
         * <p>The extension number.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TelExt")
        public String telExt;

        /**
         * <p>The phone number.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1820000****</p>
         */
        @NameInMap("Telephone")
        public String telephone;

        /**
         * <p>Specifies whether to allow the registration of trademark terms.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TrademarkDomainActivation")
        public Boolean trademarkDomainActivation;

        /**
         * <p>The mailing address in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>朝阳区<em><strong>大厦</strong></em>号</p>
         */
        @NameInMap("ZhAddress")
        public String zhAddress;

        /**
         * <p>The city name in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("ZhCity")
        public String zhCity;

        /**
         * <p>The province name in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("ZhProvince")
        public String zhProvince;

        /**
         * <p>The domain name contact in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("ZhRegistrantName")
        public String zhRegistrantName;

        /**
         * <p>The name of the domain name registrant in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        public static SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam build(java.util.Map<String, ?> map) throws Exception {
            SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam self = new SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam();
            return TeaModel.build(map, self);
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setAliyunDns(Boolean aliyunDns) {
            this.aliyunDns = aliyunDns;
            return this;
        }
        public Boolean getAliyunDns() {
            return this.aliyunDns;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDns1(String dns1) {
            this.dns1 = dns1;
            return this;
        }
        public String getDns1() {
            return this.dns1;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDns2(String dns2) {
            this.dns2 = dns2;
            return this;
        }
        public String getDns2() {
            return this.dns2;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setEnableDomainProxy(Boolean enableDomainProxy) {
            this.enableDomainProxy = enableDomainProxy;
            return this;
        }
        public Boolean getEnableDomainProxy() {
            return this.enableDomainProxy;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setExpectedPunycode(String expectedPunycode) {
            this.expectedPunycode = expectedPunycode;
            return this;
        }
        public String getExpectedPunycode() {
            return this.expectedPunycode;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setPermitPremiumActivation(Boolean permitPremiumActivation) {
            this.permitPremiumActivation = permitPremiumActivation;
            return this;
        }
        public Boolean getPermitPremiumActivation() {
            return this.permitPremiumActivation;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }
        public String getRegistrantName() {
            return this.registrantName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setSubscriptionDuration(Integer subscriptionDuration) {
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setTrademarkDomainActivation(Boolean trademarkDomainActivation) {
            this.trademarkDomainActivation = trademarkDomainActivation;
            return this;
        }
        public Boolean getTrademarkDomainActivation() {
            return this.trademarkDomainActivation;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhAddress(String zhAddress) {
            this.zhAddress = zhAddress;
            return this;
        }
        public String getZhAddress() {
            return this.zhAddress;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhCity(String zhCity) {
            this.zhCity = zhCity;
            return this;
        }
        public String getZhCity() {
            return this.zhCity;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhProvince(String zhProvince) {
            this.zhProvince = zhProvince;
            return this;
        }
        public String getZhProvince() {
            return this.zhProvince;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        public SaveBatchTaskForCreatingOrderActivateRequestOrderActivateParam setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsOrderRequest extends TeaModel {
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("SiteNum")
    public String siteNum;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("UrlNum")
    public String urlNum;

    @NameInMap("AddVulNum")
    public String addVulNum;

    public static CreateAvdsOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsOrderRequest self = new CreateAvdsOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateAvdsOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAvdsOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAvdsOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAvdsOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateAvdsOrderRequest setSiteNum(String siteNum) {
        this.siteNum = siteNum;
        return this;
    }
    public String getSiteNum() {
        return this.siteNum;
    }

    public CreateAvdsOrderRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public CreateAvdsOrderRequest setUrlNum(String urlNum) {
        this.urlNum = urlNum;
        return this;
    }
    public String getUrlNum() {
        return this.urlNum;
    }

    public CreateAvdsOrderRequest setAddVulNum(String addVulNum) {
        this.addVulNum = addVulNum;
        return this;
    }
    public String getAddVulNum() {
        return this.addVulNum;
    }

}

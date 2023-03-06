// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SubmitIsvCustomerTermsRequest extends TeaModel {
    @NameInMap("BusinessDesc")
    public String businessDesc;

    @NameInMap("ContactMail")
    public String contactMail;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("CustName")
    public String custName;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("IsvTerms")
    public String isvTerms;

    @NameInMap("OfficeAddress")
    public String officeAddress;

    public static SubmitIsvCustomerTermsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIsvCustomerTermsRequest self = new SubmitIsvCustomerTermsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIsvCustomerTermsRequest setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
        return this;
    }
    public String getBusinessDesc() {
        return this.businessDesc;
    }

    public SubmitIsvCustomerTermsRequest setContactMail(String contactMail) {
        this.contactMail = contactMail;
        return this;
    }
    public String getContactMail() {
        return this.contactMail;
    }

    public SubmitIsvCustomerTermsRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitIsvCustomerTermsRequest setCustName(String custName) {
        this.custName = custName;
        return this;
    }
    public String getCustName() {
        return this.custName;
    }

    public SubmitIsvCustomerTermsRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public SubmitIsvCustomerTermsRequest setIsvTerms(String isvTerms) {
        this.isvTerms = isvTerms;
        return this;
    }
    public String getIsvTerms() {
        return this.isvTerms;
    }

    public SubmitIsvCustomerTermsRequest setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
        return this;
    }
    public String getOfficeAddress() {
        return this.officeAddress;
    }

}

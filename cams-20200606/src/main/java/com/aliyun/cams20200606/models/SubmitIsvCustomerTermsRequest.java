// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SubmitIsvCustomerTermsRequest extends TeaModel {
    /**
     * <p>The business scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Marketing products</p>
     */
    @NameInMap("BusinessDesc")
    public String businessDesc;

    /**
     * <p>The enterprise mail.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:partner@aliyun.com">partner@aliyun.com</a></p>
     */
    @NameInMap("ContactMail")
    public String contactMail;

    /**
     * <p>The country code.</p>
     * <blockquote>
     * <p> For more information about country codes, see <a href="https://help.aliyun.com/document_detail/608210.html">Country codes</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>The enterprise name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("CustName")
    public String custName;

    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV or Client agreement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>isvTerms.pdf</p>
     */
    @NameInMap("IsvTerms")
    public String isvTerms;

    /**
     * <p>The enterprise address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCompaniesResponseBody extends TeaModel {
    /**
     * <p>The list of companies.</p>
     */
    @NameInMap("CompanyList")
    public java.util.List<ListCompaniesResponseBodyCompanyList> companyList;

    /**
     * <p>Settings the page number of the current page in a paged query for paging. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>285BBE08-F12B-5A04-97BC-09EA7FF18646</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of certificates to display per page in a paged query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of search results.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCompaniesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompaniesResponseBody self = new ListCompaniesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompaniesResponseBody setCompanyList(java.util.List<ListCompaniesResponseBodyCompanyList> companyList) {
        this.companyList = companyList;
        return this;
    }
    public java.util.List<ListCompaniesResponseBodyCompanyList> getCompanyList() {
        return this.companyList;
    }

    public ListCompaniesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCompaniesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCompaniesResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListCompaniesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCompaniesResponseBodyCompanyList extends TeaModel {
        /**
         * <p>The city.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The company address.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CompanyAddress")
        public String companyAddress;

        /**
         * <p>The company code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CompanyCode")
        public String companyCode;

        /**
         * <p>The company email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@163.com">test@163.com</a></p>
         */
        @NameInMap("CompanyEmail")
        public String companyEmail;

        /**
         * <p>The company ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51001</p>
         */
        @NameInMap("CompanyId")
        public Long companyId;

        /**
         * <p>The name of the company or organization.</p>
         * 
         * <strong>example:</strong>
         * <p>testYanwen045</p>
         */
        @NameInMap("CompanyName")
        public String companyName;

        /**
         * <p>The company phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1511</p>
         */
        @NameInMap("CompanyPhone")
        public String companyPhone;

        /**
         * <p>The company code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CompanyType")
        public Integer companyType;

        /**
         * <p>The country code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The department.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The postal code.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("PostCode")
        public String postCode;

        /**
         * <p>The province.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Province")
        public String province;

        public static ListCompaniesResponseBodyCompanyList build(java.util.Map<String, ?> map) throws Exception {
            ListCompaniesResponseBodyCompanyList self = new ListCompaniesResponseBodyCompanyList();
            return TeaModel.build(map, self);
        }

        public ListCompaniesResponseBodyCompanyList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            return this;
        }
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
            return this;
        }
        public String getCompanyCode() {
            return this.companyCode;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyEmail(String companyEmail) {
            this.companyEmail = companyEmail;
            return this;
        }
        public String getCompanyEmail() {
            return this.companyEmail;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }
        public Long getCompanyId() {
            return this.companyId;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyPhone(String companyPhone) {
            this.companyPhone = companyPhone;
            return this;
        }
        public String getCompanyPhone() {
            return this.companyPhone;
        }

        public ListCompaniesResponseBodyCompanyList setCompanyType(Integer companyType) {
            this.companyType = companyType;
            return this;
        }
        public Integer getCompanyType() {
            return this.companyType;
        }

        public ListCompaniesResponseBodyCompanyList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListCompaniesResponseBodyCompanyList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListCompaniesResponseBodyCompanyList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListCompaniesResponseBodyCompanyList setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public ListCompaniesResponseBodyCompanyList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}

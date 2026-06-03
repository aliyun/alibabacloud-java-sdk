// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListCertificateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCertificateResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertificateResponseBody self = new ListCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertificateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCertificateResponseBody setData(java.util.List<ListCertificateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCertificateResponseBodyData> getData() {
        return this.data;
    }

    public ListCertificateResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCertificateResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertificateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertificateResponseBodyData extends TeaModel {
        @NameInMap("AuthorizationTime")
        public Long authorizationTime;

        @NameInMap("BlockchainNo")
        public String blockchainNo;

        @NameInMap("BusinessTypeList")
        public java.util.List<Integer> businessTypeList;

        @NameInMap("CancelTime")
        public Long cancelTime;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("SchemeType")
        public Integer schemeType;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public Integer status;

        public static ListCertificateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCertificateResponseBodyData self = new ListCertificateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCertificateResponseBodyData setAuthorizationTime(Long authorizationTime) {
            this.authorizationTime = authorizationTime;
            return this;
        }
        public Long getAuthorizationTime() {
            return this.authorizationTime;
        }

        public ListCertificateResponseBodyData setBlockchainNo(String blockchainNo) {
            this.blockchainNo = blockchainNo;
            return this;
        }
        public String getBlockchainNo() {
            return this.blockchainNo;
        }

        public ListCertificateResponseBodyData setBusinessTypeList(java.util.List<Integer> businessTypeList) {
            this.businessTypeList = businessTypeList;
            return this;
        }
        public java.util.List<Integer> getBusinessTypeList() {
            return this.businessTypeList;
        }

        public ListCertificateResponseBodyData setCancelTime(Long cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public Long getCancelTime() {
            return this.cancelTime;
        }

        public ListCertificateResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public ListCertificateResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListCertificateResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public ListCertificateResponseBodyData setSchemeType(Integer schemeType) {
            this.schemeType = schemeType;
            return this;
        }
        public Integer getSchemeType() {
            return this.schemeType;
        }

        public ListCertificateResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListCertificateResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}

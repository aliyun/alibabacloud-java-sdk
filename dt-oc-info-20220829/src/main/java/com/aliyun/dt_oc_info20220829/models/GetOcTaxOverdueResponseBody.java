// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxOverdueResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcTaxOverdueResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static GetOcTaxOverdueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxOverdueResponseBody self = new GetOcTaxOverdueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcTaxOverdueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcTaxOverdueResponseBody setData(java.util.List<GetOcTaxOverdueResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcTaxOverdueResponseBodyData> getData() {
        return this.data;
    }

    public GetOcTaxOverdueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcTaxOverdueResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcTaxOverdueResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcTaxOverdueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcTaxOverdueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcTaxOverdueResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcTaxOverdueResponseBodyData extends TeaModel {
        @NameInMap("CurrOverdueAmount")
        public String currOverdueAmount;

        @NameInMap("Department")
        public String department;

        @NameInMap("EntAddress")
        public String entAddress;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("OverdueAmount")
        public String overdueAmount;

        @NameInMap("OverdueType")
        public String overdueType;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("TaxpayerNum")
        public String taxpayerNum;

        @NameInMap("TaxpayerType")
        public String taxpayerType;

        public static GetOcTaxOverdueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcTaxOverdueResponseBodyData self = new GetOcTaxOverdueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcTaxOverdueResponseBodyData setCurrOverdueAmount(String currOverdueAmount) {
            this.currOverdueAmount = currOverdueAmount;
            return this;
        }
        public String getCurrOverdueAmount() {
            return this.currOverdueAmount;
        }

        public GetOcTaxOverdueResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcTaxOverdueResponseBodyData setEntAddress(String entAddress) {
            this.entAddress = entAddress;
            return this;
        }
        public String getEntAddress() {
            return this.entAddress;
        }

        public GetOcTaxOverdueResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcTaxOverdueResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcTaxOverdueResponseBodyData setOverdueAmount(String overdueAmount) {
            this.overdueAmount = overdueAmount;
            return this;
        }
        public String getOverdueAmount() {
            return this.overdueAmount;
        }

        public GetOcTaxOverdueResponseBodyData setOverdueType(String overdueType) {
            this.overdueType = overdueType;
            return this;
        }
        public String getOverdueType() {
            return this.overdueType;
        }

        public GetOcTaxOverdueResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public GetOcTaxOverdueResponseBodyData setTaxpayerNum(String taxpayerNum) {
            this.taxpayerNum = taxpayerNum;
            return this;
        }
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        public GetOcTaxOverdueResponseBodyData setTaxpayerType(String taxpayerType) {
            this.taxpayerType = taxpayerType;
            return this;
        }
        public String getTaxpayerType() {
            return this.taxpayerType;
        }

    }

}

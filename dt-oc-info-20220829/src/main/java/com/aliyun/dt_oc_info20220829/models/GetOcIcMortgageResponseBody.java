// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcMortgageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcIcMortgageResponseBodyData> data;

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

    public static GetOcIcMortgageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcMortgageResponseBody self = new GetOcIcMortgageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcIcMortgageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcIcMortgageResponseBody setData(java.util.List<GetOcIcMortgageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcIcMortgageResponseBodyData> getData() {
        return this.data;
    }

    public GetOcIcMortgageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcIcMortgageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcIcMortgageResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcIcMortgageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcMortgageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcIcMortgageResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcIcMortgageResponseBodyData extends TeaModel {
        @NameInMap("DebitAmount")
        public String debitAmount;

        @NameInMap("DebitPeriod")
        public String debitPeriod;

        @NameInMap("DebitScope")
        public String debitScope;

        @NameInMap("DebitType")
        public String debitType;

        @NameInMap("Department")
        public String department;

        @NameInMap("Guarantees")
        public String guarantees;

        @NameInMap("IdentifyNo")
        public String identifyNo;

        @NameInMap("IdentifyType")
        public String identifyType;

        @NameInMap("MortgageesName")
        public String mortgageesName;

        @NameInMap("Number")
        public String number;

        /**
         * <p>ocid</p>
         */
        @NameInMap("OnecompId")
        public String onecompId;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("RegDate")
        public String regDate;

        @NameInMap("Status")
        public String status;

        public static GetOcIcMortgageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcIcMortgageResponseBodyData self = new GetOcIcMortgageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcIcMortgageResponseBodyData setDebitAmount(String debitAmount) {
            this.debitAmount = debitAmount;
            return this;
        }
        public String getDebitAmount() {
            return this.debitAmount;
        }

        public GetOcIcMortgageResponseBodyData setDebitPeriod(String debitPeriod) {
            this.debitPeriod = debitPeriod;
            return this;
        }
        public String getDebitPeriod() {
            return this.debitPeriod;
        }

        public GetOcIcMortgageResponseBodyData setDebitScope(String debitScope) {
            this.debitScope = debitScope;
            return this;
        }
        public String getDebitScope() {
            return this.debitScope;
        }

        public GetOcIcMortgageResponseBodyData setDebitType(String debitType) {
            this.debitType = debitType;
            return this;
        }
        public String getDebitType() {
            return this.debitType;
        }

        public GetOcIcMortgageResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcIcMortgageResponseBodyData setGuarantees(String guarantees) {
            this.guarantees = guarantees;
            return this;
        }
        public String getGuarantees() {
            return this.guarantees;
        }

        public GetOcIcMortgageResponseBodyData setIdentifyNo(String identifyNo) {
            this.identifyNo = identifyNo;
            return this;
        }
        public String getIdentifyNo() {
            return this.identifyNo;
        }

        public GetOcIcMortgageResponseBodyData setIdentifyType(String identifyType) {
            this.identifyType = identifyType;
            return this;
        }
        public String getIdentifyType() {
            return this.identifyType;
        }

        public GetOcIcMortgageResponseBodyData setMortgageesName(String mortgageesName) {
            this.mortgageesName = mortgageesName;
            return this;
        }
        public String getMortgageesName() {
            return this.mortgageesName;
        }

        public GetOcIcMortgageResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetOcIcMortgageResponseBodyData setOnecompId(String onecompId) {
            this.onecompId = onecompId;
            return this;
        }
        public String getOnecompId() {
            return this.onecompId;
        }

        public GetOcIcMortgageResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcIcMortgageResponseBodyData setRegDate(String regDate) {
            this.regDate = regDate;
            return this;
        }
        public String getRegDate() {
            return this.regDate;
        }

        public GetOcIcMortgageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

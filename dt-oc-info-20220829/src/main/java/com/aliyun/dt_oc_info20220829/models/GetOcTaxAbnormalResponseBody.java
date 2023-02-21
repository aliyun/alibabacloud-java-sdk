// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxAbnormalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcTaxAbnormalResponseBodyData> data;

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

    public static GetOcTaxAbnormalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxAbnormalResponseBody self = new GetOcTaxAbnormalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcTaxAbnormalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcTaxAbnormalResponseBody setData(java.util.List<GetOcTaxAbnormalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcTaxAbnormalResponseBodyData> getData() {
        return this.data;
    }

    public GetOcTaxAbnormalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcTaxAbnormalResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcTaxAbnormalResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcTaxAbnormalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcTaxAbnormalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcTaxAbnormalResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcTaxAbnormalResponseBodyData extends TeaModel {
        @NameInMap("CardNum")
        public String cardNum;

        @NameInMap("CardType")
        public String cardType;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("JudgeDate")
        public String judgeDate;

        @NameInMap("JudgeDepartment")
        public String judgeDepartment;

        @NameInMap("JudgeReason")
        public String judgeReason;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("OverdueAmount")
        public String overdueAmount;

        @NameInMap("OverdueType")
        public String overdueType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaxpayerNum")
        public String taxpayerNum;

        public static GetOcTaxAbnormalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcTaxAbnormalResponseBodyData self = new GetOcTaxAbnormalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcTaxAbnormalResponseBodyData setCardNum(String cardNum) {
            this.cardNum = cardNum;
            return this;
        }
        public String getCardNum() {
            return this.cardNum;
        }

        public GetOcTaxAbnormalResponseBodyData setCardType(String cardType) {
            this.cardType = cardType;
            return this;
        }
        public String getCardType() {
            return this.cardType;
        }

        public GetOcTaxAbnormalResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcTaxAbnormalResponseBodyData setJudgeDate(String judgeDate) {
            this.judgeDate = judgeDate;
            return this;
        }
        public String getJudgeDate() {
            return this.judgeDate;
        }

        public GetOcTaxAbnormalResponseBodyData setJudgeDepartment(String judgeDepartment) {
            this.judgeDepartment = judgeDepartment;
            return this;
        }
        public String getJudgeDepartment() {
            return this.judgeDepartment;
        }

        public GetOcTaxAbnormalResponseBodyData setJudgeReason(String judgeReason) {
            this.judgeReason = judgeReason;
            return this;
        }
        public String getJudgeReason() {
            return this.judgeReason;
        }

        public GetOcTaxAbnormalResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcTaxAbnormalResponseBodyData setOverdueAmount(String overdueAmount) {
            this.overdueAmount = overdueAmount;
            return this;
        }
        public String getOverdueAmount() {
            return this.overdueAmount;
        }

        public GetOcTaxAbnormalResponseBodyData setOverdueType(String overdueType) {
            this.overdueType = overdueType;
            return this;
        }
        public String getOverdueType() {
            return this.overdueType;
        }

        public GetOcTaxAbnormalResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetOcTaxAbnormalResponseBodyData setTaxpayerNum(String taxpayerNum) {
            this.taxpayerNum = taxpayerNum;
            return this;
        }
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

    }

}

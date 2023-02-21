// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeDishonestyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeDishonestyResponseBodyData> data;

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

    public static GetOcJusticeDishonestyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeDishonestyResponseBody self = new GetOcJusticeDishonestyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeDishonestyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeDishonestyResponseBody setData(java.util.List<GetOcJusticeDishonestyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeDishonestyResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeDishonestyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeDishonestyResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeDishonestyResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeDishonestyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeDishonestyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeDishonestyResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeDishonestyResponseBodyData extends TeaModel {
        @NameInMap("Amount")
        public String amount;

        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("Court")
        public String court;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("ExecuteDepartment")
        public String executeDepartment;

        @NameInMap("ExecutionDesc")
        public String executionDesc;

        @NameInMap("ExecutionStatus")
        public String executionStatus;

        @NameInMap("FilingDate")
        public String filingDate;

        @NameInMap("FinalDuty")
        public String finalDuty;

        @NameInMap("FromCaseNum")
        public String fromCaseNum;

        @NameInMap("LegalName")
        public String legalName;

        @NameInMap("Province")
        public String province;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("SocialCreditCode")
        public String socialCreditCode;

        public static GetOcJusticeDishonestyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeDishonestyResponseBodyData self = new GetOcJusticeDishonestyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeDishonestyResponseBodyData setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public GetOcJusticeDishonestyResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeDishonestyResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeDishonestyResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcJusticeDishonestyResponseBodyData setExecuteDepartment(String executeDepartment) {
            this.executeDepartment = executeDepartment;
            return this;
        }
        public String getExecuteDepartment() {
            return this.executeDepartment;
        }

        public GetOcJusticeDishonestyResponseBodyData setExecutionDesc(String executionDesc) {
            this.executionDesc = executionDesc;
            return this;
        }
        public String getExecutionDesc() {
            return this.executionDesc;
        }

        public GetOcJusticeDishonestyResponseBodyData setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public GetOcJusticeDishonestyResponseBodyData setFilingDate(String filingDate) {
            this.filingDate = filingDate;
            return this;
        }
        public String getFilingDate() {
            return this.filingDate;
        }

        public GetOcJusticeDishonestyResponseBodyData setFinalDuty(String finalDuty) {
            this.finalDuty = finalDuty;
            return this;
        }
        public String getFinalDuty() {
            return this.finalDuty;
        }

        public GetOcJusticeDishonestyResponseBodyData setFromCaseNum(String fromCaseNum) {
            this.fromCaseNum = fromCaseNum;
            return this;
        }
        public String getFromCaseNum() {
            return this.fromCaseNum;
        }

        public GetOcJusticeDishonestyResponseBodyData setLegalName(String legalName) {
            this.legalName = legalName;
            return this;
        }
        public String getLegalName() {
            return this.legalName;
        }

        public GetOcJusticeDishonestyResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetOcJusticeDishonestyResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public GetOcJusticeDishonestyResponseBodyData setSocialCreditCode(String socialCreditCode) {
            this.socialCreditCode = socialCreditCode;
            return this;
        }
        public String getSocialCreditCode() {
            return this.socialCreditCode;
        }

    }

}

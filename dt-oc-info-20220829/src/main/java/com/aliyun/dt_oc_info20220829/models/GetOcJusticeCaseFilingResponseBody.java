// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeCaseFilingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeCaseFilingResponseBodyData> data;

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

    public static GetOcJusticeCaseFilingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeCaseFilingResponseBody self = new GetOcJusticeCaseFilingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeCaseFilingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeCaseFilingResponseBody setData(java.util.List<GetOcJusticeCaseFilingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeCaseFilingResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeCaseFilingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeCaseFilingResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeCaseFilingResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeCaseFilingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeCaseFilingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeCaseFilingResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeCaseFilingResponseBodyData extends TeaModel {
        @NameInMap("Assistant")
        public String assistant;

        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("CaseStatus")
        public String caseStatus;

        @NameInMap("CauseAction")
        public String causeAction;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("FilingDate")
        public String filingDate;

        @NameInMap("HearingDate")
        public String hearingDate;

        @NameInMap("Judge")
        public String judge;

        @NameInMap("Party")
        public String party;

        @NameInMap("Role")
        public String role;

        public static GetOcJusticeCaseFilingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeCaseFilingResponseBodyData self = new GetOcJusticeCaseFilingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeCaseFilingResponseBodyData setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public GetOcJusticeCaseFilingResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeCaseFilingResponseBodyData setCaseStatus(String caseStatus) {
            this.caseStatus = caseStatus;
            return this;
        }
        public String getCaseStatus() {
            return this.caseStatus;
        }

        public GetOcJusticeCaseFilingResponseBodyData setCauseAction(String causeAction) {
            this.causeAction = causeAction;
            return this;
        }
        public String getCauseAction() {
            return this.causeAction;
        }

        public GetOcJusticeCaseFilingResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetOcJusticeCaseFilingResponseBodyData setFilingDate(String filingDate) {
            this.filingDate = filingDate;
            return this;
        }
        public String getFilingDate() {
            return this.filingDate;
        }

        public GetOcJusticeCaseFilingResponseBodyData setHearingDate(String hearingDate) {
            this.hearingDate = hearingDate;
            return this;
        }
        public String getHearingDate() {
            return this.hearingDate;
        }

        public GetOcJusticeCaseFilingResponseBodyData setJudge(String judge) {
            this.judge = judge;
            return this;
        }
        public String getJudge() {
            return this.judge;
        }

        public GetOcJusticeCaseFilingResponseBodyData setParty(String party) {
            this.party = party;
            return this;
        }
        public String getParty() {
            return this.party;
        }

        public GetOcJusticeCaseFilingResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}

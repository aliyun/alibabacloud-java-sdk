// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeJudgementDocResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeJudgementDocResponseBodyData> data;

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

    public static GetOcJusticeJudgementDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeJudgementDocResponseBody self = new GetOcJusticeJudgementDocResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeJudgementDocResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeJudgementDocResponseBody setData(java.util.List<GetOcJusticeJudgementDocResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeJudgementDocResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeJudgementDocResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeJudgementDocResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeJudgementDocResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeJudgementDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeJudgementDocResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeJudgementDocResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeJudgementDocResponseBodyData extends TeaModel {
        @NameInMap("CaseFlow")
        public String caseFlow;

        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("CaseType")
        public String caseType;

        @NameInMap("CauseAction")
        public String causeAction;

        @NameInMap("Court")
        public String court;

        @NameInMap("Defendant")
        public String defendant;

        @NameInMap("JudgeDate")
        public String judgeDate;

        @NameInMap("JudgeResult")
        public String judgeResult;

        @NameInMap("JudgeType")
        public String judgeType;

        @NameInMap("Party")
        public String party;

        @NameInMap("Plaintiff")
        public String plaintiff;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("Role")
        public String role;

        @NameInMap("SubAmount")
        public String subAmount;

        @NameInMap("Title")
        public String title;

        public static GetOcJusticeJudgementDocResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeJudgementDocResponseBodyData self = new GetOcJusticeJudgementDocResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeJudgementDocResponseBodyData setCaseFlow(String caseFlow) {
            this.caseFlow = caseFlow;
            return this;
        }
        public String getCaseFlow() {
            return this.caseFlow;
        }

        public GetOcJusticeJudgementDocResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeJudgementDocResponseBodyData setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public String getCaseType() {
            return this.caseType;
        }

        public GetOcJusticeJudgementDocResponseBodyData setCauseAction(String causeAction) {
            this.causeAction = causeAction;
            return this;
        }
        public String getCauseAction() {
            return this.causeAction;
        }

        public GetOcJusticeJudgementDocResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeJudgementDocResponseBodyData setDefendant(String defendant) {
            this.defendant = defendant;
            return this;
        }
        public String getDefendant() {
            return this.defendant;
        }

        public GetOcJusticeJudgementDocResponseBodyData setJudgeDate(String judgeDate) {
            this.judgeDate = judgeDate;
            return this;
        }
        public String getJudgeDate() {
            return this.judgeDate;
        }

        public GetOcJusticeJudgementDocResponseBodyData setJudgeResult(String judgeResult) {
            this.judgeResult = judgeResult;
            return this;
        }
        public String getJudgeResult() {
            return this.judgeResult;
        }

        public GetOcJusticeJudgementDocResponseBodyData setJudgeType(String judgeType) {
            this.judgeType = judgeType;
            return this;
        }
        public String getJudgeType() {
            return this.judgeType;
        }

        public GetOcJusticeJudgementDocResponseBodyData setParty(String party) {
            this.party = party;
            return this;
        }
        public String getParty() {
            return this.party;
        }

        public GetOcJusticeJudgementDocResponseBodyData setPlaintiff(String plaintiff) {
            this.plaintiff = plaintiff;
            return this;
        }
        public String getPlaintiff() {
            return this.plaintiff;
        }

        public GetOcJusticeJudgementDocResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcJusticeJudgementDocResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetOcJusticeJudgementDocResponseBodyData setSubAmount(String subAmount) {
            this.subAmount = subAmount;
            return this;
        }
        public String getSubAmount() {
            return this.subAmount;
        }

        public GetOcJusticeJudgementDocResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeCourtAnnouncementResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcJusticeCourtAnnouncementResponseBodyData> data;

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

    public static GetOcJusticeCourtAnnouncementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeCourtAnnouncementResponseBody self = new GetOcJusticeCourtAnnouncementResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeCourtAnnouncementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setData(java.util.List<GetOcJusticeCourtAnnouncementResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcJusticeCourtAnnouncementResponseBodyData> getData() {
        return this.data;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcJusticeCourtAnnouncementResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcJusticeCourtAnnouncementResponseBodyData extends TeaModel {
        @NameInMap("CaseNum")
        public String caseNum;

        @NameInMap("CauseAction")
        public String causeAction;

        @NameInMap("Court")
        public String court;

        @NameInMap("Department")
        public String department;

        @NameInMap("HearingDate")
        public String hearingDate;

        @NameInMap("Judge")
        public String judge;

        @NameInMap("Party")
        public String party;

        @NameInMap("Title")
        public String title;

        @NameInMap("Tribunal")
        public String tribunal;

        public static GetOcJusticeCourtAnnouncementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcJusticeCourtAnnouncementResponseBodyData self = new GetOcJusticeCourtAnnouncementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setCaseNum(String caseNum) {
            this.caseNum = caseNum;
            return this;
        }
        public String getCaseNum() {
            return this.caseNum;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setCauseAction(String causeAction) {
            this.causeAction = causeAction;
            return this;
        }
        public String getCauseAction() {
            return this.causeAction;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setCourt(String court) {
            this.court = court;
            return this;
        }
        public String getCourt() {
            return this.court;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setHearingDate(String hearingDate) {
            this.hearingDate = hearingDate;
            return this;
        }
        public String getHearingDate() {
            return this.hearingDate;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setJudge(String judge) {
            this.judge = judge;
            return this;
        }
        public String getJudge() {
            return this.judge;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setParty(String party) {
            this.party = party;
            return this;
        }
        public String getParty() {
            return this.party;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetOcJusticeCourtAnnouncementResponseBodyData setTribunal(String tribunal) {
            this.tribunal = tribunal;
            return this;
        }
        public String getTribunal() {
            return this.tribunal;
        }

    }

}

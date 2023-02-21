// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcCompetitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcCompetitorsResponseBodyData> data;

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

    public static GetOcCompetitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcCompetitorsResponseBody self = new GetOcCompetitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcCompetitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcCompetitorsResponseBody setData(java.util.List<GetOcCompetitorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcCompetitorsResponseBodyData> getData() {
        return this.data;
    }

    public GetOcCompetitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcCompetitorsResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcCompetitorsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcCompetitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcCompetitorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcCompetitorsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcCompetitorsResponseBodyData extends TeaModel {
        @NameInMap("CompetitionBrandIntroduction")
        public String competitionBrandIntroduction;

        @NameInMap("CompetitionEntAddress")
        public String competitionEntAddress;

        @NameInMap("CompetitionEntEsDate")
        public String competitionEntEsDate;

        @NameInMap("CompetitionEntFinTurn")
        public String competitionEntFinTurn;

        @NameInMap("CompetitionEntName")
        public String competitionEntName;

        @NameInMap("CompetitionIntroduction")
        public String competitionIntroduction;

        @NameInMap("CompetitionLogoUrl")
        public String competitionLogoUrl;

        @NameInMap("CompetitionProductName")
        public String competitionProductName;

        @NameInMap("CompetitionTag")
        public String competitionTag;

        @NameInMap("CompetitionWebsite")
        public String competitionWebsite;

        @NameInMap("EntName")
        public String entName;

        public static GetOcCompetitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcCompetitorsResponseBodyData self = new GetOcCompetitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcCompetitorsResponseBodyData setCompetitionBrandIntroduction(String competitionBrandIntroduction) {
            this.competitionBrandIntroduction = competitionBrandIntroduction;
            return this;
        }
        public String getCompetitionBrandIntroduction() {
            return this.competitionBrandIntroduction;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionEntAddress(String competitionEntAddress) {
            this.competitionEntAddress = competitionEntAddress;
            return this;
        }
        public String getCompetitionEntAddress() {
            return this.competitionEntAddress;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionEntEsDate(String competitionEntEsDate) {
            this.competitionEntEsDate = competitionEntEsDate;
            return this;
        }
        public String getCompetitionEntEsDate() {
            return this.competitionEntEsDate;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionEntFinTurn(String competitionEntFinTurn) {
            this.competitionEntFinTurn = competitionEntFinTurn;
            return this;
        }
        public String getCompetitionEntFinTurn() {
            return this.competitionEntFinTurn;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionEntName(String competitionEntName) {
            this.competitionEntName = competitionEntName;
            return this;
        }
        public String getCompetitionEntName() {
            return this.competitionEntName;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionIntroduction(String competitionIntroduction) {
            this.competitionIntroduction = competitionIntroduction;
            return this;
        }
        public String getCompetitionIntroduction() {
            return this.competitionIntroduction;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionLogoUrl(String competitionLogoUrl) {
            this.competitionLogoUrl = competitionLogoUrl;
            return this;
        }
        public String getCompetitionLogoUrl() {
            return this.competitionLogoUrl;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionProductName(String competitionProductName) {
            this.competitionProductName = competitionProductName;
            return this;
        }
        public String getCompetitionProductName() {
            return this.competitionProductName;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionTag(String competitionTag) {
            this.competitionTag = competitionTag;
            return this;
        }
        public String getCompetitionTag() {
            return this.competitionTag;
        }

        public GetOcCompetitorsResponseBodyData setCompetitionWebsite(String competitionWebsite) {
            this.competitionWebsite = competitionWebsite;
            return this;
        }
        public String getCompetitionWebsite() {
            return this.competitionWebsite;
        }

        public GetOcCompetitorsResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

    }

}

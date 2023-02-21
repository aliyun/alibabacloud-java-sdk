// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcOperationBiddingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOcOperationBiddingResponseBodyData> data;

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

    public static GetOcOperationBiddingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOcOperationBiddingResponseBody self = new GetOcOperationBiddingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOcOperationBiddingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOcOperationBiddingResponseBody setData(java.util.List<GetOcOperationBiddingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOcOperationBiddingResponseBodyData> getData() {
        return this.data;
    }

    public GetOcOperationBiddingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOcOperationBiddingResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetOcOperationBiddingResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetOcOperationBiddingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcOperationBiddingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOcOperationBiddingResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class GetOcOperationBiddingResponseBodyData extends TeaModel {
        @NameInMap("AgentEntName")
        public String agentEntName;

        @NameInMap("BidIndustry")
        public String bidIndustry;

        @NameInMap("BidTitle")
        public String bidTitle;

        @NameInMap("BidType")
        public String bidType;

        @NameInMap("Content")
        public String content;

        @NameInMap("EntName")
        public String entName;

        @NameInMap("InfoType")
        public String infoType;

        @NameInMap("OpeningTime")
        public String openingTime;

        @NameInMap("ProjectAmount")
        public String projectAmount;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectNum")
        public String projectNum;

        @NameInMap("PublicDate")
        public String publicDate;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("TenderEntName")
        public String tenderEntName;

        @NameInMap("WinnerEntName")
        public String winnerEntName;

        public static GetOcOperationBiddingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOcOperationBiddingResponseBodyData self = new GetOcOperationBiddingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOcOperationBiddingResponseBodyData setAgentEntName(String agentEntName) {
            this.agentEntName = agentEntName;
            return this;
        }
        public String getAgentEntName() {
            return this.agentEntName;
        }

        public GetOcOperationBiddingResponseBodyData setBidIndustry(String bidIndustry) {
            this.bidIndustry = bidIndustry;
            return this;
        }
        public String getBidIndustry() {
            return this.bidIndustry;
        }

        public GetOcOperationBiddingResponseBodyData setBidTitle(String bidTitle) {
            this.bidTitle = bidTitle;
            return this;
        }
        public String getBidTitle() {
            return this.bidTitle;
        }

        public GetOcOperationBiddingResponseBodyData setBidType(String bidType) {
            this.bidType = bidType;
            return this;
        }
        public String getBidType() {
            return this.bidType;
        }

        public GetOcOperationBiddingResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetOcOperationBiddingResponseBodyData setEntName(String entName) {
            this.entName = entName;
            return this;
        }
        public String getEntName() {
            return this.entName;
        }

        public GetOcOperationBiddingResponseBodyData setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public GetOcOperationBiddingResponseBodyData setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }
        public String getOpeningTime() {
            return this.openingTime;
        }

        public GetOcOperationBiddingResponseBodyData setProjectAmount(String projectAmount) {
            this.projectAmount = projectAmount;
            return this;
        }
        public String getProjectAmount() {
            return this.projectAmount;
        }

        public GetOcOperationBiddingResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetOcOperationBiddingResponseBodyData setProjectNum(String projectNum) {
            this.projectNum = projectNum;
            return this;
        }
        public String getProjectNum() {
            return this.projectNum;
        }

        public GetOcOperationBiddingResponseBodyData setPublicDate(String publicDate) {
            this.publicDate = publicDate;
            return this;
        }
        public String getPublicDate() {
            return this.publicDate;
        }

        public GetOcOperationBiddingResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetOcOperationBiddingResponseBodyData setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetOcOperationBiddingResponseBodyData setTenderEntName(String tenderEntName) {
            this.tenderEntName = tenderEntName;
            return this;
        }
        public String getTenderEntName() {
            return this.tenderEntName;
        }

        public GetOcOperationBiddingResponseBodyData setWinnerEntName(String winnerEntName) {
            this.winnerEntName = winnerEntName;
            return this;
        }
        public String getWinnerEntName() {
            return this.winnerEntName;
        }

    }

}

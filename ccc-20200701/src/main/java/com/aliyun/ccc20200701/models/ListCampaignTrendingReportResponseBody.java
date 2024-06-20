// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignTrendingReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCampaignTrendingReportResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6CCEF32F-8614-535F-A1D9-D85B8C0DC4F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCampaignTrendingReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignTrendingReportResponseBody self = new ListCampaignTrendingReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCampaignTrendingReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCampaignTrendingReportResponseBody setData(java.util.List<ListCampaignTrendingReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCampaignTrendingReportResponseBodyData> getData() {
        return this.data;
    }

    public ListCampaignTrendingReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCampaignTrendingReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCampaignTrendingReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCampaignTrendingReportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BreakAgents")
        public Long breakAgents;

        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Concurrency")
        public Long concurrency;

        /**
         * <strong>example:</strong>
         * <p>1634037840000</p>
         */
        @NameInMap("Datetime")
        public Long datetime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        @NameInMap("OutboundScenarioBreakingAgents")
        public Long outboundScenarioBreakingAgents;

        @NameInMap("OutboundScenarioReadyAgents")
        public Long outboundScenarioReadyAgents;

        @NameInMap("OutboundScenarioTalkingAgents")
        public Long outboundScenarioTalkingAgents;

        @NameInMap("OutboundScenarioWorkingAgents")
        public Long outboundScenarioWorkingAgents;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TalkAgents")
        public Long talkAgents;

        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WorkAgents")
        public Long workAgents;

        @NameInMap("WorkingAgents")
        public Long workingAgents;

        public static ListCampaignTrendingReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignTrendingReportResponseBodyData self = new ListCampaignTrendingReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCampaignTrendingReportResponseBodyData setBreakAgents(Long breakAgents) {
            this.breakAgents = breakAgents;
            return this;
        }
        public Long getBreakAgents() {
            return this.breakAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setConcurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Long getConcurrency() {
            return this.concurrency;
        }

        public ListCampaignTrendingReportResponseBodyData setDatetime(Long datetime) {
            this.datetime = datetime;
            return this;
        }
        public Long getDatetime() {
            return this.datetime;
        }

        public ListCampaignTrendingReportResponseBodyData setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioBreakingAgents(Long outboundScenarioBreakingAgents) {
            this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
            return this;
        }
        public Long getOutboundScenarioBreakingAgents() {
            return this.outboundScenarioBreakingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
            this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
            return this;
        }
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioTalkingAgents(Long outboundScenarioTalkingAgents) {
            this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
            return this;
        }
        public Long getOutboundScenarioTalkingAgents() {
            return this.outboundScenarioTalkingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioWorkingAgents(Long outboundScenarioWorkingAgents) {
            this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
            return this;
        }
        public Long getOutboundScenarioWorkingAgents() {
            return this.outboundScenarioWorkingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public ListCampaignTrendingReportResponseBodyData setTalkAgents(Long talkAgents) {
            this.talkAgents = talkAgents;
            return this;
        }
        public Long getTalkAgents() {
            return this.talkAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setWorkAgents(Long workAgents) {
            this.workAgents = workAgents;
            return this;
        }
        public Long getWorkAgents() {
            return this.workAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

    }

}

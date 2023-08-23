// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ListCampaignTrendingReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListCampaignTrendingReportResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("BreakAgents")
        public Long breakAgents;

        @NameInMap("Concurrency")
        public Long concurrency;

        @NameInMap("Datetime")
        public Long datetime;

        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        @NameInMap("OutboundScenarioBreakingAgents")
        public String outboundScenarioBreakingAgents;

        @NameInMap("OutboundScenarioReadyAgents")
        public String outboundScenarioReadyAgents;

        @NameInMap("OutboundScenarioTalkingAgents")
        public String outboundScenarioTalkingAgents;

        @NameInMap("OutboundScenarioWorkingAgents")
        public String outboundScenarioWorkingAgents;

        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("TalkAgents")
        public Long talkAgents;

        @NameInMap("WorkAgents")
        public Long workAgents;

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

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioBreakingAgents(String outboundScenarioBreakingAgents) {
            this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
            return this;
        }
        public String getOutboundScenarioBreakingAgents() {
            return this.outboundScenarioBreakingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioReadyAgents(String outboundScenarioReadyAgents) {
            this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
            return this;
        }
        public String getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioTalkingAgents(String outboundScenarioTalkingAgents) {
            this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
            return this;
        }
        public String getOutboundScenarioTalkingAgents() {
            return this.outboundScenarioTalkingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setOutboundScenarioWorkingAgents(String outboundScenarioWorkingAgents) {
            this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
            return this;
        }
        public String getOutboundScenarioWorkingAgents() {
            return this.outboundScenarioWorkingAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setTalkAgents(Long talkAgents) {
            this.talkAgents = talkAgents;
            return this;
        }
        public Long getTalkAgents() {
            return this.talkAgents;
        }

        public ListCampaignTrendingReportResponseBodyData setWorkAgents(Long workAgents) {
            this.workAgents = workAgents;
            return this;
        }
        public Long getWorkAgents() {
            return this.workAgents;
        }

    }

}

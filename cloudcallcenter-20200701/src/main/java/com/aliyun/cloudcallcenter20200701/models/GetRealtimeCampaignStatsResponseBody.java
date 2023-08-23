// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeCampaignStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRealtimeCampaignStatsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRealtimeCampaignStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeCampaignStatsResponseBody self = new GetRealtimeCampaignStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeCampaignStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealtimeCampaignStatsResponseBody setData(GetRealtimeCampaignStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealtimeCampaignStatsResponseBodyData getData() {
        return this.data;
    }

    public GetRealtimeCampaignStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRealtimeCampaignStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRealtimeCampaignStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealtimeCampaignStatsResponseBodyData extends TeaModel {
        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        @NameInMap("Caps")
        public Long caps;

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

        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        @NameInMap("TotalAgents")
        public Long totalAgents;

        @NameInMap("WorkingAgents")
        public Long workingAgents;

        public static GetRealtimeCampaignStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeCampaignStatsResponseBodyData self = new GetRealtimeCampaignStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealtimeCampaignStatsResponseBodyData setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setCaps(Long caps) {
            this.caps = caps;
            return this;
        }
        public Long getCaps() {
            return this.caps;
        }

        public GetRealtimeCampaignStatsResponseBodyData setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setOutboundScenarioBreakingAgents(Long outboundScenarioBreakingAgents) {
            this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
            return this;
        }
        public Long getOutboundScenarioBreakingAgents() {
            return this.outboundScenarioBreakingAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setOutboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
            this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
            return this;
        }
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setOutboundScenarioTalkingAgents(Long outboundScenarioTalkingAgents) {
            this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
            return this;
        }
        public Long getOutboundScenarioTalkingAgents() {
            return this.outboundScenarioTalkingAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setOutboundScenarioWorkingAgents(Long outboundScenarioWorkingAgents) {
            this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
            return this;
        }
        public Long getOutboundScenarioWorkingAgents() {
            return this.outboundScenarioWorkingAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setTotalAgents(Long totalAgents) {
            this.totalAgents = totalAgents;
            return this;
        }
        public Long getTotalAgents() {
            return this.totalAgents;
        }

        public GetRealtimeCampaignStatsResponseBodyData setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

    }

}

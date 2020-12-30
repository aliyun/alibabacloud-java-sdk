// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceStateResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RealTimeInstanceState")
    public GetInstanceStateResponseBodyRealTimeInstanceState realTimeInstanceState;

    public static GetInstanceStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStateResponseBody self = new GetInstanceStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceStateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInstanceStateResponseBody setRealTimeInstanceState(GetInstanceStateResponseBodyRealTimeInstanceState realTimeInstanceState) {
        this.realTimeInstanceState = realTimeInstanceState;
        return this;
    }
    public GetInstanceStateResponseBodyRealTimeInstanceState getRealTimeInstanceState() {
        return this.realTimeInstanceState;
    }

    public static class GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("Count")
        public Long count;

        public static GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount self = new GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount();
            return TeaModel.build(map, self);
        }

        public GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions extends TeaModel {
        @NameInMap("AgentStateCount")
        public java.util.List<GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount> agentStateCount;

        public static GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions self = new GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions();
            return TeaModel.build(map, self);
        }

        public GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions setAgentStateCount(java.util.List<GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount> agentStateCount) {
            this.agentStateCount = agentStateCount;
            return this;
        }
        public java.util.List<GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributionsAgentStateCount> getAgentStateCount() {
            return this.agentStateCount;
        }

    }

    public static class GetInstanceStateResponseBodyRealTimeInstanceState extends TeaModel {
        @NameInMap("AgentStateDistributions")
        public GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions agentStateDistributions;

        public static GetInstanceStateResponseBodyRealTimeInstanceState build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStateResponseBodyRealTimeInstanceState self = new GetInstanceStateResponseBodyRealTimeInstanceState();
            return TeaModel.build(map, self);
        }

        public GetInstanceStateResponseBodyRealTimeInstanceState setAgentStateDistributions(GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions agentStateDistributions) {
            this.agentStateDistributions = agentStateDistributions;
            return this;
        }
        public GetInstanceStateResponseBodyRealTimeInstanceStateAgentStateDistributions getAgentStateDistributions() {
            return this.agentStateDistributions;
        }

    }

}

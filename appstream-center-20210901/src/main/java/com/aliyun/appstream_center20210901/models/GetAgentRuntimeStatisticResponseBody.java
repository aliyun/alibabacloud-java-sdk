// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAgentRuntimeStatisticResponseBody extends TeaModel {
    /**
     * <p>The list of runtime statistics grouped by agent platform and agent provider. If AgentProvider is specified but no matching runtimes are found, a record with all statistical values set to 0 is returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetAgentRuntimeStatisticResponseBodyData> data;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned statistics records, which is the length of the Data list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetAgentRuntimeStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRuntimeStatisticResponseBody self = new GetAgentRuntimeStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentRuntimeStatisticResponseBody setData(java.util.List<GetAgentRuntimeStatisticResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAgentRuntimeStatisticResponseBodyData> getData() {
        return this.data;
    }

    public GetAgentRuntimeStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentRuntimeStatisticResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetAgentRuntimeStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The agent display name, which is determined by both the agent platform and the agent provider. For example, OpenClaw under the ENTERPRISE platform is displayed as OpenClaw, and OpenClaw under the JVS platform is displayed as JVS Claw.</p>
         * 
         * <strong>example:</strong>
         * <p>Agentic Computer</p>
         */
        @NameInMap("AgentDisplayName")
        public String agentDisplayName;

        /**
         * <p>The agent platform, such as ENTERPRISE_AGENTIC_COMPUTER.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE_AGENTIC_COMPUTER</p>
         */
        @NameInMap("AgentPlatform")
        public String agentPlatform;

        /**
         * <p>The agent provider, such as AgenticComputer.</p>
         * 
         * <strong>example:</strong>
         * <p>AgenticComputer</p>
         */
        @NameInMap("AgentProvider")
        public String agentProvider;

        /**
         * <p>The number of expired runtime resources in the group. A runtime is counted as expired if its resource status is Expired or Ceased, case-insensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExpiredCount")
        public Integer expiredCount;

        /**
         * <p>The number of runtime resources without channel configurations in the group, which is the total number of runtime resources minus the number of runtime resources with channel configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NoChannelConfiguredRuntimeCount")
        public Integer noChannelConfiguredRuntimeCount;

        /**
         * <p>The number of runtime resources without model configurations in the group. A runtime is considered to have a model configured if a model is configured for the runtime itself or its associated resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NoModelConfiguredRuntimeCount")
        public Integer noModelConfiguredRuntimeCount;

        /**
         * <p>The number of risky runtime resources in the group, deduplicated by runtime ID. A runtime is counted as risky if it has any of the following risks: model configuration modified, third-party channel configuration modified, or agent being uninstalled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskyRuntimeCount")
        public Integer riskyRuntimeCount;

        /**
         * <p>The total number of runtime resources in the group, deduplicated by runtime ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalRuntimeCount")
        public Integer totalRuntimeCount;

        public static GetAgentRuntimeStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentRuntimeStatisticResponseBodyData self = new GetAgentRuntimeStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentRuntimeStatisticResponseBodyData setAgentDisplayName(String agentDisplayName) {
            this.agentDisplayName = agentDisplayName;
            return this;
        }
        public String getAgentDisplayName() {
            return this.agentDisplayName;
        }

        public GetAgentRuntimeStatisticResponseBodyData setAgentPlatform(String agentPlatform) {
            this.agentPlatform = agentPlatform;
            return this;
        }
        public String getAgentPlatform() {
            return this.agentPlatform;
        }

        public GetAgentRuntimeStatisticResponseBodyData setAgentProvider(String agentProvider) {
            this.agentProvider = agentProvider;
            return this;
        }
        public String getAgentProvider() {
            return this.agentProvider;
        }

        public GetAgentRuntimeStatisticResponseBodyData setExpiredCount(Integer expiredCount) {
            this.expiredCount = expiredCount;
            return this;
        }
        public Integer getExpiredCount() {
            return this.expiredCount;
        }

        public GetAgentRuntimeStatisticResponseBodyData setNoChannelConfiguredRuntimeCount(Integer noChannelConfiguredRuntimeCount) {
            this.noChannelConfiguredRuntimeCount = noChannelConfiguredRuntimeCount;
            return this;
        }
        public Integer getNoChannelConfiguredRuntimeCount() {
            return this.noChannelConfiguredRuntimeCount;
        }

        public GetAgentRuntimeStatisticResponseBodyData setNoModelConfiguredRuntimeCount(Integer noModelConfiguredRuntimeCount) {
            this.noModelConfiguredRuntimeCount = noModelConfiguredRuntimeCount;
            return this;
        }
        public Integer getNoModelConfiguredRuntimeCount() {
            return this.noModelConfiguredRuntimeCount;
        }

        public GetAgentRuntimeStatisticResponseBodyData setRiskyRuntimeCount(Integer riskyRuntimeCount) {
            this.riskyRuntimeCount = riskyRuntimeCount;
            return this;
        }
        public Integer getRiskyRuntimeCount() {
            return this.riskyRuntimeCount;
        }

        public GetAgentRuntimeStatisticResponseBodyData setTotalRuntimeCount(Integer totalRuntimeCount) {
            this.totalRuntimeCount = totalRuntimeCount;
            return this;
        }
        public Integer getTotalRuntimeCount() {
            return this.totalRuntimeCount;
        }

    }

}

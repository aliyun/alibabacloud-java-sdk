// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetCapacityResponseBody extends TeaModel {
    /**
     * <p>Storage capacity details.</p>
     */
    @NameInMap("Data")
    public GetCapacityResponseBodyData data;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>27D27DCB-D76B-5064-8B3B-0900DEF7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityResponseBody self = new GetCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCapacityResponseBody setData(GetCapacityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCapacityResponseBodyData getData() {
        return this.data;
    }

    public GetCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCapacityResponseBodyData extends TeaModel {
        /**
         * <p>Purchased quota for Agent-managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentManagedAssetQuota")
        public Long agentManagedAssetQuota;

        /**
         * <p>Used quota for Agent-managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentManagedAssetUsed")
        public Long agentManagedAssetUsed;

        /**
         * <p>Indicates whether the LogStore for threat analysis exists.</p>
         * <ul>
         * <li><p>true: Logs are normal and log analysis is available.</p>
         * </li>
         * <li><p>false: Logs are being cleaned up and log analysis is unavailable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExistLogStore")
        public Boolean existLogStore;

        /**
         * <p>Purchased storage capacity for threat analysis, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("PreservedCapacity")
        public Long preservedCapacity;

        /**
         * <p>Current billable storage usage for threat analysis, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetCapacityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCapacityResponseBodyData self = new GetCapacityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCapacityResponseBodyData setAgentManagedAssetQuota(Long agentManagedAssetQuota) {
            this.agentManagedAssetQuota = agentManagedAssetQuota;
            return this;
        }
        public Long getAgentManagedAssetQuota() {
            return this.agentManagedAssetQuota;
        }

        public GetCapacityResponseBodyData setAgentManagedAssetUsed(Long agentManagedAssetUsed) {
            this.agentManagedAssetUsed = agentManagedAssetUsed;
            return this;
        }
        public Long getAgentManagedAssetUsed() {
            return this.agentManagedAssetUsed;
        }

        public GetCapacityResponseBodyData setExistLogStore(Boolean existLogStore) {
            this.existLogStore = existLogStore;
            return this;
        }
        public Boolean getExistLogStore() {
            return this.existLogStore;
        }

        public GetCapacityResponseBodyData setPreservedCapacity(Long preservedCapacity) {
            this.preservedCapacity = preservedCapacity;
            return this;
        }
        public Long getPreservedCapacity() {
            return this.preservedCapacity;
        }

        public GetCapacityResponseBodyData setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

}

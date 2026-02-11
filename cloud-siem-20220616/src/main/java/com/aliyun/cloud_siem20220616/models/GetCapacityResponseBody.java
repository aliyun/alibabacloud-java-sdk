// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetCapacityResponseBody extends TeaModel {
    /**
     * <p>The information about the storage capacity.</p>
     */
    @NameInMap("Data")
    public GetCapacityResponseBodyData data;

    /**
     * <p>The request ID.</p>
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentManagedAssetQuota")
        public Long agentManagedAssetQuota;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentManagedAssetUsed")
        public Long agentManagedAssetUsed;

        /**
         * <p>Indicates whether the Logstores for the threat analysis feature exist on the user side. Valid values:</p>
         * <ul>
         * <li>true: The logs are in the normal state. The log analysis feature is available.</li>
         * <li>false: The logs are being cleared. The log analysis feature is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExistLogStore")
        public Boolean existLogStore;

        /**
         * <p>The purchased storage capacity of the threat analysis feature. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("PreservedCapacity")
        public Long preservedCapacity;

        /**
         * <p>The billable storage capacity of the threat analysis feature. Unit: GB.</p>
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

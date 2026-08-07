// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetGuardLogStatsResponseBody extends TeaModel {
    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetGuardLogStatsResponseBodyData> data;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGuardLogStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGuardLogStatsResponseBody self = new GetGuardLogStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGuardLogStatsResponseBody setData(java.util.List<GetGuardLogStatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetGuardLogStatsResponseBodyData> getData() {
        return this.data;
    }

    public GetGuardLogStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGuardLogStatsResponseBodyData extends TeaModel {
        /**
         * <p>The delivery region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DeliveryRegion")
        public String deliveryRegion;

        /**
         * <p>Indicates whether the feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The log analysis configuration.</p>
         */
        @NameInMap("LogAnalysisConfig")
        public java.util.Map<String, ?> logAnalysisConfig;

        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test003x</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The remaining storage space. Unit: TB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PendingStorage")
        public Long pendingStorage;

        /**
         * <p>The reserved storage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PreserveStorage")
        public Long preserveStorage;

        /**
         * <p>The project space.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx_log</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The total storage space. Unit: TB.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalStorage")
        public Long totalStorage;

        /**
         * <p>The number of days for which data is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Long ttl;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>guard_meta_log</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>1643953****74290</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The used storage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsedStorage")
        public Long usedStorage;

        public static GetGuardLogStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGuardLogStatsResponseBodyData self = new GetGuardLogStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGuardLogStatsResponseBodyData setDeliveryRegion(String deliveryRegion) {
            this.deliveryRegion = deliveryRegion;
            return this;
        }
        public String getDeliveryRegion() {
            return this.deliveryRegion;
        }

        public GetGuardLogStatsResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetGuardLogStatsResponseBodyData setLogAnalysisConfig(java.util.Map<String, ?> logAnalysisConfig) {
            this.logAnalysisConfig = logAnalysisConfig;
            return this;
        }
        public java.util.Map<String, ?> getLogAnalysisConfig() {
            return this.logAnalysisConfig;
        }

        public GetGuardLogStatsResponseBodyData setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetGuardLogStatsResponseBodyData setPendingStorage(Long pendingStorage) {
            this.pendingStorage = pendingStorage;
            return this;
        }
        public Long getPendingStorage() {
            return this.pendingStorage;
        }

        public GetGuardLogStatsResponseBodyData setPreserveStorage(Long preserveStorage) {
            this.preserveStorage = preserveStorage;
            return this;
        }
        public Long getPreserveStorage() {
            return this.preserveStorage;
        }

        public GetGuardLogStatsResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetGuardLogStatsResponseBodyData setTotalStorage(Long totalStorage) {
            this.totalStorage = totalStorage;
            return this;
        }
        public Long getTotalStorage() {
            return this.totalStorage;
        }

        public GetGuardLogStatsResponseBodyData setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public GetGuardLogStatsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGuardLogStatsResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetGuardLogStatsResponseBodyData setUsedStorage(Long usedStorage) {
            this.usedStorage = usedStorage;
            return this;
        }
        public Long getUsedStorage() {
            return this.usedStorage;
        }

    }

}

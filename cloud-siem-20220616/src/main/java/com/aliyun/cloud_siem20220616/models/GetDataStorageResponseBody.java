// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetDataStorageResponseBody extends TeaModel {
    /**
     * <p>The returned details.</p>
     */
    @NameInMap("Data")
    public GetDataStorageResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81FB0DEA-52C1-55A0-8631-8E1B9A9D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataStorageResponseBody self = new GetDataStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataStorageResponseBody setData(GetDataStorageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataStorageResponseBodyData getData() {
        return this.data;
    }

    public GetDataStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataStorageResponseBodyDataNormalizationLogStores extends TeaModel {
        /**
         * <p>The name of the Logstore that stores normalized data.</p>
         * 
         * <strong>example:</strong>
         * <p>vulnerability-activity</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The storage duration of normalized data.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("LogStoreTtl")
        public Integer logStoreTtl;

        public static GetDataStorageResponseBodyDataNormalizationLogStores build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataNormalizationLogStores self = new GetDataStorageResponseBodyDataNormalizationLogStores();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataNormalizationLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogStores setLogStoreTtl(Integer logStoreTtl) {
            this.logStoreTtl = logStoreTtl;
            return this;
        }
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

    }

    public static class GetDataStorageResponseBodyDataNormalizationLogViews extends TeaModel {
        /**
         * <p>The log type of the normalized log.</p>
         * 
         * <strong>example:</strong>
         * <p>API security risk log</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The category of the normalized log.</p>
         * 
         * <strong>example:</strong>
         * <p>Security Category</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The number of times the normalized dataset is referenced in the threat analysis access center.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DetectionRuleReferenceCount")
        public Integer detectionRuleReferenceCount;

        /**
         * <p>The product IDs in the threat analysis access center.</p>
         */
        @NameInMap("DetectionRuleReferenceProductIds")
        public java.util.List<String> detectionRuleReferenceProductIds;

        /**
         * <p>JSON Array [&quot;key&quot;:&quot;product_code&quot;, &quot;value&quot;:&quot;ctdr&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;SCHEMA\&quot;:\&quot;AZURE_ACTIVE_DIRECTORY_AUDIT_ACTIVITY\&quot;}]</p>
         */
        @NameInMap("LogSearchConditions")
        public String logSearchConditions;

        /**
         * <p>The Logstore where threat analysis stores normalized logs.</p>
         * 
         * <strong>example:</strong>
         * <p>risk-activity</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>Indicates whether the normalized dataset exists. Valid values:</p>
         * <ul>
         * <li>true: The dataset exists.</li>
         * <li>false: The dataset does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogViewExisted")
        public Boolean logViewExisted;

        /**
         * <p>The name of the normalized dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>risk_activity</p>
         */
        @NameInMap("LogViewName")
        public String logViewName;

        public static GetDataStorageResponseBodyDataNormalizationLogViews build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataNormalizationLogViews self = new GetDataStorageResponseBodyDataNormalizationLogViews();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setDetectionRuleReferenceCount(Integer detectionRuleReferenceCount) {
            this.detectionRuleReferenceCount = detectionRuleReferenceCount;
            return this;
        }
        public Integer getDetectionRuleReferenceCount() {
            return this.detectionRuleReferenceCount;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setDetectionRuleReferenceProductIds(java.util.List<String> detectionRuleReferenceProductIds) {
            this.detectionRuleReferenceProductIds = detectionRuleReferenceProductIds;
            return this;
        }
        public java.util.List<String> getDetectionRuleReferenceProductIds() {
            return this.detectionRuleReferenceProductIds;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogSearchConditions(String logSearchConditions) {
            this.logSearchConditions = logSearchConditions;
            return this;
        }
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogViewExisted(Boolean logViewExisted) {
            this.logViewExisted = logViewExisted;
            return this;
        }
        public Boolean getLogViewExisted() {
            return this.logViewExisted;
        }

        public GetDataStorageResponseBodyDataNormalizationLogViews setLogViewName(String logViewName) {
            this.logViewName = logViewName;
            return this;
        }
        public String getLogViewName() {
            return this.logViewName;
        }

    }

    public static class GetDataStorageResponseBodyDataSasLogStores extends TeaModel {
        /**
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-net-block</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The group to which the log belongs. Valid values:</p>
         * <ul>
         * <li>host: host logs.</li>
         * <li>security: security logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("LogDeliveryGroup")
        public String logDeliveryGroup;

        /**
         * <p>Indicates whether log delivery is allowed. Log delivery is not available if the service is not purchased. Valid values:</p>
         * <ul>
         * <li>allow: Allowed.</li>
         * <li>deny: Not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("LogDeliveryPermission")
        public String logDeliveryPermission;

        /**
         * <p>The log delivery status. Valid values:</p>
         * <ul>
         * <li>enable: Log delivery is enabled.</li>
         * <li>disable: Log delivery is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("LogDeliveryStatus")
        public String logDeliveryStatus;

        /**
         * <p>The time of the most recent log delivery operation.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-16T15:10:29</p>
         */
        @NameInMap("LogDeliveryUpdateTime")
        public String logDeliveryUpdateTime;

        /**
         * <p>The log name.</p>
         * 
         * <strong>example:</strong>
         * <p>Process Snapshot</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <p>JSON Array [&quot;key&quot;:&quot;product_code&quot;, &quot;value&quot;:&quot;ctdr&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;<strong>topic</strong>\&quot;:\&quot;sas-net-block\&quot;}]</p>
         */
        @NameInMap("LogSearchConditions")
        public String logSearchConditions;

        /**
         * <p>Indicates whether the Logstore where the log resides exists. Valid values:</p>
         * <ul>
         * <li>true: The Logstore exists.</li>
         * <li>false: The Logstore does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogStoreExisted")
        public Boolean logStoreExisted;

        /**
         * <p>The name of the Logstore where the log resides.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-security-log</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The storage duration of the Logstore where the log resides. Logs are stored for at least 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("LogStoreTtl")
        public Integer logStoreTtl;

        public static GetDataStorageResponseBodyDataSasLogStores build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyDataSasLogStores self = new GetDataStorageResponseBodyDataSasLogStores();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryGroup(String logDeliveryGroup) {
            this.logDeliveryGroup = logDeliveryGroup;
            return this;
        }
        public String getLogDeliveryGroup() {
            return this.logDeliveryGroup;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryPermission(String logDeliveryPermission) {
            this.logDeliveryPermission = logDeliveryPermission;
            return this;
        }
        public String getLogDeliveryPermission() {
            return this.logDeliveryPermission;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryStatus(String logDeliveryStatus) {
            this.logDeliveryStatus = logDeliveryStatus;
            return this;
        }
        public String getLogDeliveryStatus() {
            return this.logDeliveryStatus;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogDeliveryUpdateTime(String logDeliveryUpdateTime) {
            this.logDeliveryUpdateTime = logDeliveryUpdateTime;
            return this;
        }
        public String getLogDeliveryUpdateTime() {
            return this.logDeliveryUpdateTime;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogSearchConditions(String logSearchConditions) {
            this.logSearchConditions = logSearchConditions;
            return this;
        }
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogStoreExisted(Boolean logStoreExisted) {
            this.logStoreExisted = logStoreExisted;
            return this;
        }
        public Boolean getLogStoreExisted() {
            return this.logStoreExisted;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetDataStorageResponseBodyDataSasLogStores setLogStoreTtl(Integer logStoreTtl) {
            this.logStoreTtl = logStoreTtl;
            return this;
        }
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

    }

    public static class GetDataStorageResponseBodyData extends TeaModel {
        /**
         * <p>The cold storage capacity used by user logs.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("ColdStorageUsedCapacity")
        public Double coldStorageUsedCapacity;

        /**
         * <p>The storage region of user-side logs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DataStorageRegionId")
        public String dataStorageRegionId;

        /**
         * <p>Indicates whether the storage region can be modified. By default, the storage region cannot be modified. Contact your product manager to reset the region. The region can be reset only once. Valid values:</p>
         * <ul>
         * <li>allow: The storage region can be modified.</li>
         * <li>deny: The storage region cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("DataStorageRegionPermission")
        public String dataStorageRegionPermission;

        /**
         * <p>The storage capacity purchased in the upfront billing scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataStorageTotalCapacity")
        public Long dataStorageTotalCapacity;

        /**
         * <p>The storage capacity used in user log management.</p>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("DataStorageUsedCapacity")
        public Double dataStorageUsedCapacity;

        /**
         * <p>The storage usage details for log management users.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;purchasedHotStorageCapacity\&quot;:1000,\&quot;usedHotStorageCapacity\&quot;:4.2,\&quot;usedHotStorageCapacityDetail\&quot;:{\&quot;ap-southeast-1\&quot;:4.2,\&quot;cn-shenzhen\&quot;:0.0,\&quot;cn-shanghai\&quot;:0.0}}</p>
         */
        @NameInMap("DataStorageUsedCapacityDetail")
        public String dataStorageUsedCapacityDetail;

        /**
         * <p>The name of the Simple Log Service (SLS) project that stores user logs.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-171835723111****-cn-shanghai</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        /**
         * <p>The details of Logstores for normalized data.</p>
         */
        @NameInMap("NormalizationLogStores")
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> normalizationLogStores;

        /**
         * <p>The details of normalized datasets.</p>
         */
        @NameInMap("NormalizationLogViews")
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> normalizationLogViews;

        /**
         * <p>The details of raw log storage for Security Center.</p>
         */
        @NameInMap("SasLogStores")
        public java.util.List<GetDataStorageResponseBodyDataSasLogStores> sasLogStores;

        public static GetDataStorageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataStorageResponseBodyData self = new GetDataStorageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataStorageResponseBodyData setColdStorageUsedCapacity(Double coldStorageUsedCapacity) {
            this.coldStorageUsedCapacity = coldStorageUsedCapacity;
            return this;
        }
        public Double getColdStorageUsedCapacity() {
            return this.coldStorageUsedCapacity;
        }

        public GetDataStorageResponseBodyData setDataStorageRegionId(String dataStorageRegionId) {
            this.dataStorageRegionId = dataStorageRegionId;
            return this;
        }
        public String getDataStorageRegionId() {
            return this.dataStorageRegionId;
        }

        public GetDataStorageResponseBodyData setDataStorageRegionPermission(String dataStorageRegionPermission) {
            this.dataStorageRegionPermission = dataStorageRegionPermission;
            return this;
        }
        public String getDataStorageRegionPermission() {
            return this.dataStorageRegionPermission;
        }

        public GetDataStorageResponseBodyData setDataStorageTotalCapacity(Long dataStorageTotalCapacity) {
            this.dataStorageTotalCapacity = dataStorageTotalCapacity;
            return this;
        }
        public Long getDataStorageTotalCapacity() {
            return this.dataStorageTotalCapacity;
        }

        public GetDataStorageResponseBodyData setDataStorageUsedCapacity(Double dataStorageUsedCapacity) {
            this.dataStorageUsedCapacity = dataStorageUsedCapacity;
            return this;
        }
        public Double getDataStorageUsedCapacity() {
            return this.dataStorageUsedCapacity;
        }

        public GetDataStorageResponseBodyData setDataStorageUsedCapacityDetail(String dataStorageUsedCapacityDetail) {
            this.dataStorageUsedCapacityDetail = dataStorageUsedCapacityDetail;
            return this;
        }
        public String getDataStorageUsedCapacityDetail() {
            return this.dataStorageUsedCapacityDetail;
        }

        public GetDataStorageResponseBodyData setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public GetDataStorageResponseBodyData setNormalizationLogStores(java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> normalizationLogStores) {
            this.normalizationLogStores = normalizationLogStores;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> getNormalizationLogStores() {
            return this.normalizationLogStores;
        }

        public GetDataStorageResponseBodyData setNormalizationLogViews(java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> normalizationLogViews) {
            this.normalizationLogViews = normalizationLogViews;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> getNormalizationLogViews() {
            return this.normalizationLogViews;
        }

        public GetDataStorageResponseBodyData setSasLogStores(java.util.List<GetDataStorageResponseBodyDataSasLogStores> sasLogStores) {
            this.sasLogStores = sasLogStores;
            return this;
        }
        public java.util.List<GetDataStorageResponseBodyDataSasLogStores> getSasLogStores() {
            return this.sasLogStores;
        }

    }

}

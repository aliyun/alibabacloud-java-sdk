// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataStorageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDataStorageResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>vulnerability-activity</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
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
         * <strong>example:</strong>
         * <p>API security risk log</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <strong>example:</strong>
         * <p>Security Category</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DetectionRuleReferenceCount")
        public Integer detectionRuleReferenceCount;

        @NameInMap("DetectionRuleReferenceProductIds")
        public java.util.List<String> detectionRuleReferenceProductIds;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;SCHEMA\&quot;:\&quot;AZURE_ACTIVE_DIRECTORY_AUDIT_ACTIVITY\&quot;}]</p>
         */
        @NameInMap("LogSearchConditions")
        public String logSearchConditions;

        /**
         * <strong>example:</strong>
         * <p>risk-activity</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogViewExisted")
        public Boolean logViewExisted;

        /**
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
         * <strong>example:</strong>
         * <p>sas-net-block</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <strong>example:</strong>
         * <p>host</p>
         */
        @NameInMap("LogDeliveryGroup")
        public String logDeliveryGroup;

        /**
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("LogDeliveryPermission")
        public String logDeliveryPermission;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("LogDeliveryStatus")
        public String logDeliveryStatus;

        /**
         * <strong>example:</strong>
         * <p>2025-07-16T15:10:29</p>
         */
        @NameInMap("LogDeliveryUpdateTime")
        public String logDeliveryUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>Process Snapshot</p>
         */
        @NameInMap("LogName")
        public String logName;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;<strong>topic</strong>\&quot;:\&quot;sas-net-block\&quot;}]</p>
         */
        @NameInMap("LogSearchConditions")
        public String logSearchConditions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogStoreExisted")
        public Boolean logStoreExisted;

        /**
         * <strong>example:</strong>
         * <p>sas-security-log</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
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
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("ColdStorageUsedCapacity")
        public Double coldStorageUsedCapacity;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DataStorageRegionId")
        public String dataStorageRegionId;

        /**
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("DataStorageRegionPermission")
        public String dataStorageRegionPermission;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataStorageTotalCapacity")
        public Long dataStorageTotalCapacity;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("DataStorageUsedCapacity")
        public Double dataStorageUsedCapacity;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;purchasedHotStorageCapacity\&quot;:1000,\&quot;usedHotStorageCapacity\&quot;:4.2,\&quot;usedHotStorageCapacityDetail\&quot;:{\&quot;ap-southeast-1\&quot;:4.2,\&quot;cn-shenzhen\&quot;:0.0,\&quot;cn-shanghai\&quot;:0.0}}</p>
         */
        @NameInMap("DataStorageUsedCapacityDetail")
        public String dataStorageUsedCapacityDetail;

        /**
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-171835723111****-cn-shanghai</p>
         */
        @NameInMap("LogProject")
        public String logProject;

        @NameInMap("NormalizationLogStores")
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogStores> normalizationLogStores;

        @NameInMap("NormalizationLogViews")
        public java.util.List<GetDataStorageResponseBodyDataNormalizationLogViews> normalizationLogViews;

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

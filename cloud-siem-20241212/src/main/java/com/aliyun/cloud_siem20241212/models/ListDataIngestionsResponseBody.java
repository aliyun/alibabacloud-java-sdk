// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionsResponseBody extends TeaModel {
    @NameInMap("DataIngestions")
    public java.util.List<ListDataIngestionsResponseBodyDataIngestions> dataIngestions;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataIngestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionsResponseBody self = new ListDataIngestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionsResponseBody setDataIngestions(java.util.List<ListDataIngestionsResponseBodyDataIngestions> dataIngestions) {
        this.dataIngestions = dataIngestions;
        return this;
    }
    public java.util.List<ListDataIngestionsResponseBodyDataIngestions> getDataIngestions() {
        return this.dataIngestions;
    }

    public ListDataIngestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataIngestionsResponseBodyDataIngestions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("ActiveTime")
        public Long activeTime;

        /**
         * <strong>example:</strong>
         * <p>3。</p>
         */
        @NameInMap("CapacityCount")
        public Integer capacityCount;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_netstat_ingestion_173326*******。</p>
         */
        @NameInMap("DataIngestionId")
        public String dataIngestionId;

        /**
         * <strong>example:</strong>
         * <p>realtime。</p>
         */
        @NameInMap("DataIngestionMode")
        public String dataIngestionMode;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("DataIngestionModeEditable")
        public Boolean dataIngestionModeEditable;

        /**
         * <strong>example:</strong>
         * <p>ingested。</p>
         */
        @NameInMap("DataIngestionState")
        public String dataIngestionState;

        /**
         * <strong>example:</strong>
         * <p>UserUnauthorized。</p>
         */
        @NameInMap("DataIngestionStateCode")
        public String dataIngestionStateCode;

        /**
         * <strong>example:</strong>
         * <p>enabled。</p>
         */
        @NameInMap("DataIngestionStatus")
        public String dataIngestionStatus;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_netstat_ingestion。</p>
         */
        @NameInMap("DataIngestionTemplateId")
        public String dataIngestionTemplateId;

        /**
         * <strong>example:</strong>
         * <p>preset。</p>
         */
        @NameInMap("DataIngestionType")
        public String dataIngestionType;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("DataSourceEditable")
        public Boolean dataSourceEditable;

        /**
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c。</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("NormalizationRuleEditable")
        public Boolean normalizationRuleEditable;

        /**
         * <strong>example:</strong>
         * <p>nr-0aywiqdtaqdvwac7xkbjsf3a。</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c。</p>
         */
        @NameInMap("RealtimeDataSourceId")
        public String realtimeDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c。</p>
         */
        @NameInMap("ScanDataSourceId")
        public String scanDataSourceId;

        /**
         * <strong>example:</strong>
         * <p>73a78aa245e3b1299d6ceed093de7bd8。</p>
         */
        @NameInMap("StreamJobId")
        public String streamJobId;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataIngestionsResponseBodyDataIngestions build(java.util.Map<String, ?> map) throws Exception {
            ListDataIngestionsResponseBodyDataIngestions self = new ListDataIngestionsResponseBodyDataIngestions();
            return TeaModel.build(map, self);
        }

        public ListDataIngestionsResponseBodyDataIngestions setActiveTime(Long activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public Long getActiveTime() {
            return this.activeTime;
        }

        public ListDataIngestionsResponseBodyDataIngestions setCapacityCount(Integer capacityCount) {
            this.capacityCount = capacityCount;
            return this;
        }
        public Integer getCapacityCount() {
            return this.capacityCount;
        }

        public ListDataIngestionsResponseBodyDataIngestions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionId(String dataIngestionId) {
            this.dataIngestionId = dataIngestionId;
            return this;
        }
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionMode(String dataIngestionMode) {
            this.dataIngestionMode = dataIngestionMode;
            return this;
        }
        public String getDataIngestionMode() {
            return this.dataIngestionMode;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionModeEditable(Boolean dataIngestionModeEditable) {
            this.dataIngestionModeEditable = dataIngestionModeEditable;
            return this;
        }
        public Boolean getDataIngestionModeEditable() {
            return this.dataIngestionModeEditable;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionState(String dataIngestionState) {
            this.dataIngestionState = dataIngestionState;
            return this;
        }
        public String getDataIngestionState() {
            return this.dataIngestionState;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionStateCode(String dataIngestionStateCode) {
            this.dataIngestionStateCode = dataIngestionStateCode;
            return this;
        }
        public String getDataIngestionStateCode() {
            return this.dataIngestionStateCode;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionStatus(String dataIngestionStatus) {
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }
        public String getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionTemplateId(String dataIngestionTemplateId) {
            this.dataIngestionTemplateId = dataIngestionTemplateId;
            return this;
        }
        public String getDataIngestionTemplateId() {
            return this.dataIngestionTemplateId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataIngestionType(String dataIngestionType) {
            this.dataIngestionType = dataIngestionType;
            return this;
        }
        public String getDataIngestionType() {
            return this.dataIngestionType;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataSourceEditable(Boolean dataSourceEditable) {
            this.dataSourceEditable = dataSourceEditable;
            return this;
        }
        public Boolean getDataSourceEditable() {
            return this.dataSourceEditable;
        }

        public ListDataIngestionsResponseBodyDataIngestions setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setNormalizationRuleEditable(Boolean normalizationRuleEditable) {
            this.normalizationRuleEditable = normalizationRuleEditable;
            return this;
        }
        public Boolean getNormalizationRuleEditable() {
            return this.normalizationRuleEditable;
        }

        public ListDataIngestionsResponseBodyDataIngestions setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setRealtimeDataSourceId(String realtimeDataSourceId) {
            this.realtimeDataSourceId = realtimeDataSourceId;
            return this;
        }
        public String getRealtimeDataSourceId() {
            return this.realtimeDataSourceId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setScanDataSourceId(String scanDataSourceId) {
            this.scanDataSourceId = scanDataSourceId;
            return this;
        }
        public String getScanDataSourceId() {
            return this.scanDataSourceId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setStreamJobId(String streamJobId) {
            this.streamJobId = streamJobId;
            return this;
        }
        public String getStreamJobId() {
            return this.streamJobId;
        }

        public ListDataIngestionsResponseBodyDataIngestions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}

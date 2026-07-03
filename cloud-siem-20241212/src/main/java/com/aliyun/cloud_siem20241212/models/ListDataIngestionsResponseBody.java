// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionsResponseBody extends TeaModel {
    /**
     * <p>The list of data ingestions.</p>
     */
    @NameInMap("DataIngestions")
    public java.util.List<ListDataIngestionsResponseBodyDataIngestions> dataIngestions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
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
         * <p>The time when the data ingestion was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("ActiveTime")
        public Long activeTime;

        /**
         * <p>The number of associated security capabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CapacityCount")
        public Integer capacityCount;

        /**
         * <p>The time when the data ingestion was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the data ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_netstat_ingestion_173326*******</p>
         */
        @NameInMap("DataIngestionId")
        public String dataIngestionId;

        /**
         * <p>The mode of the data ingestion. Valid values:</p>
         * <ul>
         * <li><p>realtime</p>
         * </li>
         * <li><p>scan</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        @NameInMap("DataIngestionMode")
        public String dataIngestionMode;

        /**
         * <p>Indicates whether the data ingestion mode is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataIngestionModeEditable")
        public Boolean dataIngestionModeEditable;

        /**
         * <p>The state of the data ingestion. Valid values:</p>
         * <ul>
         * <li><p>ingested</p>
         * </li>
         * <li><p>uningested</p>
         * </li>
         * <li><p>abnormal</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ingested</p>
         */
        @NameInMap("DataIngestionState")
        public String dataIngestionState;

        /**
         * <p>The error code for the data ingestion anomaly.</p>
         * 
         * <strong>example:</strong>
         * <p>UserUnauthorized</p>
         */
        @NameInMap("DataIngestionStateCode")
        public String dataIngestionStateCode;

        /**
         * <p>The status of the data ingestion. Valid values:</p>
         * <ul>
         * <li><p>enabled: The data ingestion is enabled.</p>
         * </li>
         * <li><p>disabled: The data ingestion is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("DataIngestionStatus")
        public String dataIngestionStatus;

        /**
         * <p>The ID of the data ingestion template.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_netstat_ingestion</p>
         */
        @NameInMap("DataIngestionTemplateId")
        public String dataIngestionTemplateId;

        /**
         * <p>The type of the data ingestion. Valid values:</p>
         * <ul>
         * <li><p>preset</p>
         * </li>
         * <li><p>custom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("DataIngestionType")
        public String dataIngestionType;

        /**
         * <p>Indicates whether the data source is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSourceEditable")
        public Boolean dataSourceEditable;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>Indicates whether the normalization rule is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationRuleEditable")
        public Boolean normalizationRuleEditable;

        /**
         * <p>The ID of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nr-0aywiqdtaqdvwac7xkbjsf3a</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <p>The ID of the data source for real-time ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c</p>
         */
        @NameInMap("RealtimeDataSourceId")
        public String realtimeDataSourceId;

        /**
         * <p>The ID of the data source for scan-based ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-scpfegri73oyoknbc90c</p>
         */
        @NameInMap("ScanDataSourceId")
        public String scanDataSourceId;

        /**
         * <p>The job ID of the stream processing task.</p>
         * 
         * <strong>example:</strong>
         * <p>73a78aa245e3b1299d6ceed093de7bd8</p>
         */
        @NameInMap("StreamJobId")
        public String streamJobId;

        /**
         * <p>The time when the data ingestion was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
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

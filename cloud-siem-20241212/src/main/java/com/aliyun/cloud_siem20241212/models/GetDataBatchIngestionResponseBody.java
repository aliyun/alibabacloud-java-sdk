// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataBatchIngestionResponseBody extends TeaModel {
    /**
     * <p>The data batch ingestion configuration.</p>
     */
    @NameInMap("DataBatchIngestion")
    public GetDataBatchIngestionResponseBodyDataBatchIngestion dataBatchIngestion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataBatchIngestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataBatchIngestionResponseBody self = new GetDataBatchIngestionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataBatchIngestionResponseBody setDataBatchIngestion(GetDataBatchIngestionResponseBodyDataBatchIngestion dataBatchIngestion) {
        this.dataBatchIngestion = dataBatchIngestion;
        return this;
    }
    public GetDataBatchIngestionResponseBodyDataBatchIngestion getDataBatchIngestion() {
        return this.dataBatchIngestion;
    }

    public GetDataBatchIngestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions extends TeaModel {
        /**
         * <p>The data ingestion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_process_ingestion_173326*******</p>
         */
        @NameInMap("DataIngestionId")
        public String dataIngestionId;

        /**
         * <p>The accessed state of the data ingestion. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("DataIngestionStatus")
        public String dataIngestionStatus;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas_process_log_173326*******</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The vendor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions build(java.util.Map<String, ?> map) throws Exception {
            GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions self = new GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions();
            return TeaModel.build(map, self);
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions setDataIngestionId(String dataIngestionId) {
            this.dataIngestionId = dataIngestionId;
            return this;
        }
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions setDataIngestionStatus(String dataIngestionStatus) {
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }
        public String getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

    public static class GetDataBatchIngestionResponseBodyDataBatchIngestion extends TeaModel {
        /**
         * <p>The list of cloud native mode ingestion IDs.</p>
         */
        @NameInMap("ApsaraDataIngestionIds")
        public java.util.List<String> apsaraDataIngestionIds;

        /**
         * <p>Indicates whether new users are automatically discovered. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoScanNew")
        public String autoScanNew;

        /**
         * <p>The effective period of the data batch ingestion. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("DataBatchIngestionEffectTime")
        public String dataBatchIngestionEffectTime;

        /**
         * <p>The batch data ingestion mode.</p>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        @NameInMap("DataBatchIngestionMode")
        public String dataBatchIngestionMode;

        /**
         * <p>The time when the data batch ingestion was configured. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("DataBatchIngestionSetTime")
        public String dataBatchIngestionSetTime;

        /**
         * <p>The accessed state of the data batch ingestion. Valid values:</p>
         * <ul>
         * <li>pending: Pending.</li>
         * <li>running: In effect.</li>
         * <li>success: Succeeded.</li>
         * <li>failed: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("DataBatchIngestionStatus")
        public String dataBatchIngestionStatus;

        /**
         * <p>The list of data ingestions.</p>
         */
        @NameInMap("DataIngestions")
        public java.util.List<GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions> dataIngestions;

        /**
         * <p>Indicates whether automatic discovery of new Logstores is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DataSourceRecognizeEnabled")
        public Boolean dataSourceRecognizeEnabled;

        /**
         * <p>The list of user IDs for data batch ingestion.</p>
         */
        @NameInMap("LogUserIds")
        public java.util.List<String> logUserIds;

        /**
         * <p>The list of recommended ingestion IDs.</p>
         */
        @NameInMap("RecommendDataIngestionIds")
        public java.util.List<String> recommendDataIngestionIds;

        public static GetDataBatchIngestionResponseBodyDataBatchIngestion build(java.util.Map<String, ?> map) throws Exception {
            GetDataBatchIngestionResponseBodyDataBatchIngestion self = new GetDataBatchIngestionResponseBodyDataBatchIngestion();
            return TeaModel.build(map, self);
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setApsaraDataIngestionIds(java.util.List<String> apsaraDataIngestionIds) {
            this.apsaraDataIngestionIds = apsaraDataIngestionIds;
            return this;
        }
        public java.util.List<String> getApsaraDataIngestionIds() {
            return this.apsaraDataIngestionIds;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setAutoScanNew(String autoScanNew) {
            this.autoScanNew = autoScanNew;
            return this;
        }
        public String getAutoScanNew() {
            return this.autoScanNew;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setDataBatchIngestionEffectTime(String dataBatchIngestionEffectTime) {
            this.dataBatchIngestionEffectTime = dataBatchIngestionEffectTime;
            return this;
        }
        public String getDataBatchIngestionEffectTime() {
            return this.dataBatchIngestionEffectTime;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setDataBatchIngestionMode(String dataBatchIngestionMode) {
            this.dataBatchIngestionMode = dataBatchIngestionMode;
            return this;
        }
        public String getDataBatchIngestionMode() {
            return this.dataBatchIngestionMode;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setDataBatchIngestionSetTime(String dataBatchIngestionSetTime) {
            this.dataBatchIngestionSetTime = dataBatchIngestionSetTime;
            return this;
        }
        public String getDataBatchIngestionSetTime() {
            return this.dataBatchIngestionSetTime;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setDataBatchIngestionStatus(String dataBatchIngestionStatus) {
            this.dataBatchIngestionStatus = dataBatchIngestionStatus;
            return this;
        }
        public String getDataBatchIngestionStatus() {
            return this.dataBatchIngestionStatus;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setDataIngestions(java.util.List<GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions> dataIngestions) {
            this.dataIngestions = dataIngestions;
            return this;
        }
        public java.util.List<GetDataBatchIngestionResponseBodyDataBatchIngestionDataIngestions> getDataIngestions() {
            return this.dataIngestions;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }
        public Boolean getDataSourceRecognizeEnabled() {
            return this.dataSourceRecognizeEnabled;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setLogUserIds(java.util.List<String> logUserIds) {
            this.logUserIds = logUserIds;
            return this;
        }
        public java.util.List<String> getLogUserIds() {
            return this.logUserIds;
        }

        public GetDataBatchIngestionResponseBodyDataBatchIngestion setRecommendDataIngestionIds(java.util.List<String> recommendDataIngestionIds) {
            this.recommendDataIngestionIds = recommendDataIngestionIds;
            return this;
        }
        public java.util.List<String> getRecommendDataIngestionIds() {
            return this.recommendDataIngestionIds;
        }

    }

}

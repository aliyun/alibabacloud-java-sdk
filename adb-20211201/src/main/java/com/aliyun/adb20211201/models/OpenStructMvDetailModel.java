// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvDetailModel extends TeaModel {
    /**
     * <p>All direct parent base tables of the materialized view.</p>
     */
    @NameInMap("BaseTableInfos")
    public java.util.List<OpenStructMvDetailModelBaseTableInfos> baseTableInfos;

    /**
     * <p>All direct parent base tables of the materialized view.</p>
     */
    @NameInMap("BaseTableNames")
    public java.util.List<java.util.List<String>> baseTableNames;

    /**
     * <p>Indicates whether to enable alerting for refresh latency. Valid values:</p>
     * <ul>
     * <li><p>true: Yes.</p>
     * </li>
     * <li><p>false: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDelayAlert")
    public Integer enableDelayAlert;

    /**
     * <p>Indicates whether to enable alerting for refresh task failures. Valid values:</p>
     * <ul>
     * <li><p>true: Yes.</p>
     * </li>
     * <li><p>false: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableFailureAlert")
    public Integer enableFailureAlert;

    /**
     * <p>The total number of explicit query hits in the last 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExplicitHit")
    public Long explicitHit;

    /**
     * <p>The time of the first refresh.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 09:00:00</p>
     */
    @NameInMap("FirstRefreshTime")
    public String firstRefreshTime;

    /**
     * <p>The total number of implicit query hits in the last 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ImplicitHit")
    public Long implicitHit;

    /**
     * <p>Indicates whether the materialized view has not been accessed by explicit or implicit queries for more than 30 days since its creation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsInactive")
    public Boolean isInactive;

    /**
     * <p>The refresh latency toleration, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LatencyTolerance")
    public Integer latencyTolerance;

    /**
     * <p>The disk space that the materialized view occupies for hot data, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("LocalSize")
    public Long localSize;

    /**
     * <p>Whether query rewrite is enabled for the materialized view.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryRewriteEnabled")
    public Boolean queryRewriteEnabled;

    /**
     * <p>The refresh interval.</p>
     * 
     * <strong>example:</strong>
     * <p>(now() + INTERVAL \&quot;10\&quot; SECOND)</p>
     */
    @NameInMap("RefreshInterval")
    public String refreshInterval;

    /**
     * <p>The refresh model of the materialized view.</p>
     * 
     * <strong>example:</strong>
     * <p>FAST</p>
     */
    @NameInMap("RefreshState")
    public String refreshState;

    /**
     * <p>The disk space that the materialized view occupies for cold data, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RemoteSize")
    public Long remoteSize;

    /**
     * <p>The resource group on which the refresh depends.</p>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    /**
     * <p>The table engine.</p>
     * 
     * <strong>example:</strong>
     * <p>XUANWU</p>
     */
    @NameInMap("TableEngine")
    public String tableEngine;

    /**
     * <p>The time of the last refresh.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 10:00:00</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    public static OpenStructMvDetailModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMvDetailModel self = new OpenStructMvDetailModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMvDetailModel setBaseTableInfos(java.util.List<OpenStructMvDetailModelBaseTableInfos> baseTableInfos) {
        this.baseTableInfos = baseTableInfos;
        return this;
    }
    public java.util.List<OpenStructMvDetailModelBaseTableInfos> getBaseTableInfos() {
        return this.baseTableInfos;
    }

    public OpenStructMvDetailModel setBaseTableNames(java.util.List<java.util.List<String>> baseTableNames) {
        this.baseTableNames = baseTableNames;
        return this;
    }
    public java.util.List<java.util.List<String>> getBaseTableNames() {
        return this.baseTableNames;
    }

    public OpenStructMvDetailModel setEnableDelayAlert(Integer enableDelayAlert) {
        this.enableDelayAlert = enableDelayAlert;
        return this;
    }
    public Integer getEnableDelayAlert() {
        return this.enableDelayAlert;
    }

    public OpenStructMvDetailModel setEnableFailureAlert(Integer enableFailureAlert) {
        this.enableFailureAlert = enableFailureAlert;
        return this;
    }
    public Integer getEnableFailureAlert() {
        return this.enableFailureAlert;
    }

    public OpenStructMvDetailModel setExplicitHit(Long explicitHit) {
        this.explicitHit = explicitHit;
        return this;
    }
    public Long getExplicitHit() {
        return this.explicitHit;
    }

    public OpenStructMvDetailModel setFirstRefreshTime(String firstRefreshTime) {
        this.firstRefreshTime = firstRefreshTime;
        return this;
    }
    public String getFirstRefreshTime() {
        return this.firstRefreshTime;
    }

    public OpenStructMvDetailModel setImplicitHit(Long implicitHit) {
        this.implicitHit = implicitHit;
        return this;
    }
    public Long getImplicitHit() {
        return this.implicitHit;
    }

    public OpenStructMvDetailModel setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
        return this;
    }
    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public OpenStructMvDetailModel setLatencyTolerance(Integer latencyTolerance) {
        this.latencyTolerance = latencyTolerance;
        return this;
    }
    public Integer getLatencyTolerance() {
        return this.latencyTolerance;
    }

    public OpenStructMvDetailModel setLocalSize(Long localSize) {
        this.localSize = localSize;
        return this;
    }
    public Long getLocalSize() {
        return this.localSize;
    }

    public OpenStructMvDetailModel setQueryRewriteEnabled(Boolean queryRewriteEnabled) {
        this.queryRewriteEnabled = queryRewriteEnabled;
        return this;
    }
    public Boolean getQueryRewriteEnabled() {
        return this.queryRewriteEnabled;
    }

    public OpenStructMvDetailModel setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
        return this;
    }
    public String getRefreshInterval() {
        return this.refreshInterval;
    }

    public OpenStructMvDetailModel setRefreshState(String refreshState) {
        this.refreshState = refreshState;
        return this;
    }
    public String getRefreshState() {
        return this.refreshState;
    }

    public OpenStructMvDetailModel setRemoteSize(Long remoteSize) {
        this.remoteSize = remoteSize;
        return this;
    }
    public Long getRemoteSize() {
        return this.remoteSize;
    }

    public OpenStructMvDetailModel setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public OpenStructMvDetailModel setTableEngine(String tableEngine) {
        this.tableEngine = tableEngine;
        return this;
    }
    public String getTableEngine() {
        return this.tableEngine;
    }

    public OpenStructMvDetailModel setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static class OpenStructMvDetailModelBaseTableInfos extends TeaModel {
        /**
         * <p>Whether the base table is a materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BaseTableIsMv")
        public Boolean baseTableIsMv;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The table engine.</p>
         * 
         * <strong>example:</strong>
         * <p>XUANWU</p>
         */
        @NameInMap("TableEngine")
        public String tableEngine;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tbl</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static OpenStructMvDetailModelBaseTableInfos build(java.util.Map<String, ?> map) throws Exception {
            OpenStructMvDetailModelBaseTableInfos self = new OpenStructMvDetailModelBaseTableInfos();
            return TeaModel.build(map, self);
        }

        public OpenStructMvDetailModelBaseTableInfos setBaseTableIsMv(Boolean baseTableIsMv) {
            this.baseTableIsMv = baseTableIsMv;
            return this;
        }
        public Boolean getBaseTableIsMv() {
            return this.baseTableIsMv;
        }

        public OpenStructMvDetailModelBaseTableInfos setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public OpenStructMvDetailModelBaseTableInfos setTableEngine(String tableEngine) {
            this.tableEngine = tableEngine;
            return this;
        }
        public String getTableEngine() {
            return this.tableEngine;
        }

        public OpenStructMvDetailModelBaseTableInfos setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}

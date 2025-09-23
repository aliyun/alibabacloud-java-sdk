// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvDetailModel extends TeaModel {
    @NameInMap("BaseTableInfos")
    public java.util.List<OpenStructMvDetailModelBaseTableInfos> baseTableInfos;

    @NameInMap("BaseTableNames")
    public java.util.List<java.util.List<String>> baseTableNames;

    @NameInMap("EnableDelayAlert")
    public Integer enableDelayAlert;

    @NameInMap("EnableFailureAlert")
    public Integer enableFailureAlert;

    @NameInMap("ExplicitHit")
    public Long explicitHit;

    @NameInMap("FirstRefreshTime")
    public String firstRefreshTime;

    @NameInMap("ImplicitHit")
    public Long implicitHit;

    @NameInMap("IsInactive")
    public Boolean isInactive;

    @NameInMap("LatencyTolerance")
    public Integer latencyTolerance;

    @NameInMap("LocalSize")
    public Long localSize;

    @NameInMap("QueryRewriteEnabled")
    public Boolean queryRewriteEnabled;

    @NameInMap("RefreshInterval")
    public String refreshInterval;

    @NameInMap("RefreshState")
    public String refreshState;

    @NameInMap("RemoteSize")
    public Long remoteSize;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("TableEngine")
    public String tableEngine;

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
        @NameInMap("BaseTableIsMv")
        public Boolean baseTableIsMv;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableEngine")
        public String tableEngine;

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

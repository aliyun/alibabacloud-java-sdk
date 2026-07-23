// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDmsInstanceSyncTaskInstance extends TeaModel {
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    @NameInMap("CrawlerTaskId")
    public String crawlerTaskId;

    @NameInMap("DatasourceUuid")
    public String datasourceUuid;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("DmsInstanceId")
    public String dmsInstanceId;

    @NameInMap("DmsInstanceSummary")
    public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary dmsInstanceSummary;

    @NameInMap("DmsRegionId")
    public String dmsRegionId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorSummary")
    public String errorSummary;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Phase")
    public String phase;

    @NameInMap("Status")
    public String status;

    public static AgenticDmsInstanceSyncTaskInstance build(java.util.Map<String, ?> map) throws Exception {
        AgenticDmsInstanceSyncTaskInstance self = new AgenticDmsInstanceSyncTaskInstance();
        return TeaModel.build(map, self);
    }

    public AgenticDmsInstanceSyncTaskInstance setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public AgenticDmsInstanceSyncTaskInstance setCrawlerTaskId(String crawlerTaskId) {
        this.crawlerTaskId = crawlerTaskId;
        return this;
    }
    public String getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    public AgenticDmsInstanceSyncTaskInstance setDatasourceUuid(String datasourceUuid) {
        this.datasourceUuid = datasourceUuid;
        return this;
    }
    public String getDatasourceUuid() {
        return this.datasourceUuid;
    }

    public AgenticDmsInstanceSyncTaskInstance setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public AgenticDmsInstanceSyncTaskInstance setDmsInstanceId(String dmsInstanceId) {
        this.dmsInstanceId = dmsInstanceId;
        return this;
    }
    public String getDmsInstanceId() {
        return this.dmsInstanceId;
    }

    public AgenticDmsInstanceSyncTaskInstance setDmsInstanceSummary(AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary dmsInstanceSummary) {
        this.dmsInstanceSummary = dmsInstanceSummary;
        return this;
    }
    public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary getDmsInstanceSummary() {
        return this.dmsInstanceSummary;
    }

    public AgenticDmsInstanceSyncTaskInstance setDmsRegionId(String dmsRegionId) {
        this.dmsRegionId = dmsRegionId;
        return this;
    }
    public String getDmsRegionId() {
        return this.dmsRegionId;
    }

    public AgenticDmsInstanceSyncTaskInstance setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AgenticDmsInstanceSyncTaskInstance setErrorSummary(String errorSummary) {
        this.errorSummary = errorSummary;
        return this;
    }
    public String getErrorSummary() {
        return this.errorSummary;
    }

    public AgenticDmsInstanceSyncTaskInstance setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AgenticDmsInstanceSyncTaskInstance setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AgenticDmsInstanceSyncTaskInstance setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public AgenticDmsInstanceSyncTaskInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Host")
        public String host;

        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        public static AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary build(java.util.Map<String, ?> map) throws Exception {
            AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary self = new AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary();
            return TeaModel.build(map, self);
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setInstanceResourceId(String instanceResourceId) {
            this.instanceResourceId = instanceResourceId;
            return this;
        }
        public String getInstanceResourceId() {
            return this.instanceResourceId;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AgenticDmsInstanceSyncTaskInstanceDmsInstanceSummary setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}

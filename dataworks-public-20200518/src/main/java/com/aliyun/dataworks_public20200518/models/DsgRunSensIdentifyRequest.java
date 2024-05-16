// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgRunSensIdentifyRequest extends TeaModel {
    @NameInMap("EsMetaParams")
    public java.util.List<DsgRunSensIdentifyRequestEsMetaParams> esMetaParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DsgRunSensIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgRunSensIdentifyRequest self = new DsgRunSensIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public DsgRunSensIdentifyRequest setEsMetaParams(java.util.List<DsgRunSensIdentifyRequestEsMetaParams> esMetaParams) {
        this.esMetaParams = esMetaParams;
        return this;
    }
    public java.util.List<DsgRunSensIdentifyRequestEsMetaParams> getEsMetaParams() {
        return this.esMetaParams;
    }

    public DsgRunSensIdentifyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class DsgRunSensIdentifyRequestEsMetaParams extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableNameList")
        public java.util.List<String> tableNameList;

        @NameInMap("User")
        public String user;

        public static DsgRunSensIdentifyRequestEsMetaParams build(java.util.Map<String, ?> map) throws Exception {
            DsgRunSensIdentifyRequestEsMetaParams self = new DsgRunSensIdentifyRequestEsMetaParams();
            return TeaModel.build(map, self);
        }

        public DsgRunSensIdentifyRequestEsMetaParams setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setTableNameList(java.util.List<String> tableNameList) {
            this.tableNameList = tableNameList;
            return this;
        }
        public java.util.List<String> getTableNameList() {
            return this.tableNameList;
        }

        public DsgRunSensIdentifyRequestEsMetaParams setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}

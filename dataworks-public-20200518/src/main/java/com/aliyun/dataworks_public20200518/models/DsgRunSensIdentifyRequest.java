// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgRunSensIdentifyRequest extends TeaModel {
    /**
     * <p>The parameters that you need to configure to scan specified metadata.</p>
     */
    @NameInMap("EsMetaParams")
    public java.util.List<DsgRunSensIdentifyRequestEsMetaParams> esMetaParams;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
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
        /**
         * <p>The cluster ID. You can obtain the ID based on the data source you use.</p>
         * 
         * <strong>example:</strong>
         * <p>101010</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>ODPS.ODPS</li>
         * <li>EMR</li>
         * <li>HOLO.POSTGRES</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ODPS.ODPS</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The instance ID. You can obtain the ID based on the data source you use.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-9lb37k181024</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the name.</p>
         * 
         * <strong>example:</strong>
         * <p>1666676756691024</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The name of the schema.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The names of the tables.</p>
         */
        @NameInMap("TableNameList")
        public java.util.List<String> tableNameList;

        /**
         * <p>The username of the operator. We recommend that you enter the username of your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-uat</p>
         */
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

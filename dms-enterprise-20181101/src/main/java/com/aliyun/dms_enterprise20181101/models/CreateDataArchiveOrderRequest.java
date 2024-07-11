// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataArchiveOrderRequest extends TeaModel {
    /**
     * <p>The description of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters for archiving data.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public CreateDataArchiveOrderRequestParam param;

    /**
     * <p>The ID of the parent ticket. A parent ticket is generated only when a child ticket is created.</p>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The type of the plug-in. Default value: DATA_ARCHIVE.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_ARCHIVE</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The list of the related users.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<String> relatedUserList;

    /**
     * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataArchiveOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataArchiveOrderRequest self = new CreateDataArchiveOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataArchiveOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataArchiveOrderRequest setParam(CreateDataArchiveOrderRequestParam param) {
        this.param = param;
        return this;
    }
    public CreateDataArchiveOrderRequestParam getParam() {
        return this.param;
    }

    public CreateDataArchiveOrderRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDataArchiveOrderRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreateDataArchiveOrderRequest setRelatedUserList(java.util.List<String> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<String> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataArchiveOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataArchiveOrderRequestParamTableIncludes extends TeaModel {
        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The filter condition specified by the WHERE clause of the archiving configuration. If a time variable is used in the filter condition, the filter condition is specified in the following format: field name &lt;=\&quot;${variable name}\&quot;. The variable name in the filter condition must be the same as the Name value of Variables.</p>
         * 
         * <strong>example:</strong>
         * <p>gmt_modified&lt;\&quot;${time}\&quot;</p>
         */
        @NameInMap("TableWhere")
        public String tableWhere;

        public static CreateDataArchiveOrderRequestParamTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            CreateDataArchiveOrderRequestParamTableIncludes self = new CreateDataArchiveOrderRequestParamTableIncludes();
            return TeaModel.build(map, self);
        }

        public CreateDataArchiveOrderRequestParamTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public CreateDataArchiveOrderRequestParamTableIncludes setTableWhere(String tableWhere) {
            this.tableWhere = tableWhere;
            return this;
        }
        public String getTableWhere() {
            return this.tableWhere;
        }

    }

    public static class CreateDataArchiveOrderRequestParamVariables extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Pattern")
        public String pattern;

        public static CreateDataArchiveOrderRequestParamVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateDataArchiveOrderRequestParamVariables self = new CreateDataArchiveOrderRequestParamVariables();
            return TeaModel.build(map, self);
        }

        public CreateDataArchiveOrderRequestParamVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataArchiveOrderRequestParamVariables setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class CreateDataArchiveOrderRequestParam extends TeaModel {
        /**
         * <p>The type of the destination database for archiving data. Valid values:</p>
         * <blockquote>
         * <p> If you set ArchiveMethod to a value other than inner_oss, you must connect the destination database for archiving data to Data Management (DMS) before you create the data archiving ticket. After the database is connected to DMS, the database is displayed in the Instances Connected section of the DMS console.</p>
         * </blockquote>
         * <ul>
         * <li><strong>inner_oss</strong>: dedicated storage space, which is a built-in space.</li>
         * <li><strong>oss_userself</strong>: Object Storage Service (OSS) bucket of the user.</li>
         * <li><strong>mysql</strong>: ApsaraDB RDS for MySQL instance.</li>
         * <li><strong>polardb</strong>: PolarDB for MySQL cluster.</li>
         * <li><strong>adb_mysql</strong>: AnalyticDB for MySQL V3.0 cluster.</li>
         * <li><strong>lindorm</strong>: Lindorm instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("ArchiveMethod")
        public String archiveMethod;

        /**
         * <p>A crontab expression that specifies the scheduling cycle to run the task. For more information, see the <a href="https://help.aliyun.com/document_detail/206581.html">Crontab expressions</a> section of the &quot;Create shadow tables for synchronization&quot; topic. This parameter is required if RunMethod is set to schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>00 05 11 * * ?</p>
         */
        @NameInMap("CronStr")
        public String cronStr;

        /**
         * <strong>example:</strong>
         * <p>1***</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>Specifies whether the database is a logical database.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The post behaviors.</p>
         */
        @NameInMap("OrderAfter")
        public java.util.List<String> orderAfter;

        /**
         * <p>The method that is used to run the data archiving task. Valid values:</p>
         * <ul>
         * <li><strong>schedule</strong>: The data archiving task is periodically scheduled.</li>
         * <li><strong>now</strong>: The data archiving task is immediately run.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>now</p>
         */
        @NameInMap("RunMethod")
        public String runMethod;

        /**
         * <p>The catalog of the source database. Valid values:</p>
         * <ul>
         * <li><strong>def</strong>: Set this parameter to def if the source database is of the two-layer logical schema, such as a MySQL database, a PolarDB for MySQL cluster, or an AnalyticDB for MySQL instance.</li>
         * <li><strong>Empty string</strong>: Set this parameter to an empty string if the source database is a Lindorm or ApsaraDB for MongoDB instance.</li>
         * <li><strong>Catalog name</strong>: Set this parameter to the catalog name of the source database if the source database is of the three-layer logical schema, such as a PostgreSQL database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("SourceCatalogName")
        public String sourceCatalogName;

        /**
         * <p>The name of the source instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1*******</p>
         */
        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        /**
         * <p>The schema name of the source database. The schema name of the source database is the same as that of the destination database. If the source database is a MySQL database, this parameter specifies the name of the source database. If the source database is a PostgreSQL database, this parameter specifies the schema name of the source database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>schema_test</p>
         */
        @NameInMap("SourceSchemaName")
        public String sourceSchemaName;

        /**
         * <p>The collection of tables to be archived.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("TableIncludes")
        public java.util.List<CreateDataArchiveOrderRequestParamTableIncludes> tableIncludes;

        /**
         * <p>The table names mapped to the destination database. This parameter is not required and the default value is used.</p>
         */
        @NameInMap("TableMapping")
        public java.util.List<String> tableMapping;

        /**
         * <p>The host of the destination instance. If the destination instance can be accessed over an internal network or the Internet, preferentially set the value to the internal endpoint of the destination instance.</p>
         * <ul>
         * <li>If data is archived in an OSS bucket, set the value to the name of the bucket.</li>
         * <li>If data is archived in dedicated storage space, set the value to inner_oss.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1*********.ads.aliyuncs.com</p>
         */
        @NameInMap("TargetInstanceHost")
        public String targetInstanceHost;

        /**
         * <p>The configuration of archiving variables. You can use a time variable as a filter condition for archiving data. Each variable has two attributes: name and pattern.</p>
         */
        @NameInMap("Variables")
        public java.util.List<CreateDataArchiveOrderRequestParamVariables> variables;

        public static CreateDataArchiveOrderRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataArchiveOrderRequestParam self = new CreateDataArchiveOrderRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataArchiveOrderRequestParam setArchiveMethod(String archiveMethod) {
            this.archiveMethod = archiveMethod;
            return this;
        }
        public String getArchiveMethod() {
            return this.archiveMethod;
        }

        public CreateDataArchiveOrderRequestParam setCronStr(String cronStr) {
            this.cronStr = cronStr;
            return this;
        }
        public String getCronStr() {
            return this.cronStr;
        }

        public CreateDataArchiveOrderRequestParam setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public CreateDataArchiveOrderRequestParam setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateDataArchiveOrderRequestParam setOrderAfter(java.util.List<String> orderAfter) {
            this.orderAfter = orderAfter;
            return this;
        }
        public java.util.List<String> getOrderAfter() {
            return this.orderAfter;
        }

        public CreateDataArchiveOrderRequestParam setRunMethod(String runMethod) {
            this.runMethod = runMethod;
            return this;
        }
        public String getRunMethod() {
            return this.runMethod;
        }

        public CreateDataArchiveOrderRequestParam setSourceCatalogName(String sourceCatalogName) {
            this.sourceCatalogName = sourceCatalogName;
            return this;
        }
        public String getSourceCatalogName() {
            return this.sourceCatalogName;
        }

        public CreateDataArchiveOrderRequestParam setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public CreateDataArchiveOrderRequestParam setSourceSchemaName(String sourceSchemaName) {
            this.sourceSchemaName = sourceSchemaName;
            return this;
        }
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        public CreateDataArchiveOrderRequestParam setTableIncludes(java.util.List<CreateDataArchiveOrderRequestParamTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<CreateDataArchiveOrderRequestParamTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        public CreateDataArchiveOrderRequestParam setTableMapping(java.util.List<String> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.List<String> getTableMapping() {
            return this.tableMapping;
        }

        public CreateDataArchiveOrderRequestParam setTargetInstanceHost(String targetInstanceHost) {
            this.targetInstanceHost = targetInstanceHost;
            return this;
        }
        public String getTargetInstanceHost() {
            return this.targetInstanceHost;
        }

        public CreateDataArchiveOrderRequestParam setVariables(java.util.List<CreateDataArchiveOrderRequestParamVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateDataArchiveOrderRequestParamVariables> getVariables() {
            return this.variables;
        }

    }

}

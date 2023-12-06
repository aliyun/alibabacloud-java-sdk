// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataArchiveOrderRequest extends TeaModel {
    /**
     * <p>The description of the task.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters for archiving data.</p>
     */
    @NameInMap("Param")
    public CreateDataArchiveOrderRequestParam param;

    /**
     * <p>The ID of the parent ticket. A parent ticket is generated only when a sub ticket is created.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The plugin type. Default value: DATA_ARCHIVE.</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The list of the related users.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<String> relatedUserList;

    /**
     * <p>The tenant ID. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
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
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The filter condition specified by the WHERE clause of the archiving configuration.</p>
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
         * <p>The database for archiving data. Valid values:</p>
         * <br>
         * <p>*   inner_oss: Built-in Object Storage Service (OSS) of Database Backup (DBS).</p>
         * <p>*   oss_userself: OSS of user.</p>
         * <p>*   mysql: ApsaraDB RDS for MySQL.</p>
         * <p>*   polardb: PolarDB for MySQL.</p>
         * <p>*   lindorm: Lindorm.</p>
         */
        @NameInMap("ArchiveMethod")
        public String archiveMethod;

        /**
         * <p>填写Crontab表达式，以便定期执行任务，更多信息，请参见[Crontab表达式](~~206581~~)。</p>
         * <p>当运行方式为周期归档时需要填写该参数。</p>
         */
        @NameInMap("CronStr")
        public String cronStr;

        /**
         * <p>Specifies whether the database is a logical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The post behaviors.</p>
         */
        @NameInMap("OrderAfter")
        public java.util.List<String> orderAfter;

        /**
         * <p>The running mode. Only now is supported, which indicates that data archiving is immediately executed.</p>
         */
        @NameInMap("RunMethod")
        public String runMethod;

        /**
         * <p>源库目录（catalog）。</p>
         * <p>- **def**：对于两层逻辑结构的数据库，如MySQL，PolarDB MySQL，AnalyticDB MySQL，固定为def。</p>
         * <p>- **空字符串**： 对于lindorm与MongoDB，填入空字符串。</p>
         * <p>- **catalog名**：对于三层逻辑结构的数据库，如PostgreSQL，填入catalog名。</p>
         */
        @NameInMap("SourceCatalogName")
        public String sourceCatalogName;

        /**
         * <p>源实例名称。</p>
         */
        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        /**
         * <p>源库Schema，源库与目标库同名。</p>
         * <p>如MySQL为库名，PostgreSQL为Schema名。</p>
         */
        @NameInMap("SourceSchemaName")
        public String sourceSchemaName;

        /**
         * <p>The collection of tables to be archived.</p>
         */
        @NameInMap("TableIncludes")
        public java.util.List<CreateDataArchiveOrderRequestParamTableIncludes> tableIncludes;

        /**
         * <p>The table names mapped in the destination database.</p>
         */
        @NameInMap("TableMapping")
        public java.util.List<String> tableMapping;

        /**
         * <p>目标库Host，若目标实例同时开放了内网与公网，优先写入内网Host。</p>
         * <br>
         * <p>- 若归档目标为OSS，则为Bucket名。</p>
         * <p>- 若归档目标为专属存储，则为inner_oss。</p>
         */
        @NameInMap("TargetInstanceHost")
        public String targetInstanceHost;

        /**
         * <p>The configuration of archiving variables.</p>
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

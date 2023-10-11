// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataArchiveOrderRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public CreateDataArchiveOrderRequestParam param;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("RelatedUserList")
    public java.util.List<String> relatedUserList;

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
        @NameInMap("TableName")
        public String tableName;

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
        @NameInMap("ArchiveMethod")
        public String archiveMethod;

        @NameInMap("CronStr")
        public String cronStr;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("OrderAfter")
        public java.util.List<String> orderAfter;

        @NameInMap("RunMethod")
        public String runMethod;

        @NameInMap("SourceCatalogName")
        public String sourceCatalogName;

        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        @NameInMap("SourceSchemaName")
        public String sourceSchemaName;

        @NameInMap("TableIncludes")
        public java.util.List<CreateDataArchiveOrderRequestParamTableIncludes> tableIncludes;

        @NameInMap("TableMapping")
        public java.util.List<String> tableMapping;

        @NameInMap("TargetInstanceHost")
        public String targetInstanceHost;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class CreateInstanceTableRequest extends TeaModel {
    // 描述
    @NameInMap("description")
    public String description;

    // 字段描述
    @NameInMap("fieldMap")
    public CreateInstanceTableRequestFieldMap fieldMap;

    // 全量数据源描述
    @NameInMap("fullDataSourceConfig")
    public CreateInstanceTableRequestFullDataSourceConfig fullDataSourceConfig;

    // 增量数据源描述
    @NameInMap("incDataSourceConfig")
    public CreateInstanceTableRequestIncDataSourceConfig incDataSourceConfig;

    // 索引类型
    @NameInMap("indexType")
    public String indexType;

    // 表名
    @NameInMap("tableName")
    public String tableName;

    // 回流触发模式
    @NameInMap("triggerMode")
    public String triggerMode;

    // Topic过期时间
    @NameInMap("ttl")
    public Long ttl;

    public static CreateInstanceTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTableRequest self = new CreateInstanceTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceTableRequest setFieldMap(CreateInstanceTableRequestFieldMap fieldMap) {
        this.fieldMap = fieldMap;
        return this;
    }
    public CreateInstanceTableRequestFieldMap getFieldMap() {
        return this.fieldMap;
    }

    public CreateInstanceTableRequest setFullDataSourceConfig(CreateInstanceTableRequestFullDataSourceConfig fullDataSourceConfig) {
        this.fullDataSourceConfig = fullDataSourceConfig;
        return this;
    }
    public CreateInstanceTableRequestFullDataSourceConfig getFullDataSourceConfig() {
        return this.fullDataSourceConfig;
    }

    public CreateInstanceTableRequest setIncDataSourceConfig(CreateInstanceTableRequestIncDataSourceConfig incDataSourceConfig) {
        this.incDataSourceConfig = incDataSourceConfig;
        return this;
    }
    public CreateInstanceTableRequestIncDataSourceConfig getIncDataSourceConfig() {
        return this.incDataSourceConfig;
    }

    public CreateInstanceTableRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public CreateInstanceTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateInstanceTableRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public CreateInstanceTableRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public static class CreateInstanceTableRequestFieldMapFields extends TeaModel {
        // 默认值
        @NameInMap("defaultValue")
        public String defaultValue;

        // 描述
        @NameInMap("description")
        public String description;

        @NameInMap("isMultiValue")
        public Boolean isMultiValue;

        @NameInMap("isVirtual")
        public Boolean isVirtual;

        @NameInMap("onlineStatus")
        public Boolean onlineStatus;

        // 是否为主键
        @NameInMap("pkey")
        public Boolean pkey;

        // 插件名
        @NameInMap("pluginName")
        public String pluginName;

        // 插件信息
        @NameInMap("pluginParam")
        public String pluginParam;

        // 分隔符
        @NameInMap("seperator")
        public String seperator;

        // 源字段名
        @NameInMap("sourceName")
        public String sourceName;

        // 源字段类型
        @NameInMap("sourceType")
        public String sourceType;

        // 目标字段名
        @NameInMap("targetName")
        public String targetName;

        // 目标字段类型
        @NameInMap("targetType")
        public String targetType;

        public static CreateInstanceTableRequestFieldMapFields build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestFieldMapFields self = new CreateInstanceTableRequestFieldMapFields();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestFieldMapFields setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateInstanceTableRequestFieldMapFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceTableRequestFieldMapFields setIsMultiValue(Boolean isMultiValue) {
            this.isMultiValue = isMultiValue;
            return this;
        }
        public Boolean getIsMultiValue() {
            return this.isMultiValue;
        }

        public CreateInstanceTableRequestFieldMapFields setIsVirtual(Boolean isVirtual) {
            this.isVirtual = isVirtual;
            return this;
        }
        public Boolean getIsVirtual() {
            return this.isVirtual;
        }

        public CreateInstanceTableRequestFieldMapFields setOnlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        public CreateInstanceTableRequestFieldMapFields setPkey(Boolean pkey) {
            this.pkey = pkey;
            return this;
        }
        public Boolean getPkey() {
            return this.pkey;
        }

        public CreateInstanceTableRequestFieldMapFields setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public CreateInstanceTableRequestFieldMapFields setPluginParam(String pluginParam) {
            this.pluginParam = pluginParam;
            return this;
        }
        public String getPluginParam() {
            return this.pluginParam;
        }

        public CreateInstanceTableRequestFieldMapFields setSeperator(String seperator) {
            this.seperator = seperator;
            return this;
        }
        public String getSeperator() {
            return this.seperator;
        }

        public CreateInstanceTableRequestFieldMapFields setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public CreateInstanceTableRequestFieldMapFields setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public CreateInstanceTableRequestFieldMapFields setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public CreateInstanceTableRequestFieldMapFields setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class CreateInstanceTableRequestFieldMapIndexs extends TeaModel {
        // 字段名
        @NameInMap("field")
        public String field;

        // 索引字段名
        @NameInMap("indexName")
        public String indexName;

        public static CreateInstanceTableRequestFieldMapIndexs build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestFieldMapIndexs self = new CreateInstanceTableRequestFieldMapIndexs();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestFieldMapIndexs setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateInstanceTableRequestFieldMapIndexs setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

    }

    public static class CreateInstanceTableRequestFieldMap extends TeaModel {
        @NameInMap("fields")
        public java.util.List<CreateInstanceTableRequestFieldMapFields> fields;

        // 索引信息
        @NameInMap("indexs")
        public java.util.List<CreateInstanceTableRequestFieldMapIndexs> indexs;

        @NameInMap("isAttributePack")
        public Boolean isAttributePack;

        // 最大外建数
        @NameInMap("maxSkeyNum")
        public Long maxSkeyNum;

        // 离线构建线程数
        @NameInMap("offlineBuildProtectionThreshold")
        public Long offlineBuildProtectionThreshold;

        // 主键
        @NameInMap("pkey")
        public String pkey;

        // 记录类型
        @NameInMap("recordType")
        public String recordType;

        public static CreateInstanceTableRequestFieldMap build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestFieldMap self = new CreateInstanceTableRequestFieldMap();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestFieldMap setFields(java.util.List<CreateInstanceTableRequestFieldMapFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<CreateInstanceTableRequestFieldMapFields> getFields() {
            return this.fields;
        }

        public CreateInstanceTableRequestFieldMap setIndexs(java.util.List<CreateInstanceTableRequestFieldMapIndexs> indexs) {
            this.indexs = indexs;
            return this;
        }
        public java.util.List<CreateInstanceTableRequestFieldMapIndexs> getIndexs() {
            return this.indexs;
        }

        public CreateInstanceTableRequestFieldMap setIsAttributePack(Boolean isAttributePack) {
            this.isAttributePack = isAttributePack;
            return this;
        }
        public Boolean getIsAttributePack() {
            return this.isAttributePack;
        }

        public CreateInstanceTableRequestFieldMap setMaxSkeyNum(Long maxSkeyNum) {
            this.maxSkeyNum = maxSkeyNum;
            return this;
        }
        public Long getMaxSkeyNum() {
            return this.maxSkeyNum;
        }

        public CreateInstanceTableRequestFieldMap setOfflineBuildProtectionThreshold(Long offlineBuildProtectionThreshold) {
            this.offlineBuildProtectionThreshold = offlineBuildProtectionThreshold;
            return this;
        }
        public Long getOfflineBuildProtectionThreshold() {
            return this.offlineBuildProtectionThreshold;
        }

        public CreateInstanceTableRequestFieldMap setPkey(String pkey) {
            this.pkey = pkey;
            return this;
        }
        public String getPkey() {
            return this.pkey;
        }

        public CreateInstanceTableRequestFieldMap setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

    }

    public static class CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc extends TeaModel {
        // 项目名
        @NameInMap("project")
        public String project;

        // 表名
        @NameInMap("table")
        public String table;

        public static CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc self = new CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class CreateInstanceTableRequestFullDataSourceConfig extends TeaModel {
        // MaxCompute描述
        @NameInMap("odpsDataDesc")
        public CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc odpsDataDesc;

        // 数据源类型
        @NameInMap("type")
        public String type;

        public static CreateInstanceTableRequestFullDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestFullDataSourceConfig self = new CreateInstanceTableRequestFullDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestFullDataSourceConfig setOdpsDataDesc(CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc odpsDataDesc) {
            this.odpsDataDesc = odpsDataDesc;
            return this;
        }
        public CreateInstanceTableRequestFullDataSourceConfigOdpsDataDesc getOdpsDataDesc() {
            return this.odpsDataDesc;
        }

        public CreateInstanceTableRequestFullDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc extends TeaModel {
        // topic
        @NameInMap("topic")
        public String topic;

        public static CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc self = new CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class CreateInstanceTableRequestIncDataSourceConfig extends TeaModel {
        @NameInMap("swiftDataDesc")
        public CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc swiftDataDesc;

        // 数据源类型
        @NameInMap("type")
        public String type;

        public static CreateInstanceTableRequestIncDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceTableRequestIncDataSourceConfig self = new CreateInstanceTableRequestIncDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateInstanceTableRequestIncDataSourceConfig setSwiftDataDesc(CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc swiftDataDesc) {
            this.swiftDataDesc = swiftDataDesc;
            return this;
        }
        public CreateInstanceTableRequestIncDataSourceConfigSwiftDataDesc getSwiftDataDesc() {
            return this.swiftDataDesc;
        }

        public CreateInstanceTableRequestIncDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

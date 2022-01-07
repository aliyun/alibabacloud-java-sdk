// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class UpdateInstanceTableRequest extends TeaModel {
    // 描述
    @NameInMap("description")
    public String description;

    // 字段描述
    @NameInMap("fieldMap")
    public UpdateInstanceTableRequestFieldMap fieldMap;

    // 全量数据源描述
    @NameInMap("fullDataSourceConfig")
    public UpdateInstanceTableRequestFullDataSourceConfig fullDataSourceConfig;

    // 增量数据源描述
    @NameInMap("incDataSourceConfig")
    public UpdateInstanceTableRequestIncDataSourceConfig incDataSourceConfig;

    // 索引类型
    @NameInMap("indexType")
    public String indexType;

    // 回流触发模式
    @NameInMap("triggerMode")
    public String triggerMode;

    // Topic过期时间
    @NameInMap("ttl")
    public Long ttl;

    public static UpdateInstanceTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceTableRequest self = new UpdateInstanceTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceTableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateInstanceTableRequest setFieldMap(UpdateInstanceTableRequestFieldMap fieldMap) {
        this.fieldMap = fieldMap;
        return this;
    }
    public UpdateInstanceTableRequestFieldMap getFieldMap() {
        return this.fieldMap;
    }

    public UpdateInstanceTableRequest setFullDataSourceConfig(UpdateInstanceTableRequestFullDataSourceConfig fullDataSourceConfig) {
        this.fullDataSourceConfig = fullDataSourceConfig;
        return this;
    }
    public UpdateInstanceTableRequestFullDataSourceConfig getFullDataSourceConfig() {
        return this.fullDataSourceConfig;
    }

    public UpdateInstanceTableRequest setIncDataSourceConfig(UpdateInstanceTableRequestIncDataSourceConfig incDataSourceConfig) {
        this.incDataSourceConfig = incDataSourceConfig;
        return this;
    }
    public UpdateInstanceTableRequestIncDataSourceConfig getIncDataSourceConfig() {
        return this.incDataSourceConfig;
    }

    public UpdateInstanceTableRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public UpdateInstanceTableRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public UpdateInstanceTableRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public static class UpdateInstanceTableRequestFieldMapFields extends TeaModel {
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

        public static UpdateInstanceTableRequestFieldMapFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestFieldMapFields self = new UpdateInstanceTableRequestFieldMapFields();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestFieldMapFields setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateInstanceTableRequestFieldMapFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateInstanceTableRequestFieldMapFields setIsMultiValue(Boolean isMultiValue) {
            this.isMultiValue = isMultiValue;
            return this;
        }
        public Boolean getIsMultiValue() {
            return this.isMultiValue;
        }

        public UpdateInstanceTableRequestFieldMapFields setIsVirtual(Boolean isVirtual) {
            this.isVirtual = isVirtual;
            return this;
        }
        public Boolean getIsVirtual() {
            return this.isVirtual;
        }

        public UpdateInstanceTableRequestFieldMapFields setOnlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        public UpdateInstanceTableRequestFieldMapFields setPkey(Boolean pkey) {
            this.pkey = pkey;
            return this;
        }
        public Boolean getPkey() {
            return this.pkey;
        }

        public UpdateInstanceTableRequestFieldMapFields setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public UpdateInstanceTableRequestFieldMapFields setPluginParam(String pluginParam) {
            this.pluginParam = pluginParam;
            return this;
        }
        public String getPluginParam() {
            return this.pluginParam;
        }

        public UpdateInstanceTableRequestFieldMapFields setSeperator(String seperator) {
            this.seperator = seperator;
            return this;
        }
        public String getSeperator() {
            return this.seperator;
        }

        public UpdateInstanceTableRequestFieldMapFields setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public UpdateInstanceTableRequestFieldMapFields setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateInstanceTableRequestFieldMapFields setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public UpdateInstanceTableRequestFieldMapFields setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateInstanceTableRequestFieldMapIndexs extends TeaModel {
        // 字段名
        @NameInMap("field")
        public String field;

        // 索引字段名
        @NameInMap("indexName")
        public String indexName;

        public static UpdateInstanceTableRequestFieldMapIndexs build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestFieldMapIndexs self = new UpdateInstanceTableRequestFieldMapIndexs();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestFieldMapIndexs setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateInstanceTableRequestFieldMapIndexs setIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }
        public String getIndexName() {
            return this.indexName;
        }

    }

    public static class UpdateInstanceTableRequestFieldMap extends TeaModel {
        @NameInMap("fields")
        public java.util.List<UpdateInstanceTableRequestFieldMapFields> fields;

        // 索引信息
        @NameInMap("indexs")
        public java.util.List<UpdateInstanceTableRequestFieldMapIndexs> indexs;

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

        public static UpdateInstanceTableRequestFieldMap build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestFieldMap self = new UpdateInstanceTableRequestFieldMap();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestFieldMap setFields(java.util.List<UpdateInstanceTableRequestFieldMapFields> fields) {
            this.fields = fields;
            return this;
        }
        public java.util.List<UpdateInstanceTableRequestFieldMapFields> getFields() {
            return this.fields;
        }

        public UpdateInstanceTableRequestFieldMap setIndexs(java.util.List<UpdateInstanceTableRequestFieldMapIndexs> indexs) {
            this.indexs = indexs;
            return this;
        }
        public java.util.List<UpdateInstanceTableRequestFieldMapIndexs> getIndexs() {
            return this.indexs;
        }

        public UpdateInstanceTableRequestFieldMap setIsAttributePack(Boolean isAttributePack) {
            this.isAttributePack = isAttributePack;
            return this;
        }
        public Boolean getIsAttributePack() {
            return this.isAttributePack;
        }

        public UpdateInstanceTableRequestFieldMap setMaxSkeyNum(Long maxSkeyNum) {
            this.maxSkeyNum = maxSkeyNum;
            return this;
        }
        public Long getMaxSkeyNum() {
            return this.maxSkeyNum;
        }

        public UpdateInstanceTableRequestFieldMap setOfflineBuildProtectionThreshold(Long offlineBuildProtectionThreshold) {
            this.offlineBuildProtectionThreshold = offlineBuildProtectionThreshold;
            return this;
        }
        public Long getOfflineBuildProtectionThreshold() {
            return this.offlineBuildProtectionThreshold;
        }

        public UpdateInstanceTableRequestFieldMap setPkey(String pkey) {
            this.pkey = pkey;
            return this;
        }
        public String getPkey() {
            return this.pkey;
        }

        public UpdateInstanceTableRequestFieldMap setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

    }

    public static class UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc extends TeaModel {
        // 项目名
        @NameInMap("project")
        public String project;

        // 表名
        @NameInMap("table")
        public String table;

        public static UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc self = new UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class UpdateInstanceTableRequestFullDataSourceConfig extends TeaModel {
        // MaxCompute描述
        @NameInMap("odpsDataDesc")
        public UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc odpsDataDesc;

        // 数据源类型
        @NameInMap("type")
        public String type;

        public static UpdateInstanceTableRequestFullDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestFullDataSourceConfig self = new UpdateInstanceTableRequestFullDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestFullDataSourceConfig setOdpsDataDesc(UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc odpsDataDesc) {
            this.odpsDataDesc = odpsDataDesc;
            return this;
        }
        public UpdateInstanceTableRequestFullDataSourceConfigOdpsDataDesc getOdpsDataDesc() {
            return this.odpsDataDesc;
        }

        public UpdateInstanceTableRequestFullDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc extends TeaModel {
        // topic
        @NameInMap("topic")
        public String topic;

        public static UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc self = new UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateInstanceTableRequestIncDataSourceConfig extends TeaModel {
        @NameInMap("swiftDataDesc")
        public UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc swiftDataDesc;

        // 数据源类型
        @NameInMap("type")
        public String type;

        public static UpdateInstanceTableRequestIncDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceTableRequestIncDataSourceConfig self = new UpdateInstanceTableRequestIncDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceTableRequestIncDataSourceConfig setSwiftDataDesc(UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc swiftDataDesc) {
            this.swiftDataDesc = swiftDataDesc;
            return this;
        }
        public UpdateInstanceTableRequestIncDataSourceConfigSwiftDataDesc getSwiftDataDesc() {
            return this.swiftDataDesc;
        }

        public UpdateInstanceTableRequestIncDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

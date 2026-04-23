// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class KnowledgeBaseVO extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Confidence")
    public Double confidence;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("Description")
    public String description;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("Env")
    public String env;

    @NameInMap("Expr")
    public String expr;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsDelete")
    public Boolean isDelete;

    @NameInMap("KnowledgeId")
    public String knowledgeId;

    @NameInMap("KnowledgeType")
    public String knowledgeType;

    @NameInMap("LevelType")
    public String levelType;

    @NameInMap("Name")
    public String name;

    @NameInMap("OldDescription")
    public String oldDescription;

    @NameInMap("OldSummary")
    public String oldSummary;

    @NameInMap("ParseDesc")
    public String parseDesc;

    @NameInMap("ReasoningLogic")
    public String reasoningLogic;

    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("ShowType")
    public String showType;

    @NameInMap("Summary")
    public String summary;

    @NameInMap("TableName")
    public String tableName;

    public static KnowledgeBaseVO build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseVO self = new KnowledgeBaseVO();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseVO setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public KnowledgeBaseVO setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
    public Double getConfidence() {
        return this.confidence;
    }

    public KnowledgeBaseVO setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public KnowledgeBaseVO setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public KnowledgeBaseVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBaseVO setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public KnowledgeBaseVO setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public KnowledgeBaseVO setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public KnowledgeBaseVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public KnowledgeBaseVO setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public KnowledgeBaseVO setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }
    public Boolean getIsDelete() {
        return this.isDelete;
    }

    public KnowledgeBaseVO setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public KnowledgeBaseVO setKnowledgeType(String knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }
    public String getKnowledgeType() {
        return this.knowledgeType;
    }

    public KnowledgeBaseVO setLevelType(String levelType) {
        this.levelType = levelType;
        return this;
    }
    public String getLevelType() {
        return this.levelType;
    }

    public KnowledgeBaseVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KnowledgeBaseVO setOldDescription(String oldDescription) {
        this.oldDescription = oldDescription;
        return this;
    }
    public String getOldDescription() {
        return this.oldDescription;
    }

    public KnowledgeBaseVO setOldSummary(String oldSummary) {
        this.oldSummary = oldSummary;
        return this;
    }
    public String getOldSummary() {
        return this.oldSummary;
    }

    public KnowledgeBaseVO setParseDesc(String parseDesc) {
        this.parseDesc = parseDesc;
        return this;
    }
    public String getParseDesc() {
        return this.parseDesc;
    }

    public KnowledgeBaseVO setReasoningLogic(String reasoningLogic) {
        this.reasoningLogic = reasoningLogic;
        return this;
    }
    public String getReasoningLogic() {
        return this.reasoningLogic;
    }

    public KnowledgeBaseVO setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public KnowledgeBaseVO setShowType(String showType) {
        this.showType = showType;
        return this;
    }
    public String getShowType() {
        return this.showType;
    }

    public KnowledgeBaseVO setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public KnowledgeBaseVO setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}

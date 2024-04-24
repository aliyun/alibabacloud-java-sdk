// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EditRecognizeRuleRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ColExclude")
    public String colExclude;

    @NameInMap("ColScan")
    public String colScan;

    @NameInMap("CommentScan")
    public String commentScan;

    @NameInMap("ContentScan")
    public String contentScan;

    @NameInMap("HitThreshold")
    public Integer hitThreshold;

    @NameInMap("LevelName")
    public String levelName;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeParent")
    public String nodeParent;

    @NameInMap("OperationType")
    public Integer operationType;

    @NameInMap("RecognizeRules")
    public String recognizeRules;

    @NameInMap("RecognizeRulesType")
    public String recognizeRulesType;

    @NameInMap("SensitiveDescription")
    public String sensitiveDescription;

    @NameInMap("SensitiveId")
    public String sensitiveId;

    @NameInMap("SensitiveName")
    public String sensitiveName;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("level")
    public String level;

    public static EditRecognizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EditRecognizeRuleRequest self = new EditRecognizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public EditRecognizeRuleRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public EditRecognizeRuleRequest setColExclude(String colExclude) {
        this.colExclude = colExclude;
        return this;
    }
    public String getColExclude() {
        return this.colExclude;
    }

    public EditRecognizeRuleRequest setColScan(String colScan) {
        this.colScan = colScan;
        return this;
    }
    public String getColScan() {
        return this.colScan;
    }

    public EditRecognizeRuleRequest setCommentScan(String commentScan) {
        this.commentScan = commentScan;
        return this;
    }
    public String getCommentScan() {
        return this.commentScan;
    }

    public EditRecognizeRuleRequest setContentScan(String contentScan) {
        this.contentScan = contentScan;
        return this;
    }
    public String getContentScan() {
        return this.contentScan;
    }

    public EditRecognizeRuleRequest setHitThreshold(Integer hitThreshold) {
        this.hitThreshold = hitThreshold;
        return this;
    }
    public Integer getHitThreshold() {
        return this.hitThreshold;
    }

    public EditRecognizeRuleRequest setLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }
    public String getLevelName() {
        return this.levelName;
    }

    public EditRecognizeRuleRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public EditRecognizeRuleRequest setNodeParent(String nodeParent) {
        this.nodeParent = nodeParent;
        return this;
    }
    public String getNodeParent() {
        return this.nodeParent;
    }

    public EditRecognizeRuleRequest setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }
    public Integer getOperationType() {
        return this.operationType;
    }

    public EditRecognizeRuleRequest setRecognizeRules(String recognizeRules) {
        this.recognizeRules = recognizeRules;
        return this;
    }
    public String getRecognizeRules() {
        return this.recognizeRules;
    }

    public EditRecognizeRuleRequest setRecognizeRulesType(String recognizeRulesType) {
        this.recognizeRulesType = recognizeRulesType;
        return this;
    }
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    public EditRecognizeRuleRequest setSensitiveDescription(String sensitiveDescription) {
        this.sensitiveDescription = sensitiveDescription;
        return this;
    }
    public String getSensitiveDescription() {
        return this.sensitiveDescription;
    }

    public EditRecognizeRuleRequest setSensitiveId(String sensitiveId) {
        this.sensitiveId = sensitiveId;
        return this;
    }
    public String getSensitiveId() {
        return this.sensitiveId;
    }

    public EditRecognizeRuleRequest setSensitiveName(String sensitiveName) {
        this.sensitiveName = sensitiveName;
        return this;
    }
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    public EditRecognizeRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public EditRecognizeRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EditRecognizeRuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EditRecognizeRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddRecognizeRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Level")
    public String level;

    @NameInMap("LevelName")
    public String levelName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeParent")
    public String nodeParent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationType")
    public Integer operationType;

    @NameInMap("RecognizeRules")
    public String recognizeRules;

    @NameInMap("RecognizeRulesType")
    public String recognizeRulesType;

    @NameInMap("SensitiveDescription")
    public String sensitiveDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SensitiveName")
    public String sensitiveName;

    @NameInMap("Status")
    public Integer status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static AddRecognizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecognizeRuleRequest self = new AddRecognizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddRecognizeRuleRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AddRecognizeRuleRequest setColExclude(String colExclude) {
        this.colExclude = colExclude;
        return this;
    }
    public String getColExclude() {
        return this.colExclude;
    }

    public AddRecognizeRuleRequest setColScan(String colScan) {
        this.colScan = colScan;
        return this;
    }
    public String getColScan() {
        return this.colScan;
    }

    public AddRecognizeRuleRequest setCommentScan(String commentScan) {
        this.commentScan = commentScan;
        return this;
    }
    public String getCommentScan() {
        return this.commentScan;
    }

    public AddRecognizeRuleRequest setContentScan(String contentScan) {
        this.contentScan = contentScan;
        return this;
    }
    public String getContentScan() {
        return this.contentScan;
    }

    public AddRecognizeRuleRequest setHitThreshold(Integer hitThreshold) {
        this.hitThreshold = hitThreshold;
        return this;
    }
    public Integer getHitThreshold() {
        return this.hitThreshold;
    }

    public AddRecognizeRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public AddRecognizeRuleRequest setLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }
    public String getLevelName() {
        return this.levelName;
    }

    public AddRecognizeRuleRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AddRecognizeRuleRequest setNodeParent(String nodeParent) {
        this.nodeParent = nodeParent;
        return this;
    }
    public String getNodeParent() {
        return this.nodeParent;
    }

    public AddRecognizeRuleRequest setOperationType(Integer operationType) {
        this.operationType = operationType;
        return this;
    }
    public Integer getOperationType() {
        return this.operationType;
    }

    public AddRecognizeRuleRequest setRecognizeRules(String recognizeRules) {
        this.recognizeRules = recognizeRules;
        return this;
    }
    public String getRecognizeRules() {
        return this.recognizeRules;
    }

    public AddRecognizeRuleRequest setRecognizeRulesType(String recognizeRulesType) {
        this.recognizeRulesType = recognizeRulesType;
        return this;
    }
    public String getRecognizeRulesType() {
        return this.recognizeRulesType;
    }

    public AddRecognizeRuleRequest setSensitiveDescription(String sensitiveDescription) {
        this.sensitiveDescription = sensitiveDescription;
        return this;
    }
    public String getSensitiveDescription() {
        return this.sensitiveDescription;
    }

    public AddRecognizeRuleRequest setSensitiveName(String sensitiveName) {
        this.sensitiveName = sensitiveName;
        return this;
    }
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    public AddRecognizeRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AddRecognizeRuleRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AddRecognizeRuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

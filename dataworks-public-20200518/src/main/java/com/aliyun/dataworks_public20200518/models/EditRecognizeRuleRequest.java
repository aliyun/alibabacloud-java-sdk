// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EditRecognizeRuleRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account that is used to create the sensitive data identification rule. Enter the username of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dsg-uat</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Excludes fields. The system does not identify fields that are assigned with values.</p>
     * <ul>
     * <li>The value must be in the ${Project name}.${Table name}.${Field name} or ${Project name}.${Schema name}.${Table name}.${Field name} format.</li>
     * <li><em>Wildcards are supported. For example, the asterisk (\</em>) in default.table.column1\* can be used to match any content following default.table.column1, such as default.table.column10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default.qujian.*6</p>
     */
    @NameInMap("ColExclude")
    public String colExclude;

    /**
     * <p>Scans fields. The system identifies only fields that are assigned with values.</p>
     * <ul>
     * <li>The value must be in the ${Project name}.${Table name}.${Field name} or ${Project name}.${Schema name}.${Table name}.${Field name} format.</li>
     * <li><em>Wildcards are supported. For example, the asterisk (\</em>) in default.table.column1\* can be used to match any content following default.table.column1, such as default.table.column10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default.qujian.*</p>
     */
    @NameInMap("ColScan")
    public String colScan;

    /**
     * <p>Scans content. The value is the text of each field comment in your data asset. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CommentScan")
    public String commentScan;

    /**
     * <p>Identifies content. You can call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation to query the value of the current parameter for a built-in sensitive field.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;_clazz&quot;:&quot;com.alipay.dsgclient.sdk.dsg.fastscan.engine.cond.NationalityCond&quot;}</p>
     */
    @NameInMap("ContentScan")
    public String contentScan;

    /**
     * <p>The hit ratio threshold. If more than 60%, which is a sample hit ratio threshold, of all sample data records hit the Name Entity Recognition (NER) model, the sensitive field is hit. The value can be an integer from 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("HitThreshold")
    public Integer hitThreshold;

    /**
     * <p>The name of the sensitivity level. You can call the <a href="https://help.aliyun.com/document_detail/2743948.html">QueryDefaultTemplate</a> operation to obtain the name of the sensitivity level in the related template.</p>
     * 
     * <strong>example:</strong>
     * <p>Confidential</p>
     */
    @NameInMap("LevelName")
    public String levelName;

    /**
     * <p>The ID of the data category. You can call the <a href="https://help.aliyun.com/document_detail/2746850.html">QuerySensClassification</a> operation to query the ID of all data categories. Then, you can select a data category to create a sensitive field. Enter the ID of the selected data category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0ce67949-0810-400f-a24a-cc5ffafe1024</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The information about the parent data category of the current data category. You can call the <a href="https://help.aliyun.com/document_detail/2746850.html">QuerySensClassification</a> operation to obtain the ID of a data category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer/personal/personal_Natural_Information/personal_basic_profile_information</p>
     */
    @NameInMap("NodeParent")
    public String nodeParent;

    /**
     * <p>The type of the arithmetic operation. Valid values:</p>
     * <ul>
     * <li>0: OR</li>
     * <li>1: AND</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperationType")
    public Integer operationType;

    /**
     * <p>The content of the sensitive data identification rule. You can call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation to query the value of the current parameter for a built-in sensitive field.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;contentRule&quot;:{&quot;_clazz&quot;:&quot;com.alipay.dsgclient.sdk.dsg.fastscan.engine.cond.GenderCond&quot;},&quot;_clazz&quot;:&quot;com.alipay.dsg.dal.model.RuleContent&quot;}</p>
     */
    @NameInMap("RecognizeRules")
    public String recognizeRules;

    /**
     * <p>The type of the sensitive data identification rule. Valid values:</p>
     * <ul>
     * <li>1: regular expression</li>
     * <li>2: built-in rule</li>
     * <li>3: sample library</li>
     * <li>4: self-generated data identification model</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecognizeRulesType")
    public String recognizeRulesType;

    /**
     * <p>The description of the sensitive field. Enter a string that is less than 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a sensitive field that identifies the name.</p>
     */
    @NameInMap("SensitiveDescription")
    public String sensitiveDescription;

    /**
     * <p>The sensitive field ID. You can call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation to query the IDs of all sensitive fields. You can also call the <a href="https://help.aliyun.com/document_detail/2766023.html">QueryRecognizeRuleDetail</a> operation to query the IDs of specific sensitive fields.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1a928de7-3962-4e07-93ac-e1973baa1024</p>
     */
    @NameInMap("SensitiveId")
    public String sensitiveId;

    /**
     * <p>The name of the custom sensitive field. Enter a string that is less than 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SensitiveName")
    public String sensitiveName;

    /**
     * <p>The status of the sensitive field. Valid values:</p>
     * <ul>
     * <li>0: draft</li>
     * <li>1: effective</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The template ID. You can call the <a href="https://help.aliyun.com/document_detail/2743948.html">QueryDefaultTemplate</a> operation to obtain the template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1970541-6cf5-4d23-b101-d5b66f6e1024</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The sensitivity level of the sensitive field. You can select one from all sensitivity levels that are defined in a template as the sensitivity level of the sensitive field, such as level 1 to level 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateScanRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4abntrj42twd****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Namespaces")
    public String namespacesShrink;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RepoNames")
    public String repoNamesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-.*</p>
     */
    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scan-test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crscnr-3qmkeiuggfpjkfrq</p>
     */
    @NameInMap("ScanRuleId")
    public String scanRuleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPO</p>
     */
    @NameInMap("ScanScope")
    public String scanScope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    public static UpdateScanRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScanRuleShrinkRequest self = new UpdateScanRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScanRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScanRuleShrinkRequest setNamespacesShrink(String namespacesShrink) {
        this.namespacesShrink = namespacesShrink;
        return this;
    }
    public String getNamespacesShrink() {
        return this.namespacesShrink;
    }

    public UpdateScanRuleShrinkRequest setRepoNamesShrink(String repoNamesShrink) {
        this.repoNamesShrink = repoNamesShrink;
        return this;
    }
    public String getRepoNamesShrink() {
        return this.repoNamesShrink;
    }

    public UpdateScanRuleShrinkRequest setRepoTagFilterPattern(String repoTagFilterPattern) {
        this.repoTagFilterPattern = repoTagFilterPattern;
        return this;
    }
    public String getRepoTagFilterPattern() {
        return this.repoTagFilterPattern;
    }

    public UpdateScanRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateScanRuleShrinkRequest setScanRuleId(String scanRuleId) {
        this.scanRuleId = scanRuleId;
        return this;
    }
    public String getScanRuleId() {
        return this.scanRuleId;
    }

    public UpdateScanRuleShrinkRequest setScanScope(String scanScope) {
        this.scanScope = scanScope;
        return this;
    }
    public String getScanScope() {
        return this.scanScope;
    }

    public UpdateScanRuleShrinkRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}

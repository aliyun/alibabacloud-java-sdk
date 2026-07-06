// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateScanRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4abntrj42twd****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The collection of namespaces.</p>
     * <ul>
     * <li>If the scan scope is set to NAMESPACE, this parameter is required.</li>
     * <li>If the scan scope is set to REPO, specify exactly one namespace for this parameter.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Namespaces")
    public java.util.List<String> namespaces;

    /**
     * <p>The list of repositories.</p>
     * <ul>
     * <li>If the scan scope is set to NAMESPACE, this parameter must be empty.</li>
     * <li>If the scan scope is set to REPO, this parameter is required.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RepoNames")
    public java.util.List<String> repoNames;

    /**
     * <p>The tag filtering rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-.*</p>
     */
    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    /**
     * <p>The rule name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scan-test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crscnr-3qmkeiuggfpjkfrq</p>
     */
    @NameInMap("ScanRuleId")
    public String scanRuleId;

    /**
     * <p>The scan scope. Valid values:</p>
     * <ul>
     * <li>NAMESPACE: namespace</li>
     * <li>REPO: repository.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPO</p>
     */
    @NameInMap("ScanScope")
    public String scanScope;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li>AUTO: Automatically triggered upon push.</li>
     * <li>MANUAL: Manually triggered.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    public static UpdateScanRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScanRuleRequest self = new UpdateScanRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScanRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateScanRuleRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public UpdateScanRuleRequest setRepoNames(java.util.List<String> repoNames) {
        this.repoNames = repoNames;
        return this;
    }
    public java.util.List<String> getRepoNames() {
        return this.repoNames;
    }

    public UpdateScanRuleRequest setRepoTagFilterPattern(String repoTagFilterPattern) {
        this.repoTagFilterPattern = repoTagFilterPattern;
        return this;
    }
    public String getRepoTagFilterPattern() {
        return this.repoTagFilterPattern;
    }

    public UpdateScanRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateScanRuleRequest setScanRuleId(String scanRuleId) {
        this.scanRuleId = scanRuleId;
        return this;
    }
    public String getScanRuleId() {
        return this.scanRuleId;
    }

    public UpdateScanRuleRequest setScanScope(String scanScope) {
        this.scanScope = scanScope;
        return this;
    }
    public String getScanScope() {
        return this.scanScope;
    }

    public UpdateScanRuleRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}

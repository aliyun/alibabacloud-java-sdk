// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateScanRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-dqwc**********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The collection of namespaces.</p>
     * <ul>
     * <li>If the scan scope is set to NAMESPACE, this parameter cannot be empty.</li>
     * <li>If the scan scope is set to REPO, this parameter must contain exactly one namespace.</li>
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
     * <li>If the scan scope is set to REPO, this parameter cannot be empty.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RepoNames")
    public java.util.List<String> repoNames;

    /**
     * <p>The regular expression used to match tags that trigger a scan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    /**
     * <p>The rule name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The scan scope.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NAMESPACE</p>
     */
    @NameInMap("ScanScope")
    public String scanScope;

    /**
     * <p>The scan type. Valid values:</p>
     * <ul>
     * <li><code>VUL</code>: cloud native artifact vulnerability scanning.</li>
     * <li><code>SBOM</code>: cloud native artifact content analysis.</li>
     * </ul>
     * <p>Default value: <code>VUL</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>VUL</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The trigger type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    public static CreateScanRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScanRuleRequest self = new CreateScanRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScanRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScanRuleRequest setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public CreateScanRuleRequest setRepoNames(java.util.List<String> repoNames) {
        this.repoNames = repoNames;
        return this;
    }
    public java.util.List<String> getRepoNames() {
        return this.repoNames;
    }

    public CreateScanRuleRequest setRepoTagFilterPattern(String repoTagFilterPattern) {
        this.repoTagFilterPattern = repoTagFilterPattern;
        return this;
    }
    public String getRepoTagFilterPattern() {
        return this.repoTagFilterPattern;
    }

    public CreateScanRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateScanRuleRequest setScanScope(String scanScope) {
        this.scanScope = scanScope;
        return this;
    }
    public String getScanScope() {
        return this.scanScope;
    }

    public CreateScanRuleRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public CreateScanRuleRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}

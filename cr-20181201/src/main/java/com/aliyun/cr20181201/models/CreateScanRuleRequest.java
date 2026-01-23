// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateScanRuleRequest extends TeaModel {
    /**
     * <p>The instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-dqwc**********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of namespaces.</p>
     * <ul>
     * <li>When the scan scope is NAMESPACE, this parameter cannot be empty.</li>
     * <li>If the scan scope is REPO, you must specify a unique Namespace for this parameter.</li>
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
     * <li>When the scan scope is NAMESPACE, this parameter must be empty.</li>
     * <li>When the scan scope is REPO, this parameter cannot be empty.</li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("RepoNames")
    public java.util.List<String> repoNames;

    /**
     * <p>The tag that triggers the scan matches the regular expression</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>.*</p>
     */
    @NameInMap("RepoTagFilterPattern")
    public String repoTagFilterPattern;

    /**
     * <p>The rule name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The scan scope</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>NAMESPACE: namespace.</li>
     * <li>REPO: repository.</li>
     * </ul>
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
     * <li><code>VUL</code>: Products Cloud Security Scanner</li>
     * <li><code>SBOM</code>: Product Content Analysis</li>
     * </ul>
     * <p>Default value: <code>VUL</code></p>
     * 
     * <strong>example:</strong>
     * <p>VUL</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>Trigger type</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AUTO: automatically trigger.</li>
     * <li>MANUAL: manually trigger.</li>
     * </ul>
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

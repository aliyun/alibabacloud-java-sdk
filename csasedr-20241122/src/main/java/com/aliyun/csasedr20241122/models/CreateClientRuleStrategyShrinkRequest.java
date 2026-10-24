// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class CreateClientRuleStrategyShrinkRequest extends TeaModel {
    /**
     * <p>The action of the policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: monitor mode.</li>
     * <li><strong>1</strong>: block startup.</li>
     * <li><strong>2</strong>: Block Mode.
     * Valid values for custom rules of proactive defense (PolicyType=2):</li>
     * <li><strong>0</strong>: add to allowlist and allow.</li>
     * <li><strong>1</strong>: add to blocklist and block.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ActionType")
    public Integer actionType;

    /**
     * <p>Specifies whether the policy takes effect for all user groups. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no.</li>
     * <li><strong>1</strong>: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllGroup")
    public Integer allGroup;

    /**
     * <p>The ID of the reporting and approval process.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-b567d830cd17674c</p>
     */
    @NameInMap("ApprovalId")
    public String approvalId;

    /**
     * <p>The matched process command line.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Windows\System32\RuntimeBroker.exe -Embedding</p>
     */
    @NameInMap("Cmdline")
    public String cmdline;

    /**
     * <p>The description of the policy.</p>
     * <blockquote>
     * <p>The maximum length is 128 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of usernames for which the policy does not take effect.</p>
     */
    @NameInMap("ExcludeUserNameList")
    public String excludeUserNameListShrink;

    /**
     * <p>The matched file path.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Program Files\Example\example.exe</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The inbound network switch.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InSwitch")
    public Boolean inSwitch;

    /**
     * <p>The list of IDs of the user groups for which the policy takes effect.</p>
     */
    @NameInMap("IncludeGroupIdList")
    public String includeGroupIdListShrink;

    /**
     * <p>The matched IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The text of the primary button in the Chinese button configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MainButtonTextCh")
    public String mainButtonTextCh;

    /**
     * <p>The text of the primary button in the English button configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MainButtonTextEn")
    public String mainButtonTextEn;

    /**
     * <p>The effective scope mode. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: all user groups.</li>
     * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
     * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
     * <li><strong>DevTagNormal</strong>: specified device tags.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The list of effective scope targets. The meaning of the targets is determined by MatchMode.</p>
     */
    @NameInMap("MatchTargetIds")
    public java.util.List<String> matchTargetIds;

    /**
     * <p>The MD5 match string of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>d41d8cd98f00b204e9800998ecf8427e</p>
     */
    @NameInMap("Md5List")
    public String md5List;

    /**
     * <p>The text of the secondary button in the Chinese button configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MinorButtonTextCh")
    public String minorButtonTextCh;

    /**
     * <p>The text of the secondary button in the English button configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("MinorButtonTextEn")
    public String minorButtonTextEn;

    /**
     * <p>The Policy Name.</p>
     * <blockquote>
     * <p>The maximum length is 128 characters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The matched new file path.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Program Files\Example\renamed.exe</p>
     */
    @NameInMap("NewFilePath")
    public String newFilePath;

    /**
     * <p>The outbound network switch.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutSwitch")
    public Boolean outSwitch;

    /**
     * <p>The matched parent process command line.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Windows\System32\svchost.exe -k DcomLaunch -p</p>
     */
    @NameInMap("ParentCmdline")
    public String parentCmdline;

    /**
     * <p>The matched parent process path.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Windows\System32\svchost.exe</p>
     */
    @NameInMap("ParentProcPath")
    public String parentProcPath;

    /**
     * <p>The platform to which the rule applies. Valid values:</p>
     * <ul>
     * <li><strong>linux</strong></li>
     * <li><strong>windows</strong></li>
     * <li><strong>mac</strong></li>
     * <li><strong>all</strong>: all platforms.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: software hardening.</li>
     * <li><strong>1</strong>: firewall.</li>
     * <li><strong>2</strong>: proactive defense.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PolicyType")
    public Integer policyType;

    /**
     * <p>The matched port.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The list of enabled ports.</p>
     * <blockquote>
     * <p>This parameter is valid only when the policy type is firewall.</p>
     * </blockquote>
     */
    @NameInMap("PortOnList")
    public String portOnListShrink;

    /**
     * <p>The policy priority. A smaller value indicates a higher priority. Valid values: greater than 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The matched process path.</p>
     * 
     * <strong>example:</strong>
     * <p>C:\Windows\System32\RuntimeBroker.exe</p>
     */
    @NameInMap("ProcPath")
    public String procPath;

    /**
     * <p>The matched registry content.</p>
     * 
     * <strong>example:</strong>
     * <p>ExampleValue</p>
     */
    @NameInMap("RegistryContent")
    public String registryContent;

    /**
     * <p>The matched registry key.</p>
     * 
     * <strong>example:</strong>
     * <p>HKEY_LOCAL_MACHINE\Software\Example</p>
     */
    @NameInMap("RegistryKey")
    public String registryKey;

    /**
     * <p>The type of the defense rule. Valid values: 1 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The key of the switch configuration for the rule associated with the policy. This key can be used in ListSystemConfigRules and OperateTargetConfig.</p>
     * 
     * <strong>example:</strong>
     * <p>a8d64565-ab8b-41a6-bd3d-14d0fc639285</p>
     */
    @NameInMap("SelectionKey")
    public String selectionKey;

    /**
     * <p>The list of main process names of the software for which integrity check is enabled. The elements correspond to the Process returned by GetSwitchInfoListByType.</p>
     */
    @NameInMap("SoftWareOnList")
    public String softWareOnListShrink;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The rule source for proactive defense (PolicyType=2). Valid values:</p>
     * <ul>
     * <li><strong>SYSTEM</strong>: system rules.</li>
     * <li><strong>CUSTOM</strong>: custom rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("StrategySourceType")
    public String strategySourceType;

    /**
     * <p>Specifies whether reporting and approval are supported. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not supported.</li>
     * <li><strong>1</strong>: supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SupportsApproval")
    public Integer supportsApproval;

    /**
     * <p>The English content in the pop-up prompt configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UsContent")
    public String usContent;

    /**
     * <p>The English title in the pop-up prompt configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UsTitle")
    public String usTitle;

    /**
     * <p>The Chinese content in the pop-up prompt configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ZhContent")
    public String zhContent;

    /**
     * <p>The Chinese title in the pop-up prompt configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ZhTitle")
    public String zhTitle;

    public static CreateClientRuleStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientRuleStrategyShrinkRequest self = new CreateClientRuleStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientRuleStrategyShrinkRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public CreateClientRuleStrategyShrinkRequest setAllGroup(Integer allGroup) {
        this.allGroup = allGroup;
        return this;
    }
    public Integer getAllGroup() {
        return this.allGroup;
    }

    public CreateClientRuleStrategyShrinkRequest setApprovalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public String getApprovalId() {
        return this.approvalId;
    }

    public CreateClientRuleStrategyShrinkRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
    }

    public CreateClientRuleStrategyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClientRuleStrategyShrinkRequest setExcludeUserNameListShrink(String excludeUserNameListShrink) {
        this.excludeUserNameListShrink = excludeUserNameListShrink;
        return this;
    }
    public String getExcludeUserNameListShrink() {
        return this.excludeUserNameListShrink;
    }

    public CreateClientRuleStrategyShrinkRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateClientRuleStrategyShrinkRequest setInSwitch(Boolean inSwitch) {
        this.inSwitch = inSwitch;
        return this;
    }
    public Boolean getInSwitch() {
        return this.inSwitch;
    }

    public CreateClientRuleStrategyShrinkRequest setIncludeGroupIdListShrink(String includeGroupIdListShrink) {
        this.includeGroupIdListShrink = includeGroupIdListShrink;
        return this;
    }
    public String getIncludeGroupIdListShrink() {
        return this.includeGroupIdListShrink;
    }

    public CreateClientRuleStrategyShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateClientRuleStrategyShrinkRequest setMainButtonTextCh(String mainButtonTextCh) {
        this.mainButtonTextCh = mainButtonTextCh;
        return this;
    }
    public String getMainButtonTextCh() {
        return this.mainButtonTextCh;
    }

    public CreateClientRuleStrategyShrinkRequest setMainButtonTextEn(String mainButtonTextEn) {
        this.mainButtonTextEn = mainButtonTextEn;
        return this;
    }
    public String getMainButtonTextEn() {
        return this.mainButtonTextEn;
    }

    public CreateClientRuleStrategyShrinkRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateClientRuleStrategyShrinkRequest setMatchTargetIds(java.util.List<String> matchTargetIds) {
        this.matchTargetIds = matchTargetIds;
        return this;
    }
    public java.util.List<String> getMatchTargetIds() {
        return this.matchTargetIds;
    }

    public CreateClientRuleStrategyShrinkRequest setMd5List(String md5List) {
        this.md5List = md5List;
        return this;
    }
    public String getMd5List() {
        return this.md5List;
    }

    public CreateClientRuleStrategyShrinkRequest setMinorButtonTextCh(String minorButtonTextCh) {
        this.minorButtonTextCh = minorButtonTextCh;
        return this;
    }
    public String getMinorButtonTextCh() {
        return this.minorButtonTextCh;
    }

    public CreateClientRuleStrategyShrinkRequest setMinorButtonTextEn(String minorButtonTextEn) {
        this.minorButtonTextEn = minorButtonTextEn;
        return this;
    }
    public String getMinorButtonTextEn() {
        return this.minorButtonTextEn;
    }

    public CreateClientRuleStrategyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClientRuleStrategyShrinkRequest setNewFilePath(String newFilePath) {
        this.newFilePath = newFilePath;
        return this;
    }
    public String getNewFilePath() {
        return this.newFilePath;
    }

    public CreateClientRuleStrategyShrinkRequest setOutSwitch(Boolean outSwitch) {
        this.outSwitch = outSwitch;
        return this;
    }
    public Boolean getOutSwitch() {
        return this.outSwitch;
    }

    public CreateClientRuleStrategyShrinkRequest setParentCmdline(String parentCmdline) {
        this.parentCmdline = parentCmdline;
        return this;
    }
    public String getParentCmdline() {
        return this.parentCmdline;
    }

    public CreateClientRuleStrategyShrinkRequest setParentProcPath(String parentProcPath) {
        this.parentProcPath = parentProcPath;
        return this;
    }
    public String getParentProcPath() {
        return this.parentProcPath;
    }

    public CreateClientRuleStrategyShrinkRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateClientRuleStrategyShrinkRequest setPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }
    public Integer getPolicyType() {
        return this.policyType;
    }

    public CreateClientRuleStrategyShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateClientRuleStrategyShrinkRequest setPortOnListShrink(String portOnListShrink) {
        this.portOnListShrink = portOnListShrink;
        return this;
    }
    public String getPortOnListShrink() {
        return this.portOnListShrink;
    }

    public CreateClientRuleStrategyShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateClientRuleStrategyShrinkRequest setProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }
    public String getProcPath() {
        return this.procPath;
    }

    public CreateClientRuleStrategyShrinkRequest setRegistryContent(String registryContent) {
        this.registryContent = registryContent;
        return this;
    }
    public String getRegistryContent() {
        return this.registryContent;
    }

    public CreateClientRuleStrategyShrinkRequest setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
        return this;
    }
    public String getRegistryKey() {
        return this.registryKey;
    }

    public CreateClientRuleStrategyShrinkRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public CreateClientRuleStrategyShrinkRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public CreateClientRuleStrategyShrinkRequest setSoftWareOnListShrink(String softWareOnListShrink) {
        this.softWareOnListShrink = softWareOnListShrink;
        return this;
    }
    public String getSoftWareOnListShrink() {
        return this.softWareOnListShrink;
    }

    public CreateClientRuleStrategyShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateClientRuleStrategyShrinkRequest setStrategySourceType(String strategySourceType) {
        this.strategySourceType = strategySourceType;
        return this;
    }
    public String getStrategySourceType() {
        return this.strategySourceType;
    }

    public CreateClientRuleStrategyShrinkRequest setSupportsApproval(Integer supportsApproval) {
        this.supportsApproval = supportsApproval;
        return this;
    }
    public Integer getSupportsApproval() {
        return this.supportsApproval;
    }

    public CreateClientRuleStrategyShrinkRequest setUsContent(String usContent) {
        this.usContent = usContent;
        return this;
    }
    public String getUsContent() {
        return this.usContent;
    }

    public CreateClientRuleStrategyShrinkRequest setUsTitle(String usTitle) {
        this.usTitle = usTitle;
        return this;
    }
    public String getUsTitle() {
        return this.usTitle;
    }

    public CreateClientRuleStrategyShrinkRequest setZhContent(String zhContent) {
        this.zhContent = zhContent;
        return this;
    }
    public String getZhContent() {
        return this.zhContent;
    }

    public CreateClientRuleStrategyShrinkRequest setZhTitle(String zhTitle) {
        this.zhTitle = zhTitle;
        return this;
    }
    public String getZhTitle() {
        return this.zhTitle;
    }

}

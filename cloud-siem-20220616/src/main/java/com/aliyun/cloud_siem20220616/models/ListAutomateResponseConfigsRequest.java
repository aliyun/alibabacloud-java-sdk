// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsRequest extends TeaModel {
    /**
     * <p>The type of the handling action. Valid values:</p>
     * <ul>
     * <li>doPlaybook: runs a playbook.</li>
     * <li>changeEventStatus: changes the status of an event.</li>
     * <li>changeThreatLevel: changes the risk level of an event.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doPlaybook</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The type of the automated response rule. Valid values:</p>
     * <ul>
     * <li>event</li>
     * <li>alert</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UUID of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>system_aliyun_aegis_kill_quara_book</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResponseRuleType")
    public String responseRuleType;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The name of the automated response rule.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw kill quara book</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li>0: disabled</li>
     * <li>100: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the user who created the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>17108579417****</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    public static ListAutomateResponseConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutomateResponseConfigsRequest self = new ListAutomateResponseConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAutomateResponseConfigsRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public ListAutomateResponseConfigsRequest setAutoResponseType(String autoResponseType) {
        this.autoResponseType = autoResponseType;
        return this;
    }
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    public ListAutomateResponseConfigsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAutomateResponseConfigsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListAutomateResponseConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAutomateResponseConfigsRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public ListAutomateResponseConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAutomateResponseConfigsRequest setResponseRuleType(String responseRuleType) {
        this.responseRuleType = responseRuleType;
        return this;
    }
    public String getResponseRuleType() {
        return this.responseRuleType;
    }

    public ListAutomateResponseConfigsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListAutomateResponseConfigsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListAutomateResponseConfigsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListAutomateResponseConfigsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListAutomateResponseConfigsRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}

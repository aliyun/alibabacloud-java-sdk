// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsRequest extends TeaModel {
    /**
     * <p>The type of the handling action. Valid values:</p>
     * <ul>
     * <li><p><strong>doPlaybook</strong>: executes a playbook.</p>
     * </li>
     * <li><p><strong>changeEventStatus</strong>: changes the status of an event.</p>
     * </li>
     * <li><p><strong>changeThreatLevel</strong>: changes the threat level of an event.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>doPlaybook</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The type of the automated response. Valid values:</p>
     * <ul>
     * <li><p><strong>event</strong></p>
     * </li>
     * <li><p><strong>alert</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>event</p>
     */
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    /**
     * <p>The page number. The value must be 1 or greater.</p>
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
     * <p>The number of entries per page. The maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>system_aliyun_aegis_kill_quara_book</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The region of the Data Management center. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the response rule.</p>
     * <ul>
     * <li><p>preset: predefined</p>
     * </li>
     * <li><p>custom: custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ResponseRuleType")
    public String responseRuleType;

    /**
     * <p>The ID of the member to which the administrator switches.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: the view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: the view of all accounts that belong to the enterprise.</p>
     * </li>
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
     * <li><p><strong>0</strong>: disabled</p>
     * </li>
     * <li><p><strong>100</strong>: enabled</p>
     * </li>
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

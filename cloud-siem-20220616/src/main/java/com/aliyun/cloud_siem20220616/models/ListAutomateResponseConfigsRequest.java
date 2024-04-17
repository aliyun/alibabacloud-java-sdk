// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsRequest extends TeaModel {
    /**
     * <p>The type of the handling action. Valid values:</p>
     * <br>
     * <p>*   doPlaybook: runs a playbook.</p>
     * <p>*   changeEventStatus: changes the status of an event.</p>
     * <p>*   changeThreatLevel: changes the risk level of an event.</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The type of the automated response rule. Valid values:</p>
     * <br>
     * <p>*   event</p>
     * <p>*   alert</p>
     */
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    /**
     * <p>The page number. Pages start from page 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the automated response rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UUID of the playbook.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The name of the automated response rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   0: disabled</p>
     * <p>*   100: enabled</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The ID of the user who created the rule.</p>
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

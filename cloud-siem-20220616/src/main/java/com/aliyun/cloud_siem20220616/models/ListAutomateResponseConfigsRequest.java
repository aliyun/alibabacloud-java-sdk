// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsRequest extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("AutoResponseType")
    public String autoResponseType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Id")
    public Long id;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Status")
    public Integer status;

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

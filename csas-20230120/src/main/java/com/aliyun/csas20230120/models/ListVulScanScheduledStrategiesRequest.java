// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulScanScheduledStrategiesRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Filters by the matching mode of the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: Takes effect only for users in specified user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The number of entries per page in a paging query. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Filters by enabled status. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of scheduled vulnerability scan policies used for filtering. A maximum of 100 IDs can be specified. Duplicate IDs are not allowed.</p>
     */
    @NameInMap("StrategyIds")
    public java.util.List<String> strategyIds;

    /**
     * <p>The policy name. Fuzzy match is supported. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly vulnerability scanning for R&amp;D department</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The user group ID. Used to filter records whose effective scope includes the specified user group. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: lists user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-9d4f2a7b3c1e****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListVulScanScheduledStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVulScanScheduledStrategiesRequest self = new ListVulScanScheduledStrategiesRequest();
        return TeaModel.build(map, self);
    }

    public ListVulScanScheduledStrategiesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListVulScanScheduledStrategiesRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public ListVulScanScheduledStrategiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVulScanScheduledStrategiesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVulScanScheduledStrategiesRequest setStrategyIds(java.util.List<String> strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public java.util.List<String> getStrategyIds() {
        return this.strategyIds;
    }

    public ListVulScanScheduledStrategiesRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public ListVulScanScheduledStrategiesRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}

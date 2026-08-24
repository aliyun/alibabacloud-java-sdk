// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanScheduledStrategiesRequest extends TeaModel {
    /**
     * <p>The page number of the current page in paging. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The number of entries per page in paging. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The collection of scan performance modes. Duplicate values are not allowed.</p>
     */
    @NameInMap("PerformanceModes")
    public java.util.List<String> performanceModes;

    /**
     * <p>The collection of scan path scopes. Duplicate values are not allowed.</p>
     */
    @NameInMap("ScanModes")
    public java.util.List<String> scanModes;

    /**
     * <p>Filters policies by enabled status. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled.</li>
     * <li><strong>Disabled</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The collection of virus scheduled scan policy IDs. Duplicate values are not allowed.</p>
     */
    @NameInMap("StrategyIds")
    public java.util.List<String> strategyIds;

    /**
     * <p>The policy name. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Weekly_Scan_DevTeam</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The user group ID. This parameter is used to filter policies whose effective scope includes the specified user group. You can obtain the value from:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: lists user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-9d4f2a7b3c1e****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListVirusScanScheduledStrategiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanScheduledStrategiesRequest self = new ListVirusScanScheduledStrategiesRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanScheduledStrategiesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListVirusScanScheduledStrategiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVirusScanScheduledStrategiesRequest setPerformanceModes(java.util.List<String> performanceModes) {
        this.performanceModes = performanceModes;
        return this;
    }
    public java.util.List<String> getPerformanceModes() {
        return this.performanceModes;
    }

    public ListVirusScanScheduledStrategiesRequest setScanModes(java.util.List<String> scanModes) {
        this.scanModes = scanModes;
        return this;
    }
    public java.util.List<String> getScanModes() {
        return this.scanModes;
    }

    public ListVirusScanScheduledStrategiesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVirusScanScheduledStrategiesRequest setStrategyIds(java.util.List<String> strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public java.util.List<String> getStrategyIds() {
        return this.strategyIds;
    }

    public ListVirusScanScheduledStrategiesRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public ListVirusScanScheduledStrategiesRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}

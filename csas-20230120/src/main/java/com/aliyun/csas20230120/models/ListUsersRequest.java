// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 10,000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The user\&quot;s department. The value must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), commas (,), semicolons (;), hyphens (-), underscores (_), slashes (/), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>测试部</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The username for a fuzzy match. The value must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("FuzzyUsername")
    public String fuzzyUsername;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The username for an exact match. The value must be 1 to 128 characters long and can contain Chinese characters, letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生@alibaba.com</p>
     */
    @NameInMap("PreciseUsername")
    public String preciseUsername;

    /**
     * <p>An array of user IDs.</p>
     */
    @NameInMap("SaseUserIds")
    public java.util.List<String> saseUserIds;

    /**
     * <p>The status of the user. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: The user is enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: The user is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListUsersRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public ListUsersRequest setFuzzyUsername(String fuzzyUsername) {
        this.fuzzyUsername = fuzzyUsername;
        return this;
    }
    public String getFuzzyUsername() {
        return this.fuzzyUsername;
    }

    public ListUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersRequest setPreciseUsername(String preciseUsername) {
        this.preciseUsername = preciseUsername;
        return this;
    }
    public String getPreciseUsername() {
        return this.preciseUsername;
    }

    public ListUsersRequest setSaseUserIds(java.util.List<String> saseUserIds) {
        this.saseUserIds = saseUserIds;
        return this;
    }
    public java.util.List<String> getSaseUserIds() {
        return this.saseUserIds;
    }

    public ListUsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

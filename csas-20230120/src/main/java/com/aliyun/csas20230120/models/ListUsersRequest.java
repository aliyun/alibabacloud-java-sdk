// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Department")
    public String department;

    @NameInMap("FuzzyUsername")
    public String fuzzyUsername;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PreciseUsername")
    public String preciseUsername;

    @NameInMap("SaseUserIds")
    public java.util.List<String> saseUserIds;

    /**
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

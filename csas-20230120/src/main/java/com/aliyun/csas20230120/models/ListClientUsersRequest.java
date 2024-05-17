// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListClientUsersRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("Email")
    public String email;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    @NameInMap("MobileNumber")
    public String mobileNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Status")
    public String status;

    @NameInMap("Username")
    public String username;

    public static ListClientUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientUsersRequest self = new ListClientUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListClientUsersRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListClientUsersRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public ListClientUsersRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListClientUsersRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public ListClientUsersRequest setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public ListClientUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClientUsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListClientUsersRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}

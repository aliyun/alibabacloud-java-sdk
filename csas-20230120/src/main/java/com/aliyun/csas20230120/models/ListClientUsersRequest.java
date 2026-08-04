// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListClientUsersRequest extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10785</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    /**
     * <p>Email address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Custom identity source configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1071</p>
     */
    @NameInMap("IdpConfigId")
    public String idpConfigId;

    /**
     * <p>Mobile phone number without country code.</p>
     * 
     * <strong>example:</strong>
     * <p>18980976559</p>
     */
    @NameInMap("MobileNumber")
    public String mobileNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>User enable status. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Username.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserApplicationsRequest extends TeaModel {
    /**
     * <p>The address of the private access application. The address must be 1 to 128 characters in length. It supports IPv4 addresses, CIDR blocks, domain names, and wildcard domain names. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>sase.alibaba.com</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the private access application. The name must be 1 to 128 characters in length. It can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_application_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page for pagination. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    public static ListUserApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserApplicationsRequest self = new ListUserApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserApplicationsRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListUserApplicationsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserApplicationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserApplicationsRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

}

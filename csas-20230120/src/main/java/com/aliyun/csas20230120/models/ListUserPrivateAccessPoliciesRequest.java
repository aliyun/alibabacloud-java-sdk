// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserPrivateAccessPoliciesRequest extends TeaModel {
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
     * <p>The name of the private access policy. The name must be 1 to 128 characters in length, and can contain Chinese characters, uppercase letters, lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page set for the paginated query. Valid values: 1 to 100.</p>
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

    public static ListUserPrivateAccessPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPrivateAccessPoliciesRequest self = new ListUserPrivateAccessPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPrivateAccessPoliciesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserPrivateAccessPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserPrivateAccessPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserPrivateAccessPoliciesRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

}

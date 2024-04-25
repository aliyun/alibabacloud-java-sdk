// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListIdpDepartmentsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("IdpConfigId")
    public String idpConfigId;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListIdpDepartmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdpDepartmentsRequest self = new ListIdpDepartmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIdpDepartmentsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListIdpDepartmentsRequest setIdpConfigId(String idpConfigId) {
        this.idpConfigId = idpConfigId;
        return this;
    }
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public ListIdpDepartmentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetUnassociatedCustomerRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetUnassociatedCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnassociatedCustomerRequest self = new GetUnassociatedCustomerRequest();
        return TeaModel.build(map, self);
    }

    public GetUnassociatedCustomerRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetUnassociatedCustomerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

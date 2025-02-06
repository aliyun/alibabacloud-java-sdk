// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryLicensesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LicenseType")
    public Integer licenseType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryLicensesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLicensesRequest self = new QueryLicensesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLicensesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryLicensesRequest setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public Integer getLicenseType() {
        return this.licenseType;
    }

    public QueryLicensesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

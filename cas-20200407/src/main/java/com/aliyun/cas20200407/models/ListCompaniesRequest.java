// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCompaniesRequest extends TeaModel {
    /**
     * <p>The company ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51001</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The page number of the current page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The search keyword. For example, a keyword for the company name, province, country code, or city.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of contacts to display per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListCompaniesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompaniesRequest self = new ListCompaniesRequest();
        return TeaModel.build(map, self);
    }

    public ListCompaniesRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListCompaniesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCompaniesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCompaniesRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}

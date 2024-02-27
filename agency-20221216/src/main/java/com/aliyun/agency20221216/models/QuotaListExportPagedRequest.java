// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QuotaListExportPagedRequest extends TeaModel {
    /**
     * <p>Pagination, current page number, starting from 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Multilingual Parameters, the default language is English.</br></p>
     * <p>en: English</br></p>
     * <p>zh: Chinese</br></p>
     * <p>ja: Japanese </br></p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Pagination, record number on each page, maximum 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QuotaListExportPagedRequest build(java.util.Map<String, ?> map) throws Exception {
        QuotaListExportPagedRequest self = new QuotaListExportPagedRequest();
        return TeaModel.build(map, self);
    }

    public QuotaListExportPagedRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QuotaListExportPagedRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QuotaListExportPagedRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

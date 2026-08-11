// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDomainMetasRequest extends TeaModel {
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
     * <p>Specifies whether to include system default template lists.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultTemplate")
    public Boolean defaultTemplate;

    /**
     * <p>The list type (blacklist/whitelist).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>la_domain_white_list</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The list name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeDomains</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page in a paged query. Settings: 1 to 1000. Paging is used to return results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDomainMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainMetasRequest self = new ListDomainMetasRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainMetasRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDomainMetasRequest setDefaultTemplate(Boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
    }

    public ListDomainMetasRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public ListDomainMetasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDomainMetasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

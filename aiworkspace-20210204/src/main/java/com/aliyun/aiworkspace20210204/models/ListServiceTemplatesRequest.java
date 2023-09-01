// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListServiceTemplatesRequest extends TeaModel {
    @NameInMap("Label")
    public String label;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Query")
    public String query;

    @NameInMap("ServiceTemplateName")
    public String serviceTemplateName;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListServiceTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTemplatesRequest self = new ListServiceTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceTemplatesRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListServiceTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServiceTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServiceTemplatesRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListServiceTemplatesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListServiceTemplatesRequest setServiceTemplateName(String serviceTemplateName) {
        this.serviceTemplateName = serviceTemplateName;
        return this;
    }
    public String getServiceTemplateName() {
        return this.serviceTemplateName;
    }

    public ListServiceTemplatesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}

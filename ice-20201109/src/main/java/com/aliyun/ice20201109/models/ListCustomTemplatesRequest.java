// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomTemplatesRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Subtype")
    public String subtype;

    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCustomTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomTemplatesRequest self = new ListCustomTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCustomTemplatesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCustomTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomTemplatesRequest setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    public String getSubtype() {
        return this.subtype;
    }

    public ListCustomTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListCustomTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSystemTemplatesRequest extends TeaModel {
    // 模板名称
    @NameInMap("Name")
    public String name;

    // 分页数目
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 模板状态：Normal正常，Invisible不可见，ALL全部
    @NameInMap("Status")
    public String status;

    // 模板子类型ID
    @NameInMap("Subtype")
    public String subtype;

    // 模板ID
    @NameInMap("TemplateId")
    public String templateId;

    // 模板类型。逗号分隔
    @NameInMap("Type")
    public String type;

    public static ListSystemTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemTemplatesRequest self = new ListSystemTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSystemTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSystemTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSystemTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSystemTemplatesRequest setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }
    public String getSubtype() {
        return this.subtype;
    }

    public ListSystemTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListSystemTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

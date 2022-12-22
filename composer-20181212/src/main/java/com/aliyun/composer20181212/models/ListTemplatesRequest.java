// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    // The language that is used in the templates.
    @NameInMap("Lang")
    public String lang;

    // The keyword that is used to search for templates. This parameter is invalid if you specify a tag.
    @NameInMap("Name")
    public String name;

    // The page number of current page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of templates on each page. A page can contain a maximum of 100 templates. Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The tag that is used to search for templates.
    @NameInMap("Tag")
    public String tag;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}

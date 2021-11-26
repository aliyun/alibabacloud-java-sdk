// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDeprecatedTemplatesRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListDeprecatedTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeprecatedTemplatesRequest self = new ListDeprecatedTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeprecatedTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeprecatedTemplatesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDeprecatedTemplatesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDeprecatedTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>component-openstore-index-template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
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

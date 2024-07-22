// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListIndexTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("indexTemplate")
    public String indexTemplate;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListIndexTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexTemplatesRequest self = new ListIndexTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexTemplatesRequest setIndexTemplate(String indexTemplate) {
        this.indexTemplate = indexTemplate;
        return this;
    }
    public String getIndexTemplate() {
        return this.indexTemplate;
    }

    public ListIndexTemplatesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListIndexTemplatesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

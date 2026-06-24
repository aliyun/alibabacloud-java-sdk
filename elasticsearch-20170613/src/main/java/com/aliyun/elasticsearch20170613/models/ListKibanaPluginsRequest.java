// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPluginsRequest extends TeaModel {
    /**
     * <p>The page number of the instance list. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public String page;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListKibanaPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKibanaPluginsRequest self = new ListKibanaPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListKibanaPluginsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListKibanaPluginsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

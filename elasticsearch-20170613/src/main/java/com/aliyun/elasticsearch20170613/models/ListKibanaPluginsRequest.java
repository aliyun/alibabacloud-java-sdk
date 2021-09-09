// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPluginsRequest extends TeaModel {
    @NameInMap("page")
    public String page;

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

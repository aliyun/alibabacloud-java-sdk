// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashPluginsRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("source")
    public String source;

    public static ListLogstashPluginsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashPluginsRequest self = new ListLogstashPluginsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogstashPluginsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLogstashPluginsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListLogstashPluginsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListLogstashPluginsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashPluginsRequest extends TeaModel {
    /**
     * <p>The plugin name.</p>
     * 
     * <strong>example:</strong>
     * <p>logstash-filter-clone</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number of the plugin list. Default value: 1. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page in paging settings. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The plugin source. Valid values:</p>
     * <ul>
     * <li>USER: custom plugin</li>
     * <li>SYSTEM: system preset plugin.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
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

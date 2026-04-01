// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListUserPluginRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-plugin</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public String page;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("size")
    public String size;

    public static ListUserPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPluginRequest self = new ListUserPluginRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPluginRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserPluginRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListUserPluginRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}

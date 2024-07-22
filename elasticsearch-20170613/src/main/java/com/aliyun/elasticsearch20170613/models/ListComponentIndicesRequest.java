// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListComponentIndicesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
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

    public static ListComponentIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentIndicesRequest self = new ListComponentIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentIndicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListComponentIndicesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListComponentIndicesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

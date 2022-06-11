// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListComponentIndicesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("name")
    public String name;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListComponentIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentIndicesRequest self = new ListComponentIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentIndicesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
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

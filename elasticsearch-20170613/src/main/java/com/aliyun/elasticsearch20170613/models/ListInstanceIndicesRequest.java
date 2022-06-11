// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesRequest extends TeaModel {
    @NameInMap("all")
    public Boolean all;

    @NameInMap("body")
    public String body;

    @NameInMap("isManaged")
    public Boolean isManaged;

    @NameInMap("isOpenstore")
    public Boolean isOpenstore;

    @NameInMap("name")
    public String name;

    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    public static ListInstanceIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIndicesRequest self = new ListInstanceIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceIndicesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListInstanceIndicesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListInstanceIndicesRequest setIsManaged(Boolean isManaged) {
        this.isManaged = isManaged;
        return this;
    }
    public Boolean getIsManaged() {
        return this.isManaged;
    }

    public ListInstanceIndicesRequest setIsOpenstore(Boolean isOpenstore) {
        this.isOpenstore = isOpenstore;
        return this;
    }
    public Boolean getIsOpenstore() {
        return this.isOpenstore;
    }

    public ListInstanceIndicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInstanceIndicesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListInstanceIndicesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

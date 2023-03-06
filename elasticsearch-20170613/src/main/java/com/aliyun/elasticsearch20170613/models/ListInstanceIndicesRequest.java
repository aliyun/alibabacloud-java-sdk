// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesRequest extends TeaModel {
    /**
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>false</p>
     */
    @NameInMap("isManaged")
    public Boolean isManaged;

    /**
     * <p>false</p>
     */
    @NameInMap("isOpenstore")
    public Boolean isOpenstore;

    /**
     * <p>log-0001</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>15</p>
     */
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

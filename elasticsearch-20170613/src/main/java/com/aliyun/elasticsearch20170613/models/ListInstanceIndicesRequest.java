// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesRequest extends TeaModel {
    /**
     * <p>Specifies whether to retrieve all indices. Valid values:</p>
     * <ul>
     * <li><p>true: returns a list of indices including system indices.</p>
     * </li>
     * <li><p>false: returns a list of indices excluding system indices. Default value: false.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>Specifies whether to view only managed indices. Valid values:</p>
     * <ul>
     * <li><p>true: views only managed indices.</p>
     * </li>
     * <li><p>false: views all indices. Default value: false.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isManaged")
    public Boolean isManaged;

    /**
     * <p>Specifies whether to view only OpenStore cold-phase indices. Valid values:</p>
     * <ul>
     * <li><p>true: views only OpenStore cold-phase indices.</p>
     * </li>
     * <li><p>false: views all indices. Default value: false.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isOpenstore")
    public Boolean isOpenstore;

    /**
     * <p>The index name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>log-0001</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The paging Settings for the number of entries per page in a paged query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
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

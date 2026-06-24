// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesRequest extends TeaModel {
    /**
     * <p>Specifies whether to retrieve all indexes. Valid values:</p>
     * <ul>
     * <li><p>true: Returns the index list that includes system indexes.</p>
     * </li>
     * <li><p>false (default): Returns the index list that excludes system indexes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("all")
    public Boolean all;

    /**
     * <p>Specifies whether to display only managed indexes. Valid values:</p>
     * <ul>
     * <li><p>true: Displays only managed indexes.</p>
     * </li>
     * <li><p>false (default): Displays all indexes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isManaged")
    public Boolean isManaged;

    /**
     * <p>Specifies whether to display only OpenStore cold-phase indexes. Valid values:</p>
     * <ul>
     * <li><p>true: Displays only OpenStore cold-phase indexes.</p>
     * </li>
     * <li><p>false (default): Displays all indexes.</p>
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
     * <p>The page number of the instance list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page for paging. Maximum value: 100. Default value: 20.</p>
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

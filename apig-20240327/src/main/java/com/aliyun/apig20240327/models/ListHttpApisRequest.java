// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-</p>
     */
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("publishedOnly")
    public Boolean publishedOnly;

    public static ListHttpApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApisRequest self = new ListHttpApisRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpApisRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListHttpApisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHttpApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpApisRequest setPublishedOnly(Boolean publishedOnly) {
        this.publishedOnly = publishedOnly;
        return this;
    }
    public Boolean getPublishedOnly() {
        return this.publishedOnly;
    }

}

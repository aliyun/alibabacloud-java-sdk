// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListToolsetsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("labelSelector")
    public java.util.List<String> labelSelector;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListToolsetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListToolsetsRequest self = new ListToolsetsRequest();
        return TeaModel.build(map, self);
    }

    public ListToolsetsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListToolsetsRequest setLabelSelector(java.util.List<String> labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public java.util.List<String> getLabelSelector() {
        return this.labelSelector;
    }

    public ListToolsetsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListToolsetsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

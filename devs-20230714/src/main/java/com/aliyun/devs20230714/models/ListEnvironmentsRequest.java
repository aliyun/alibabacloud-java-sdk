// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("labelSelector")
    public java.util.List<String> labelSelector;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEnvironmentsRequest setLabelSelector(java.util.List<String> labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public java.util.List<String> getLabelSelector() {
        return this.labelSelector;
    }

    public ListEnvironmentsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEnvironmentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

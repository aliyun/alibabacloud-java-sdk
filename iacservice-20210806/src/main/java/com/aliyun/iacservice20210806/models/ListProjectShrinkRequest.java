// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectShrinkRequest extends TeaModel {
    /**
     * <p>The search keyword. Name-based search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test-case2</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    public static ListProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectShrinkRequest self = new ListProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListProjectShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProjectShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}

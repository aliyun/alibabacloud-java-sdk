// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListGroupShrinkRequest extends TeaModel {
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
     * <p>The number of results to return per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-14e80de4866bf7ffed0c4072ed9b37</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("tag")
    public String tagShrink;

    public static ListGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupShrinkRequest self = new ListGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListGroupShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListGroupShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListGroupShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}

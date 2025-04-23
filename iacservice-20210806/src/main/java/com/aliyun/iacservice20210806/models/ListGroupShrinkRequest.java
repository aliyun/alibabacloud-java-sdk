// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListGroupShrinkRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>p-14e80de4866bf7ffed0c4072ed9b37</p>
     */
    @NameInMap("projectId")
    public String projectId;

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

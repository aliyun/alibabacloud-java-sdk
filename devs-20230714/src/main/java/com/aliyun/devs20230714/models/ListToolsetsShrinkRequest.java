// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListToolsetsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("labelSelector")
    public String labelSelectorShrink;

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

    public static ListToolsetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListToolsetsShrinkRequest self = new ListToolsetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListToolsetsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListToolsetsShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

    public ListToolsetsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListToolsetsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

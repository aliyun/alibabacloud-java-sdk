// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListEnvironmentsShrinkRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("labelSelector")
    public String labelSelectorShrink;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    public static ListEnvironmentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsShrinkRequest self = new ListEnvironmentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListEnvironmentsShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

    public ListEnvironmentsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListEnvironmentsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

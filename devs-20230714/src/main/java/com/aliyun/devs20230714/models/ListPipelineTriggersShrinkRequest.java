// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTriggersShrinkRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("labelSelector")
    public String labelSelectorShrink;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    public static ListPipelineTriggersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTriggersShrinkRequest self = new ListPipelineTriggersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineTriggersShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPipelineTriggersShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

    public ListPipelineTriggersShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelineTriggersShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

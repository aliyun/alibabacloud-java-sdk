// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListServiceDeploymentsShrinkRequest extends TeaModel {
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

    public static ListServiceDeploymentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceDeploymentsShrinkRequest self = new ListServiceDeploymentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceDeploymentsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServiceDeploymentsShrinkRequest setLabelSelectorShrink(String labelSelectorShrink) {
        this.labelSelectorShrink = labelSelectorShrink;
        return this;
    }
    public String getLabelSelectorShrink() {
        return this.labelSelectorShrink;
    }

    public ListServiceDeploymentsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceDeploymentsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

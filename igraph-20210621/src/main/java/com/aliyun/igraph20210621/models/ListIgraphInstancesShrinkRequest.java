// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListIgraphInstancesShrinkRequest extends TeaModel {
    @NameInMap("pageContinue")
    public String pageContinue;

    @NameInMap("pageLimit")
    public String pageLimit;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public String tagsShrink;

    public static ListIgraphInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIgraphInstancesShrinkRequest self = new ListIgraphInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListIgraphInstancesShrinkRequest setPageContinue(String pageContinue) {
        this.pageContinue = pageContinue;
        return this;
    }
    public String getPageContinue() {
        return this.pageContinue;
    }

    public ListIgraphInstancesShrinkRequest setPageLimit(String pageLimit) {
        this.pageLimit = pageLimit;
        return this;
    }
    public String getPageLimit() {
        return this.pageLimit;
    }

    public ListIgraphInstancesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIgraphInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}

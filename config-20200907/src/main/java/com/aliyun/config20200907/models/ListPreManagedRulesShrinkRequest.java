// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListPreManagedRulesShrinkRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the resource.</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypesShrink;

    public static ListPreManagedRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPreManagedRulesShrinkRequest self = new ListPreManagedRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPreManagedRulesShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPreManagedRulesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPreManagedRulesShrinkRequest setResourceTypesShrink(String resourceTypesShrink) {
        this.resourceTypesShrink = resourceTypesShrink;
        return this;
    }
    public String getResourceTypesShrink() {
        return this.resourceTypesShrink;
    }

}

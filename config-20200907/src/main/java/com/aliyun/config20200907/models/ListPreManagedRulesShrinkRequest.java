// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListPreManagedRulesShrinkRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>A list of resource types.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateResourceCategoryRequest extends TeaModel {
    /**
     * <p>Resource category ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-123****7890</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    /**
     * <p>Resource category name.</p>
     * 
     * <strong>example:</strong>
     * <p>My***ResourceCategory</p>
     */
    @NameInMap("ResourceCategoryName")
    public String resourceCategoryName;

    /**
     * <p>Resource matcher.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *    &quot;type&quot;: &quot;BOOL&quot;,
     *    &quot;operator&quot;: &quot;AND&quot;,
     *    &quot;values&quot;: [
     *      {
     *        &quot;type&quot;: &quot;TAG&quot;,
     *        &quot;operator&quot;: &quot;EQUAL&quot;,
     *        &quot;key&quot;: &quot;key0&quot;,
     *        &quot;values&quot;: [
     *          &quot;value0&quot;
     *        ]
     *      },
     *      {
     *        &quot;type&quot;: &quot;TAG&quot;,
     *        &quot;operator&quot;: &quot;KEY_EXIST&quot;,
     *        &quot;key&quot;: &quot;key1&quot;
     *      },
     *      {
     *        &quot;type&quot;: &quot;TAG&quot;,
     *        &quot;operator&quot;: &quot;KEY_EXIST_NOT_EQUAL&quot;,
     *        &quot;key&quot;: &quot;key2&quot;,
     *        &quot;values&quot;: [
     *          &quot;value2-wrong&quot;
     *        ]
     *      }
     *    ]
     *  }</p>
     */
    @NameInMap("ResourceMatcher")
    public String resourceMatcher;

    public static UpdateResourceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceCategoryRequest self = new UpdateResourceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceCategoryRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public UpdateResourceCategoryRequest setResourceCategoryName(String resourceCategoryName) {
        this.resourceCategoryName = resourceCategoryName;
        return this;
    }
    public String getResourceCategoryName() {
        return this.resourceCategoryName;
    }

    public UpdateResourceCategoryRequest setResourceMatcher(String resourceMatcher) {
        this.resourceMatcher = resourceMatcher;
        return this;
    }
    public String getResourceMatcher() {
        return this.resourceMatcher;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateResourceCategoryRequest extends TeaModel {
    /**
     * <p>Resource category name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My***ResourceCategory</p>
     */
    @NameInMap("ResourceCategoryName")
    public String resourceCategoryName;

    /**
     * <p>Resource matcher.</p>
     * <p>This parameter is required.</p>
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

    /**
     * <p>Resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static CreateResourceCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceCategoryRequest self = new CreateResourceCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceCategoryRequest setResourceCategoryName(String resourceCategoryName) {
        this.resourceCategoryName = resourceCategoryName;
        return this;
    }
    public String getResourceCategoryName() {
        return this.resourceCategoryName;
    }

    public CreateResourceCategoryRequest setResourceMatcher(String resourceMatcher) {
        this.resourceMatcher = resourceMatcher;
        return this;
    }
    public String getResourceMatcher() {
        return this.resourceMatcher;
    }

    public CreateResourceCategoryRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

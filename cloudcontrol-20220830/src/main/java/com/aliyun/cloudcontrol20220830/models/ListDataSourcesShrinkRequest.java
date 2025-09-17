// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListDataSourcesShrinkRequest extends TeaModel {
    /**
     * <p>The name of the property. RegionId is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RegionId</p>
     */
    @NameInMap("attributeName")
    public String attributeName;

    /**
     * <p>The filter conditions. JSON format:{&quot;key1&quot;:&quot;value1&quot;}.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    public static ListDataSourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesShrinkRequest self = new ListDataSourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesShrinkRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public ListDataSourcesShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

}

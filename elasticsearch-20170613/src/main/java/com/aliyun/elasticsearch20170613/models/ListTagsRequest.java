// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListTagsRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Default value: 20. Minimum value: 1. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The resource type. Fixed value: INSTANCE.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static ListTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsRequest self = new ListTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}

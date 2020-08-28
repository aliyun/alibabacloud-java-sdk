// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListTagResourcesQuery extends TeaModel {
    @NameInMap("next_token")
    public String nextToken;

    @NameInMap("resource_ids")
    public String resourceIds;

    @NameInMap("tags")
    public String tags;

    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    public static ListTagResourcesQuery build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesQuery self = new ListTagResourcesQuery();
        return TeaModel.build(map, self);
    }

}

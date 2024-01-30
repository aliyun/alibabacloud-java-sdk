// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class ListTagsByResourceRequest extends TeaModel {
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    public static ListTagsByResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsByResourceRequest self = new ListTagsByResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsByResourceRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

}

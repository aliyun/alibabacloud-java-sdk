// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    public static ListTagsForPrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessApplicationRequest self = new ListTagsForPrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessApplicationRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

}

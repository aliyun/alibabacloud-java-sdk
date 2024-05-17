// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static ListApplicationsForPrivateAccessTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessTagRequest self = new ListApplicationsForPrivateAccessTagRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessTagRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}

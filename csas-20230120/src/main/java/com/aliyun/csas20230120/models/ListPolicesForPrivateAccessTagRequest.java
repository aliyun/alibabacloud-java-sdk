// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static ListPolicesForPrivateAccessTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessTagRequest self = new ListPolicesForPrivateAccessTagRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessTagRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}

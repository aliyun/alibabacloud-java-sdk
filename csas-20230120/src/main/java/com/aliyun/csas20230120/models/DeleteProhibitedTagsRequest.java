// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedTagsRequest extends TeaModel {
    /**
     * <p>The IDs of the custom prohibited software labels to delete. Duplicate IDs are not allowed. You can specify up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static DeleteProhibitedTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedTagsRequest self = new DeleteProhibitedTagsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedTagsRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}

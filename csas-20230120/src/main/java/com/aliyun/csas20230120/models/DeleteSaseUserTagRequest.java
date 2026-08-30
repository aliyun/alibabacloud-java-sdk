// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteSaseUserTagRequest extends TeaModel {
    /**
     * <p>The collection of user tag IDs.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static DeleteSaseUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSaseUserTagRequest self = new DeleteSaseUserTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSaseUserTagRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}

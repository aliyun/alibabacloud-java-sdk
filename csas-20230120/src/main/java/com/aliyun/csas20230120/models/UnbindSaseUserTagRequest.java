// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UnbindSaseUserTagRequest extends TeaModel {
    /**
     * <p>The IDs of the users.</p>
     */
    @NameInMap("SaseUserIds")
    public java.util.List<String> saseUserIds;

    /**
     * <p>The IDs of the user tags.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static UnbindSaseUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSaseUserTagRequest self = new UnbindSaseUserTagRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSaseUserTagRequest setSaseUserIds(java.util.List<String> saseUserIds) {
        this.saseUserIds = saseUserIds;
        return this;
    }
    public java.util.List<String> getSaseUserIds() {
        return this.saseUserIds;
    }

    public UnbindSaseUserTagRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}

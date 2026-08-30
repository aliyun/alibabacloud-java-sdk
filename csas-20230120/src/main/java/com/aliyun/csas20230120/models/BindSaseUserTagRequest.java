// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class BindSaseUserTagRequest extends TeaModel {
    /**
     * <p>The collection of user IDs.</p>
     */
    @NameInMap("SaseUserIds")
    public java.util.List<String> saseUserIds;

    /**
     * <p>The collection of user label IDs.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static BindSaseUserTagRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSaseUserTagRequest self = new BindSaseUserTagRequest();
        return TeaModel.build(map, self);
    }

    public BindSaseUserTagRequest setSaseUserIds(java.util.List<String> saseUserIds) {
        this.saseUserIds = saseUserIds;
        return this;
    }
    public java.util.List<String> getSaseUserIds() {
        return this.saseUserIds;
    }

    public BindSaseUserTagRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchDisableMemberApiKeysRequest extends TeaModel {
    /**
     * <p>The list of member user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    public static ModelRouterBatchDisableMemberApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchDisableMemberApiKeysRequest self = new ModelRouterBatchDisableMemberApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchDisableMemberApiKeysRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchResetMemberAuthorizationRequest extends TeaModel {
    /**
     * <p>The list of member user IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    public static ModelRouterBatchResetMemberAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchResetMemberAuthorizationRequest self = new ModelRouterBatchResetMemberAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchResetMemberAuthorizationRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}

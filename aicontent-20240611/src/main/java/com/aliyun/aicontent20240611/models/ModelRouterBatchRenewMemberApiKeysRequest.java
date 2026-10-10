// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchRenewMemberApiKeysRequest extends TeaModel {
    /**
     * <p>The new expiration time in RFC 3339 format. The time must be later than the current time. If this parameter is not provided or is set to null, the API keys remain permanently valid. This parameter only modifies the validity period and does not change the enabled or disabled status.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00+08:00</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    /**
     * <p>The list of member user IDs. This operation renews all undeleted API keys of these members in the specified department.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    public static ModelRouterBatchRenewMemberApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchRenewMemberApiKeysRequest self = new ModelRouterBatchRenewMemberApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchRenewMemberApiKeysRequest setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public ModelRouterBatchRenewMemberApiKeysRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}

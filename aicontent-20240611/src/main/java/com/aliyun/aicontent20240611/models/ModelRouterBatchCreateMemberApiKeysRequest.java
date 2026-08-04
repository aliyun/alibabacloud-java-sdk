// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchCreateMemberApiKeysRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2027-01-01T00:00:00Z</p>
     */
    @NameInMap("expireAt")
    public String expireAt;

    /**
     * <strong>example:</strong>
     * <p>TestKey</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("userIds")
    public java.util.List<Long> userIds;

    public static ModelRouterBatchCreateMemberApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchCreateMemberApiKeysRequest self = new ModelRouterBatchCreateMemberApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchCreateMemberApiKeysRequest setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public ModelRouterBatchCreateMemberApiKeysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelRouterBatchCreateMemberApiKeysRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ChangeVisibilityRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Invisible")
    public Boolean invisible;

    @NameInMap("UserId")
    public String userId;

    public static ChangeVisibilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityRequest self = new ChangeVisibilityRequest();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeVisibilityRequest setInvisible(Boolean invisible) {
        this.invisible = invisible;
        return this;
    }
    public Boolean getInvisible() {
        return this.invisible;
    }

    public ChangeVisibilityRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

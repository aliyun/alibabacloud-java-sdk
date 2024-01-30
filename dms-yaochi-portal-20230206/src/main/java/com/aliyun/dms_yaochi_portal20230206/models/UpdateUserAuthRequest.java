// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class UpdateUserAuthRequest extends TeaModel {
    @NameInMap("GrantState")
    public Long grantState;

    public static UpdateUserAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthRequest self = new UpdateUserAuthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthRequest setGrantState(Long grantState) {
        this.grantState = grantState;
        return this;
    }
    public Long getGrantState() {
        return this.grantState;
    }

}

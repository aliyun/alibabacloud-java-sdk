// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ResetServerSecretRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static ResetServerSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetServerSecretRequest self = new ResetServerSecretRequest();
        return TeaModel.build(map, self);
    }

    public ResetServerSecretRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    @NameInMap("ExpireHours")
    public Long expireHours;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyRequest setExpireHours(Long expireHours) {
        this.expireHours = expireHours;
        return this;
    }
    public Long getExpireHours() {
        return this.expireHours;
    }

}

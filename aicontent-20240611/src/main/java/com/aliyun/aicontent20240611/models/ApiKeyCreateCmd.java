// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ApiKeyCreateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    public static ApiKeyCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        ApiKeyCreateCmd self = new ApiKeyCreateCmd();
        return TeaModel.build(map, self);
    }

    public ApiKeyCreateCmd setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

}

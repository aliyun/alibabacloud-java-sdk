// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("regionId")
    public String regionId;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public UpdateResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

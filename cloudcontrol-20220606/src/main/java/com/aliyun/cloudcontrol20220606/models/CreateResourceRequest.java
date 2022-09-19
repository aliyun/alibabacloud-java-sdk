// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("regionId")
    public String regionId;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

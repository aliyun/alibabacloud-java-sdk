// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *      &quot;AccountPassword&quot;: &quot;4321****&quot;,
     *      &quot;Description&quot;: &quot;cctest&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <strong>example:</strong>
     * <p>1e810dfe1468721d0664a49b9d9f74f4</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GrayPublishRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ea8d33aa4371c3499d0***</p>
     */
    @NameInMap("X-Request-ChangeId")
    public String xRequestChangeId;

    public static GrayPublishRequest build(java.util.Map<String, ?> map) throws Exception {
        GrayPublishRequest self = new GrayPublishRequest();
        return TeaModel.build(map, self);
    }

    public GrayPublishRequest setXRequestChangeId(String xRequestChangeId) {
        this.xRequestChangeId = xRequestChangeId;
        return this;
    }
    public String getXRequestChangeId() {
        return this.xRequestChangeId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyElasticBandWidthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyElasticBandWidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandWidthResponse self = new ModifyElasticBandWidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandWidthResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

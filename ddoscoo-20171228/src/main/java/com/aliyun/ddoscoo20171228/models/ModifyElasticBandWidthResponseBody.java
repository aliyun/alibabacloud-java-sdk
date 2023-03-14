// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyElasticBandWidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticBandWidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandWidthResponseBody self = new ModifyElasticBandWidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandWidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

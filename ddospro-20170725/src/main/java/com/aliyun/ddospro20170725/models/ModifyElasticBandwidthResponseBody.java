// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyElasticBandwidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBandwidthResponseBody self = new ModifyElasticBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

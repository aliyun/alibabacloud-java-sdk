// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ConfigSchedruleOnDemandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ConfigSchedruleOnDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSchedruleOnDemandResponse self = new ConfigSchedruleOnDemandResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSchedruleOnDemandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

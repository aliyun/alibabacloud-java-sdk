// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ConfigSchedruleOnDemandResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigSchedruleOnDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSchedruleOnDemandResponseBody self = new ConfigSchedruleOnDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSchedruleOnDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

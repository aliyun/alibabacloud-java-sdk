// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ConfigSchedruleOnDemandResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD06F539-2FBE-450D-9391-7EFF787128F5</p>
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

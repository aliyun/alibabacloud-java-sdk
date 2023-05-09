// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CreateSchedruleOnDemandResponseBody extends TeaModel {
    /**
     * <p>Creates a scheduling rule for an on-demand instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSchedruleOnDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedruleOnDemandResponseBody self = new CreateSchedruleOnDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchedruleOnDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

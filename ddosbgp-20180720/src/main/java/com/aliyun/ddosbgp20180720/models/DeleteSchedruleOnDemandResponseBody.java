// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteSchedruleOnDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSchedruleOnDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedruleOnDemandResponseBody self = new DeleteSchedruleOnDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSchedruleOnDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

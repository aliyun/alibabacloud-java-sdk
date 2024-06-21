// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CreateSchedruleOnDemandResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BD06F539-2FBE-450D-9391-7EFF787128F5</p>
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

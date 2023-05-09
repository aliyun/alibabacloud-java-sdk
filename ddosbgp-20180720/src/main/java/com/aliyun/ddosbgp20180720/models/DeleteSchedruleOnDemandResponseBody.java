// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteSchedruleOnDemandResponseBody extends TeaModel {
    /**
     * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
     * <br>
     * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnUserRealTimeDeliveryFieldResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3EACD23C-F49F-4BF7-B9AD-C2CD3BA888C4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnUserRealTimeDeliveryFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnUserRealTimeDeliveryFieldResponseBody self = new UpdateDcdnUserRealTimeDeliveryFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnUserRealTimeDeliveryFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

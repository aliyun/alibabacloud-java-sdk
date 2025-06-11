// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSCIMSynchronizationStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3BF1FC78-5D20-54CC-BAEB-8CC33AE21D01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetSCIMSynchronizationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSCIMSynchronizationStatusResponseBody self = new SetSCIMSynchronizationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSCIMSynchronizationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

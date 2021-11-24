// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorResponseBody extends TeaModel {
    @NameInMap("DdosId")
    public String ddosId;

    @NameInMap("GaId")
    public String gaId;

    @NameInMap("RequestId")
    public String requestId;

    public static AttachDdosToAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDdosToAcceleratorResponseBody self = new AttachDdosToAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDdosToAcceleratorResponseBody setDdosId(String ddosId) {
        this.ddosId = ddosId;
        return this;
    }
    public String getDdosId() {
        return this.ddosId;
    }

    public AttachDdosToAcceleratorResponseBody setGaId(String gaId) {
        this.gaId = gaId;
        return this;
    }
    public String getGaId() {
        return this.gaId;
    }

    public AttachDdosToAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

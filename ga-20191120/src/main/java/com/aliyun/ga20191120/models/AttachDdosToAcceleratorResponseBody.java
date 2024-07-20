// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AttachDdosToAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zz11vq7j****</p>
     */
    @NameInMap("DdosId")
    public String ddosId;

    /**
     * <p>The ID of the GA instance that is associated with the Anti-DDoS Pro/Premium instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("GaId")
    public String gaId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DisassociateResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <strong>example:</strong>
     * <p>c66d65f411b9143bab253bfef61c03c48</p>
     */
    @NameInMap("AssociatedResourceId")
    public String associatedResourceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourcesResponseBody self = new DisassociateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateResourcesResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DisassociateResourcesResponseBody setAssociatedResourceId(String associatedResourceId) {
        this.associatedResourceId = associatedResourceId;
        return this;
    }
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    public DisassociateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

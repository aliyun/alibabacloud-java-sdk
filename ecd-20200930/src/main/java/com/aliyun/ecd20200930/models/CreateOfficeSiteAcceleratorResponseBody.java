// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeSiteAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1qxuk10jceqw3zb***p</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOfficeSiteAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeSiteAcceleratorResponseBody self = new CreateOfficeSiteAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOfficeSiteAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateOfficeSiteAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAcceleratorCrossBorderModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAcceleratorCrossBorderModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAcceleratorCrossBorderModeResponseBody self = new UpdateAcceleratorCrossBorderModeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAcceleratorCrossBorderModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

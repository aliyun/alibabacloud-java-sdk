// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddImageMosaicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FF*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddImageMosaicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageMosaicResponseBody self = new AddImageMosaicResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageMosaicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

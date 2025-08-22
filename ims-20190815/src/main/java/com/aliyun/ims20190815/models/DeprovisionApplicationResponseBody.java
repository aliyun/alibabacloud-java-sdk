// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85836703-8D4F-485F-9726-4D1C730F957E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeprovisionApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionApplicationResponseBody self = new DeprovisionApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeprovisionApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

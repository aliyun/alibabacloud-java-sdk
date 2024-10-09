// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class OpenBdrcServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86DEBAC9-AB6A-59AB-9E5C-A540E579ECC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenBdrcServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenBdrcServiceResponseBody self = new OpenBdrcServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenBdrcServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

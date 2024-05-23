// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSDGResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the generated SDG.</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static CreateSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSDGResponseBody self = new CreateSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSDGResponseBody setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}

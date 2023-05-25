// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetTrafficControlApisResponseBody extends TeaModel {
    /**
     * <p>Binds a throttling policy to APIs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetTrafficControlApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetTrafficControlApisResponseBody self = new SetTrafficControlApisResponseBody();
        return TeaModel.build(map, self);
    }

    public SetTrafficControlApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

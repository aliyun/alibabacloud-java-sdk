// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AddTrafficSpecialControlResponseBody extends TeaModel {
    /**
     * <p>Adds a custom special policy to a specified throttling policy.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddTrafficSpecialControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTrafficSpecialControlResponseBody self = new AddTrafficSpecialControlResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTrafficSpecialControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

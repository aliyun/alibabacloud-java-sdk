// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class EnableInstanceAccessControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableInstanceAccessControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceAccessControlResponseBody self = new EnableInstanceAccessControlResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInstanceAccessControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

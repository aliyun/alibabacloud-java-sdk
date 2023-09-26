// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateIpControlResponseBody extends TeaModel {
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpControlResponseBody self = new CreateIpControlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpControlResponseBody setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public CreateIpControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

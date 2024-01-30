// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteEntityResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityResponseBody self = new DeleteEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEntityResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public DeleteEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class RestoreGameArchiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static RestoreGameArchiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreGameArchiveResponseBody self = new RestoreGameArchiveResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreGameArchiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreGameArchiveResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

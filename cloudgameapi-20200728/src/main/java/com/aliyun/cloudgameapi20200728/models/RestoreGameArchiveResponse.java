// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class RestoreGameArchiveResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    public static RestoreGameArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreGameArchiveResponse self = new RestoreGameArchiveResponse();
        return TeaModel.build(map, self);
    }

    public RestoreGameArchiveResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreGameArchiveResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

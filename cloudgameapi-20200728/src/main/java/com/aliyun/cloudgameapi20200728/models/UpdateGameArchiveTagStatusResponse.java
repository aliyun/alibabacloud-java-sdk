// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UpdateGameArchiveTagStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    public static UpdateGameArchiveTagStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGameArchiveTagStatusResponse self = new UpdateGameArchiveTagStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGameArchiveTagStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGameArchiveTagStatusResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

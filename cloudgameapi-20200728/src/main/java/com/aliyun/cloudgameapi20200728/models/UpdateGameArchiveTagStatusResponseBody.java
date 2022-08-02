// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class UpdateGameArchiveTagStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static UpdateGameArchiveTagStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGameArchiveTagStatusResponseBody self = new UpdateGameArchiveTagStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGameArchiveTagStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGameArchiveTagStatusResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

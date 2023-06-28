// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class CheckGrantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static CheckGrantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckGrantResponseBody self = new CheckGrantResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckGrantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckGrantResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

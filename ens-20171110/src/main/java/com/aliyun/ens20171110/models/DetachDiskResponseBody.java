// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachDiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskResponseBody self = new DetachDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachDiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DetachDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

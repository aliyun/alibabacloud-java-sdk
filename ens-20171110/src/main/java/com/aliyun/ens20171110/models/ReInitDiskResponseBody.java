// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReInitDiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("RequestId")
    public String requestId;

    public static ReInitDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskResponseBody self = new ReInitDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ReInitDiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ReInitDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

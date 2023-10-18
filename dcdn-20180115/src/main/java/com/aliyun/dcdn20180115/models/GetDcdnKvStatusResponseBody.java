// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvStatusResponseBody extends TeaModel {
    @NameInMap("Complete")
    public Boolean complete;

    @NameInMap("Expire")
    public String expire;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDcdnKvStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvStatusResponseBody self = new GetDcdnKvStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvStatusResponseBody setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public GetDcdnKvStatusResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetDcdnKvStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

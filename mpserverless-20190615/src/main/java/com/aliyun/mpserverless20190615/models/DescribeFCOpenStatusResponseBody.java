// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFCOpenStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsAuthorized")
    public Boolean isAuthorized;

    public static DescribeFCOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCOpenStatusResponseBody self = new DescribeFCOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFCOpenStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeFCOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFCOpenStatusResponseBody setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

}

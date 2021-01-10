// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsOpenStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsAuthorized")
    public Boolean isAuthorized;

    public static DescribeSmsOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsOpenStatusResponseBody self = new DescribeSmsOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmsOpenStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSmsOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmsOpenStatusResponseBody setIsAuthorized(Boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

}

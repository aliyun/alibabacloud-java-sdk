// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class GetSlsOpenStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsOpenStatus")
    public Boolean slsOpenStatus;

    public static GetSlsOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSlsOpenStatusResponseBody self = new GetSlsOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSlsOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSlsOpenStatusResponseBody setSlsOpenStatus(Boolean slsOpenStatus) {
        this.slsOpenStatus = slsOpenStatus;
        return this;
    }
    public Boolean getSlsOpenStatus() {
        return this.slsOpenStatus;
    }

}

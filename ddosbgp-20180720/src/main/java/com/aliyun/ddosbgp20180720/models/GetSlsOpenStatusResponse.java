// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class GetSlsOpenStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SlsOpenStatus")
    @Validation(required = true)
    public Boolean slsOpenStatus;

    public static GetSlsOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsOpenStatusResponse self = new GetSlsOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsOpenStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSlsOpenStatusResponse setSlsOpenStatus(Boolean slsOpenStatus) {
        this.slsOpenStatus = slsOpenStatus;
        return this;
    }
    public Boolean getSlsOpenStatus() {
        return this.slsOpenStatus;
    }

}

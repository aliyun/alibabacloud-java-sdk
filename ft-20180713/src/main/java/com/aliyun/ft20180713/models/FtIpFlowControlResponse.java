// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtIpFlowControlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static FtIpFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        FtIpFlowControlResponse self = new FtIpFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public FtIpFlowControlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtIpFlowControlResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

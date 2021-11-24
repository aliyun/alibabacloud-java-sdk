// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetResponseBody extends TeaModel {
    // 加速地域接入点Id
    @NameInMap("IpSetId")
    public String ipSetId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBasicIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicIpSetResponseBody self = new CreateBasicIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicIpSetResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public CreateBasicIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

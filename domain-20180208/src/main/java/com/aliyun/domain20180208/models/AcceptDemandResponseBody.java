// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class AcceptDemandResponseBody extends TeaModel {
    @NameInMap("BindUrl")
    public String bindUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static AcceptDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptDemandResponseBody self = new AcceptDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptDemandResponseBody setBindUrl(String bindUrl) {
        this.bindUrl = bindUrl;
        return this;
    }
    public String getBindUrl() {
        return this.bindUrl;
    }

    public AcceptDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

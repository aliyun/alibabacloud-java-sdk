// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnIpaDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnIpaDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnIpaDomainResponseBody self = new UpdateDcdnIpaDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnIpaDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

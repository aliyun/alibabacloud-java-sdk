// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetOfficeSiteInternetStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetOfficeSiteInternetStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteInternetStatusResponseBody self = new SetOfficeSiteInternetStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteInternetStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

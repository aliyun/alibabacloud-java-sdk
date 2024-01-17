// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class AbolishApiForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AbolishApiForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbolishApiForInnerResponseBody self = new AbolishApiForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public AbolishApiForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

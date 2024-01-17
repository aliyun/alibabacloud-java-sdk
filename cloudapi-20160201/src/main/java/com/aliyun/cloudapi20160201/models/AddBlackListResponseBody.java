// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class AddBlackListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBlackListResponseBody self = new AddBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

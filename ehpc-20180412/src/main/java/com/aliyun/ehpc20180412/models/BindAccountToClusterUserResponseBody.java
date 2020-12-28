// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class BindAccountToClusterUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindAccountToClusterUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAccountToClusterUserResponseBody self = new BindAccountToClusterUserResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAccountToClusterUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AddClusterServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddClusterServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddClusterServiceResponseBody self = new AddClusterServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddClusterServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

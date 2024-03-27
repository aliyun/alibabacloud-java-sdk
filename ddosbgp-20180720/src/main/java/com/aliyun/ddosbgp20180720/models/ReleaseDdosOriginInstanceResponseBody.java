// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ReleaseDdosOriginInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseDdosOriginInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDdosOriginInstanceResponseBody self = new ReleaseDdosOriginInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseDdosOriginInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

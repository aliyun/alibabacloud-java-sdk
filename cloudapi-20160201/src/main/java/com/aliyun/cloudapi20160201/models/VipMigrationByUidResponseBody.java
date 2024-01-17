// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VipMigrationByUidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VipMigrationByUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VipMigrationByUidResponseBody self = new VipMigrationByUidResponseBody();
        return TeaModel.build(map, self);
    }

    public VipMigrationByUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

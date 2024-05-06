// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifyUpgradeToHasForHbaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUpgradeToHasForHbaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUpgradeToHasForHbaseResponseBody self = new ModifyUpgradeToHasForHbaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUpgradeToHasForHbaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

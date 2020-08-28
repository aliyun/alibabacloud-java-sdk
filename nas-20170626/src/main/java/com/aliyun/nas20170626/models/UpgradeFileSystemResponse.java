// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpgradeFileSystemResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpgradeFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFileSystemResponse self = new UpgradeFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeFileSystemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

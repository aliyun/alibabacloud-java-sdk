// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachAssetGroupToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachAssetGroupToInstanceResponseBody self = new AttachAssetGroupToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachAssetGroupToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

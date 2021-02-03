// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateGtmInstanceGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmInstanceGlobalConfigResponse self = new UpdateGtmInstanceGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmInstanceGlobalConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

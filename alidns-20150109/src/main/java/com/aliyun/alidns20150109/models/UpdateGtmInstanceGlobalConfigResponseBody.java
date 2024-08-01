// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGtmInstanceGlobalConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmInstanceGlobalConfigResponseBody self = new UpdateGtmInstanceGlobalConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGtmInstanceGlobalConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

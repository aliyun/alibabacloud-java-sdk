// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CopyGtmConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyGtmConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyGtmConfigResponseBody self = new CopyGtmConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyGtmConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

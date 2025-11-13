// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteRecursionZoneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRecursionZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecursionZoneResponseBody self = new DeleteRecursionZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRecursionZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

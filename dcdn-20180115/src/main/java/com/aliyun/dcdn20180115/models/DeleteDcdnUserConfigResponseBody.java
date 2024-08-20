// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnUserConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CC228B4-7A67-4016-9C9F-4A4133494A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnUserConfigResponseBody self = new DeleteDcdnUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

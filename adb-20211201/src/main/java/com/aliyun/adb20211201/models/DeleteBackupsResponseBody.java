// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteBackupsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>771C5FAA-530F-52F7-B84D-EBAD4561D590</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupsResponseBody self = new DeleteBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

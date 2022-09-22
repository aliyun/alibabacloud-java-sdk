// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteDNAFilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDNAFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNAFilesResponseBody self = new DeleteDNAFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDNAFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

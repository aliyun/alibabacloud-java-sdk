// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnIpaSpecificConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnIpaSpecificConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnIpaSpecificConfigResponseBody self = new DeleteDcdnIpaSpecificConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnIpaSpecificConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

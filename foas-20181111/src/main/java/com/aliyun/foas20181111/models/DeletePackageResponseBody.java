// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeletePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePackageResponseBody self = new DeletePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

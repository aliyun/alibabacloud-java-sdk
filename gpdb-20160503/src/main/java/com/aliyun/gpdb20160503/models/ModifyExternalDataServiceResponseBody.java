// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyExternalDataServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyExternalDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExternalDataServiceResponseBody self = new ModifyExternalDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExternalDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

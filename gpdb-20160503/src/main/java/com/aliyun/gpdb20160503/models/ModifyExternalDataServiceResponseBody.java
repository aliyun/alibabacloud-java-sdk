// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyExternalDataServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
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

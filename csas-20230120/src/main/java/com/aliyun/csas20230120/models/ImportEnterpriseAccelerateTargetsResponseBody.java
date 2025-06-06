// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ImportEnterpriseAccelerateTargetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1648723859058501</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>305508BD-8A31-5E15-86CE-52D57967C45E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportEnterpriseAccelerateTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportEnterpriseAccelerateTargetsResponseBody self = new ImportEnterpriseAccelerateTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportEnterpriseAccelerateTargetsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportEnterpriseAccelerateTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

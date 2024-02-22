// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableAccessForCloudSiemResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAccessForCloudSiemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessForCloudSiemResponseBody self = new EnableAccessForCloudSiemResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAccessForCloudSiemResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EnableAccessForCloudSiemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

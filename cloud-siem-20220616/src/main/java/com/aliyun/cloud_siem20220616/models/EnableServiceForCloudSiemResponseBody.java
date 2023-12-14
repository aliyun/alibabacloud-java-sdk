// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableServiceForCloudSiemResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static EnableServiceForCloudSiemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceForCloudSiemResponseBody self = new EnableServiceForCloudSiemResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServiceForCloudSiemResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EnableServiceForCloudSiemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

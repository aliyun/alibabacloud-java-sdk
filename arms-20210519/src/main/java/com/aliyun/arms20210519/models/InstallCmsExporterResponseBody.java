// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class InstallCmsExporterResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static InstallCmsExporterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallCmsExporterResponseBody self = new InstallCmsExporterResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallCmsExporterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

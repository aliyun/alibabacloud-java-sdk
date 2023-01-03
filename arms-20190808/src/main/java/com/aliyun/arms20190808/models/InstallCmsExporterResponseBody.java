// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallCmsExporterResponseBody extends TeaModel {
    // Indicates whether the request was successful.
    @NameInMap("Data")
    public String data;

    // The ID of the request. You can query logs and troubleshoot issues based on the ID.
    @NameInMap("RequestId")
    public String requestId;

    public static InstallCmsExporterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallCmsExporterResponseBody self = new InstallCmsExporterResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallCmsExporterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InstallCmsExporterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

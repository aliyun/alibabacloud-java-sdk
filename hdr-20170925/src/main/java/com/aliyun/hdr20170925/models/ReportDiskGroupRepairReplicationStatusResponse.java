// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupRepairReplicationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDiskGroupRepairReplicationStatusResponseBody body;

    public static ReportDiskGroupRepairReplicationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupRepairReplicationStatusResponse self = new ReportDiskGroupRepairReplicationStatusResponse();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupRepairReplicationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDiskGroupRepairReplicationStatusResponse setBody(ReportDiskGroupRepairReplicationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDiskGroupRepairReplicationStatusResponseBody getBody() {
        return this.body;
    }

}

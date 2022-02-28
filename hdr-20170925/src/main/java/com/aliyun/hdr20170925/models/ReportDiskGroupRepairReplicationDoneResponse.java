// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupRepairReplicationDoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportDiskGroupRepairReplicationDoneResponseBody body;

    public static ReportDiskGroupRepairReplicationDoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupRepairReplicationDoneResponse self = new ReportDiskGroupRepairReplicationDoneResponse();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupRepairReplicationDoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDiskGroupRepairReplicationDoneResponse setBody(ReportDiskGroupRepairReplicationDoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDiskGroupRepairReplicationDoneResponseBody getBody() {
        return this.body;
    }

}

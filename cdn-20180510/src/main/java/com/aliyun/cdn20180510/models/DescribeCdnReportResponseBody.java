// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportResponseBody extends TeaModel {
    // The content of the operations report.
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportResponseBody self = new DescribeCdnReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public DescribeCdnReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

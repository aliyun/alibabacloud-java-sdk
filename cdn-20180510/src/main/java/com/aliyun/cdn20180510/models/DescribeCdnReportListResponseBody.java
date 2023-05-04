// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportListResponseBody extends TeaModel {
    /**
     * <p>The information about the report that is queried.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportListResponseBody self = new DescribeCdnReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeCdnReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

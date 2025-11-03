// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class WebsiteDeleteDnsRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af917c716e7c4bb8bbe798b99825fdb6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static WebsiteDeleteDnsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebsiteDeleteDnsRecordResponseBody self = new WebsiteDeleteDnsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public WebsiteDeleteDnsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

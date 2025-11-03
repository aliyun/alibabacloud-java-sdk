// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class WebsiteAddDnsRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af917c716e7c4bb8bbe798b99825fdb6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static WebsiteAddDnsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WebsiteAddDnsRecordResponseBody self = new WebsiteAddDnsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public WebsiteAddDnsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

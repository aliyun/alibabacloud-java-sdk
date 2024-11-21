// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteCurrentNSResponseBody extends TeaModel {
    /**
     * <p>The nameservers of the website.</p>
     */
    @NameInMap("NSList")
    public java.util.List<String> NSList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSiteCurrentNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteCurrentNSResponseBody self = new GetSiteCurrentNSResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteCurrentNSResponseBody setNSList(java.util.List<String> NSList) {
        this.NSList = NSList;
        return this;
    }
    public java.util.List<String> getNSList() {
        return this.NSList;
    }

    public GetSiteCurrentNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

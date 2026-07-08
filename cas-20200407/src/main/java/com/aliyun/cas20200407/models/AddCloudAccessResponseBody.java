// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class AddCloudAccessResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>285BBE08-F12B-5A04-97BC-09EA7FF18646</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCloudAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCloudAccessResponseBody self = new AddCloudAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCloudAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

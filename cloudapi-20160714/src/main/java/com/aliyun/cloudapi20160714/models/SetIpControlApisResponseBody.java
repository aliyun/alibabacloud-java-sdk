// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetIpControlApisResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetIpControlApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIpControlApisResponseBody self = new SetIpControlApisResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIpControlApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

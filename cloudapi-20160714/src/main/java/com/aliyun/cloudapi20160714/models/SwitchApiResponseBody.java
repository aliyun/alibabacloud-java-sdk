// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SwitchApiResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchApiResponseBody self = new SwitchApiResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

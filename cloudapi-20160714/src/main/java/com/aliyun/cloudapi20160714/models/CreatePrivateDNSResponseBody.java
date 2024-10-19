// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePrivateDNSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrivateDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateDNSResponseBody self = new CreatePrivateDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivateDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

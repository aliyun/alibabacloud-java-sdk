// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachGroupPluginResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>3707E6FA-749C-5352-B72A-ABE95D9DEA49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachGroupPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachGroupPluginResponseBody self = new DetachGroupPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachGroupPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

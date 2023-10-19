// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeletePluginResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginResponseBody self = new DeletePluginResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

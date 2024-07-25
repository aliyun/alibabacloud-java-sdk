// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeletePluginConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePluginConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginConfigResponseBody self = new DeletePluginConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePluginConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

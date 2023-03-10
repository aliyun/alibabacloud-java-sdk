// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RemarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigLayer4RemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RemarkResponseBody self = new ConfigLayer4RemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

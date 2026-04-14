// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetUpdateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigSetUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetUpdateResponseBody self = new ConfigSetUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSetUpdateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfigSetUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

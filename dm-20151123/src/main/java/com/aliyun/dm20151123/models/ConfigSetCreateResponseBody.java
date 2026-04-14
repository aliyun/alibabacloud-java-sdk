// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCreateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigSetCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCreateResponseBody self = new ConfigSetCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSetCreateResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfigSetCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

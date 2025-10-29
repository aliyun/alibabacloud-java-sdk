// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCancelRelationFromAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ConfigSetCancelRelationFromAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCancelRelationFromAddressResponseBody self = new ConfigSetCancelRelationFromAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigSetCancelRelationFromAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigSetCancelRelationFromAddressResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}

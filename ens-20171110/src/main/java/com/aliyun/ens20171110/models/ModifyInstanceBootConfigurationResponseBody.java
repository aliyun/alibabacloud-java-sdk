// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceBootConfigurationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceBootConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceBootConfigurationResponseBody self = new ModifyInstanceBootConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceBootConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class SwitchLSQLV3MySQLServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchLSQLV3MySQLServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchLSQLV3MySQLServiceResponseBody self = new SwitchLSQLV3MySQLServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchLSQLV3MySQLServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

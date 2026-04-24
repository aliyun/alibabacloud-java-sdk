// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20260423.models;

import com.aliyun.tea.*;

public class QuerySuccessIcpDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>skill</p>
     */
    @NameInMap("Caller")
    public String caller;

    public static QuerySuccessIcpDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySuccessIcpDataRequest self = new QuerySuccessIcpDataRequest();
        return TeaModel.build(map, self);
    }

    public QuerySuccessIcpDataRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

}

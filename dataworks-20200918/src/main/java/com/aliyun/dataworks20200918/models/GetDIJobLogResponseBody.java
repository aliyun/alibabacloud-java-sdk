// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDIJobLogResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("Log")
    public String log;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDIJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobLogResponseBody self = new GetDIJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIJobLogResponseBody setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public GetDIJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

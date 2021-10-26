// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SynchronizeGroupConfigResponseBody extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Launch")
    public Boolean launch;

    public static SynchronizeGroupConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeGroupConfigResponseBody self = new SynchronizeGroupConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SynchronizeGroupConfigResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public SynchronizeGroupConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SynchronizeGroupConfigResponseBody setLaunch(Boolean launch) {
        this.launch = launch;
        return this;
    }
    public Boolean getLaunch() {
        return this.launch;
    }

}

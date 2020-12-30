// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobStatusByCallIdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CallId")
    public String callId;

    public static GetJobStatusByCallIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusByCallIdRequest self = new GetJobStatusByCallIdRequest();
        return TeaModel.build(map, self);
    }

    public GetJobStatusByCallIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetJobStatusByCallIdRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

}

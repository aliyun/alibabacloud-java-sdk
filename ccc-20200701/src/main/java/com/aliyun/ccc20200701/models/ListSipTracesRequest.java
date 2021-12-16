// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSipTracesRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListSipTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSipTracesRequest self = new ListSipTracesRequest();
        return TeaModel.build(map, self);
    }

    public ListSipTracesRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public ListSipTracesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

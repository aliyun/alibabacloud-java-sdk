// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertTaskDetailRequest extends TeaModel {
    @NameInMap("CallInfos")
    public String callInfos;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundTaskId")
    public Long outboundTaskId;

    public static InsertTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertTaskDetailRequest self = new InsertTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public InsertTaskDetailRequest setCallInfos(String callInfos) {
        this.callInfos = callInfos;
        return this;
    }
    public String getCallInfos() {
        return this.callInfos;
    }

    public InsertTaskDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InsertTaskDetailRequest setOutboundTaskId(Long outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

}

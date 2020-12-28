// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddLocalNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static AddLocalNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLocalNodesResponseBody self = new AddLocalNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLocalNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLocalNodesResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}

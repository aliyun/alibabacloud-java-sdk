// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddLocalNodesResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public AddLocalNodesResponseBodyInstanceIds instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static AddLocalNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLocalNodesResponseBody self = new AddLocalNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLocalNodesResponseBody setInstanceIds(AddLocalNodesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public AddLocalNodesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public AddLocalNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddLocalNodesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static AddLocalNodesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            AddLocalNodesResponseBodyInstanceIds self = new AddLocalNodesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public AddLocalNodesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}

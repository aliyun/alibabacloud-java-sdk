// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class AddNodesResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public AddNodesResponseBodyInstanceIds instanceIds;

    @NameInMap("RequestId")
    public String requestId;

    public static AddNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddNodesResponseBody self = new AddNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddNodesResponseBody setInstanceIds(AddNodesResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public AddNodesResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public AddNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddNodesResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static AddNodesResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            AddNodesResponseBodyInstanceIds self = new AddNodesResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public AddNodesResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}

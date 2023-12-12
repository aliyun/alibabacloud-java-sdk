// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLdpsComputeGroupResponseBody extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Properties")
    public java.util.Map<String, ?> properties;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLdpsComputeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLdpsComputeGroupResponseBody self = new GetLdpsComputeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLdpsComputeGroupResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public GetLdpsComputeGroupResponseBody setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GetLdpsComputeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRoutePointRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRoutePointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutePointRequest self = new GetRoutePointRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutePointRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public GetRoutePointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

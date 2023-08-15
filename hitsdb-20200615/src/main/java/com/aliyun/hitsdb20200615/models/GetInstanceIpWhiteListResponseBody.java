// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceIpWhiteListResponseBody extends TeaModel {
    /**
     * <p>The ID of the Lindorm instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpList")
    public java.util.List<String> ipList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIpWhiteListResponseBody self = new GetInstanceIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceIpWhiteListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceIpWhiteListResponseBody setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public GetInstanceIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetGWSConnectTicketRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetGWSConnectTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGWSConnectTicketRequest self = new GetGWSConnectTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetGWSConnectTicketRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetGWSConnectTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

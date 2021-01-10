// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttClientStatusRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeMqttClientStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttClientStatusRequest self = new DescribeMqttClientStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMqttClientStatusRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeMqttClientStatusRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeMqttClientStatusRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

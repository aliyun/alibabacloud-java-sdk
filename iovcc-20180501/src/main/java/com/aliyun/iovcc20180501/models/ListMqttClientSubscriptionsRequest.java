// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttClientSubscriptionsRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListMqttClientSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqttClientSubscriptionsRequest self = new ListMqttClientSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMqttClientSubscriptionsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListMqttClientSubscriptionsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ListMqttClientSubscriptionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

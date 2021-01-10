// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttRootTopicsRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListMqttRootTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqttRootTopicsRequest self = new ListMqttRootTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListMqttRootTopicsRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListMqttRootTopicsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

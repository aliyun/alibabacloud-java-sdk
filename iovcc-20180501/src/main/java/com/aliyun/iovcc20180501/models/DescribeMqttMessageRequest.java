// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttMessageRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Mid")
    public String mid;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeMqttMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttMessageRequest self = new DescribeMqttMessageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMqttMessageRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeMqttMessageRequest setMid(String mid) {
        this.mid = mid;
        return this;
    }
    public String getMid() {
        return this.mid;
    }

    public DescribeMqttMessageRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}

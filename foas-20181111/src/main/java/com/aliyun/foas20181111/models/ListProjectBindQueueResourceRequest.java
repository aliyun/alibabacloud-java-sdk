// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectBindQueueResourceRequest extends TeaModel {
    @NameInMap("clusterId")
    public String clusterId;

    @NameInMap("queueName")
    public String queueName;

    public static ListProjectBindQueueResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBindQueueResourceRequest self = new ListProjectBindQueueResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectBindQueueResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListProjectBindQueueResourceRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}

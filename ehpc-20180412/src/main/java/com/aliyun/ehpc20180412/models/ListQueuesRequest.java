// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable asynchronous query.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesRequest self = new ListQueuesRequest();
        return TeaModel.build(map, self);
    }

    public ListQueuesRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ListQueuesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

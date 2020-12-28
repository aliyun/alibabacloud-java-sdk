// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListQueuesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListQueuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesRequest self = new ListQueuesRequest();
        return TeaModel.build(map, self);
    }

    public ListQueuesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

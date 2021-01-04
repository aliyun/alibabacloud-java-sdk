// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class GetCmsUrlRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetCmsUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCmsUrlRequest self = new GetCmsUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetCmsUrlRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

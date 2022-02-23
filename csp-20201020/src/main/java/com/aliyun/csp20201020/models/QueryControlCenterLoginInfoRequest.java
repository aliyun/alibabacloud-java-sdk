// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryControlCenterLoginInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static QueryControlCenterLoginInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryControlCenterLoginInfoRequest self = new QueryControlCenterLoginInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryControlCenterLoginInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

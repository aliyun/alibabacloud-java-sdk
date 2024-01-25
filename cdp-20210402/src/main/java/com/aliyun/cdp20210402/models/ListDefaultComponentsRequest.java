// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListDefaultComponentsRequest extends TeaModel {
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("SecurityMode")
    public String securityMode;

    public static ListDefaultComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultComponentsRequest self = new ListDefaultComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDefaultComponentsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListDefaultComponentsRequest setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

}

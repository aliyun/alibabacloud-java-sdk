// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryServiceStatusRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpaceId")
    public String spaceId;

    public static QueryServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceStatusRequest self = new QueryServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceStatusRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryServiceStatusRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenServiceRequest extends TeaModel {
    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SpaceId")
    public String spaceId;

    public static OpenServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceRequest self = new OpenServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public OpenServiceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}

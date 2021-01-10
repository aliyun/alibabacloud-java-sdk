// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenServiceRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static OpenServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceRequest self = new OpenServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenServiceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public OpenServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}

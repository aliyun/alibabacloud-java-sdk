// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceContainersResponseBody extends TeaModel {
    /**
     * <p>The containers of the service.</p>
     */
    @NameInMap("Containers")
    public java.util.List<ContainerInfo> containers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static ListServiceContainersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceContainersResponseBody self = new ListServiceContainersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceContainersResponseBody setContainers(java.util.List<ContainerInfo> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<ContainerInfo> getContainers() {
        return this.containers;
    }

    public ListServiceContainersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceContainersResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}

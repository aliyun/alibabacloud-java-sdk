// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class LaunchServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("Version")
    public String version;

    @NameInMap("Status")
    public String status;

    public static LaunchServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LaunchServiceResponseBody self = new LaunchServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public LaunchServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LaunchServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public LaunchServiceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public LaunchServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

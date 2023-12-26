// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAppServiceResponseBody extends TeaModel {
    /**
     * <p>The public endpoint of the service.</p>
     */
    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    /**
     * <p>The internal endpoint of the service.</p>
     */
    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    /**
     * <p>The region ID of the service.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service name.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The service state.</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateAppServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppServiceResponseBody self = new CreateAppServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppServiceResponseBody setInternetEndpoint(String internetEndpoint) {
        this.internetEndpoint = internetEndpoint;
        return this;
    }
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    public CreateAppServiceResponseBody setIntranetEndpoint(String intranetEndpoint) {
        this.intranetEndpoint = intranetEndpoint;
        return this;
    }
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    public CreateAppServiceResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateAppServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateAppServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateAppServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

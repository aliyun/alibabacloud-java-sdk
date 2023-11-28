// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The endpoint domain name, which is used to configure the connection.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the endpoint on the service VPC side.</p>
     */
    @NameInMap("Result")
    public CreateVpcEndpointResponseBodyResult result;

    public static CreateVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointResponseBody self = new CreateVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcEndpointResponseBody setResult(CreateVpcEndpointResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateVpcEndpointResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateVpcEndpointResponseBodyResult extends TeaModel {
        @NameInMap("endpointDomain")
        public String endpointDomain;

        @NameInMap("endpointId")
        public String endpointId;

        @NameInMap("endpointName")
        public String endpointName;

        /**
         * <p>The name of the service VPC-side endpoint.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        public static CreateVpcEndpointResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateVpcEndpointResponseBodyResult self = new CreateVpcEndpointResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateVpcEndpointResponseBodyResult setEndpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        public CreateVpcEndpointResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public CreateVpcEndpointResponseBodyResult setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public CreateVpcEndpointResponseBodyResult setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsResponseBody extends TeaModel {
    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The endpoints in the endpoint group.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<CreateBasicEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBasicEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointsResponseBody self = new CreateBasicEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointsResponseBody setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateBasicEndpointsResponseBody setEndpoints(java.util.List<CreateBasicEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<CreateBasicEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public CreateBasicEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateBasicEndpointsResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The address of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1a05txelswuj8g****</p>
         */
        @NameInMap("EndpointAddress")
        public String endpointAddress;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The secondary address of the endpoint.</p>
         * <p>This parameter is returned if the endpoint type is <strong>ECS</strong>, <strong>ENI</strong>, or <strong>NLB</strong>.</p>
         * <ul>
         * <li>If the endpoint type is <strong>ECS</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the primary ENI.</li>
         * <li>If the endpoint type is <strong>ENI</strong>, <strong>EndpointSubAddress</strong> returns the primary or secondary private IP address of the secondary ENI.</li>
         * <li>If the endpoint type is <strong>NLB</strong>, <strong>EndpointSubAddress</strong> returns the primary private IP address of the NLB backend server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("EndpointSubAddress")
        public String endpointSubAddress;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>ENI:</strong> ENI.</li>
         * <li><strong>SLB:</strong> CLB instance.</li>
         * <li><strong>ECS:</strong> ECS instance.</li>
         * <li><strong>NLB:</strong> NLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENI</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        public static CreateBasicEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicEndpointsResponseBodyEndpoints self = new CreateBasicEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointAddress(String endpointAddress) {
            this.endpointAddress = endpointAddress;
            return this;
        }
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointSubAddress(String endpointSubAddress) {
            this.endpointSubAddress = endpointSubAddress;
            return this;
        }
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        public CreateBasicEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

}

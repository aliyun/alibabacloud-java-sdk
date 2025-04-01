// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The service token.</p>
     * 
     * <strong>example:</strong>
     * <p>Nzc5N2FhN<strong><strong>TQ0YzBmYTIyN2MxZTUxN2NkYjg4MTJmMWQxZmY1</strong></strong></p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The service endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<DescribeServiceEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Execution successful.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>739998B5-FB39-12A3-8323-0FA340317298</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceEndpointsResponseBody self = new DescribeServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceEndpointsResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DescribeServiceEndpointsResponseBody setEndpoints(java.util.List<DescribeServiceEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<DescribeServiceEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public DescribeServiceEndpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceEndpointsResponseBodyEndpoints extends TeaModel {
        @NameInMap("BackendId")
        public String backendId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("InternetEndpoints")
        public java.util.List<String> internetEndpoints;

        @NameInMap("IntranetEndpoints")
        public java.util.List<String> intranetEndpoints;

        @NameInMap("PathType")
        public String pathType;

        @NameInMap("Port")
        public Integer port;

        public static DescribeServiceEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceEndpointsResponseBodyEndpoints self = new DescribeServiceEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setInternetEndpoints(java.util.List<String> internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }
        public java.util.List<String> getInternetEndpoints() {
            return this.internetEndpoints;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setIntranetEndpoints(java.util.List<String> intranetEndpoints) {
            this.intranetEndpoints = intranetEndpoints;
            return this;
        }
        public java.util.List<String> getIntranetEndpoints() {
            return this.intranetEndpoints;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setPathType(String pathType) {
            this.pathType = pathType;
            return this;
        }
        public String getPathType() {
            return this.pathType;
        }

        public DescribeServiceEndpointsResponseBodyEndpoints setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}

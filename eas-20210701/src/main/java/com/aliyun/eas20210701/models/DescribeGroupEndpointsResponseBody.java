// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeGroupEndpointsResponseBody extends TeaModel {
    /**
     * <p>The service token.</p>
     * 
     * <strong>example:</strong>
     * <p>Nzc5N2FhNTM4OTQ0YzBmYTIy<strong><strong>ZTUxN2NkYjg4MTJmMWQxZmY1</strong></strong></p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The endpoints of service groups.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<DescribeGroupEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The response message.</p>
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
     * <p>890772EF-3AD6-129A-8E15-8F349C944783</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupEndpointsResponseBody self = new DescribeGroupEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupEndpointsResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DescribeGroupEndpointsResponseBody setEndpoints(java.util.List<DescribeGroupEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<DescribeGroupEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public DescribeGroupEndpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGroupEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupEndpointsResponseBodyEndpoints extends TeaModel {
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

        public static DescribeGroupEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupEndpointsResponseBodyEndpoints self = new DescribeGroupEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeGroupEndpointsResponseBodyEndpoints setBackendId(String backendId) {
            this.backendId = backendId;
            return this;
        }
        public String getBackendId() {
            return this.backendId;
        }

        public DescribeGroupEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeGroupEndpointsResponseBodyEndpoints setInternetEndpoints(java.util.List<String> internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }
        public java.util.List<String> getInternetEndpoints() {
            return this.internetEndpoints;
        }

        public DescribeGroupEndpointsResponseBodyEndpoints setIntranetEndpoints(java.util.List<String> intranetEndpoints) {
            this.intranetEndpoints = intranetEndpoints;
            return this;
        }
        public java.util.List<String> getIntranetEndpoints() {
            return this.intranetEndpoints;
        }

        public DescribeGroupEndpointsResponseBodyEndpoints setPathType(String pathType) {
            this.pathType = pathType;
            return this;
        }
        public String getPathType() {
            return this.pathType;
        }

        public DescribeGroupEndpointsResponseBodyEndpoints setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetServiceEndpointResponseBody extends TeaModel {
    /**
     * <p>The response code returned on success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public GetServiceEndpointResponseBodyData data;

    /**
     * <p><strong>message</strong></p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p><strong>requestId</strong></p>
     * 
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEndpointResponseBody self = new GetServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceEndpointResponseBody setData(GetServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public GetServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The certificate identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-xxx</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The component type. Valid values:</p>
         * <ul>
         * <li>ELEMENT: element</li>
         * <li>TUNNEL: tunnel</li>
         * <li>MATRIX: matrix</li>
         * <li>WORKER: worker</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>matrix.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The domain name type. Valid values:</p>
         * <ul>
         * <li>BUILTIN: built-in</li>
         * <li>CUSTOM: custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>Endpoint ID</p>
         * 
         * <strong>example:</strong>
         * <p>mep-test0001</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>matrix-service</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-demo</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>NONE: none</li>
         * <li>INTRANET: internal network</li>
         * <li>INTERNET: Internet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>CONFIGURED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceEndpointResponseBodyData self = new GetServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceEndpointResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public GetServiceEndpointResponseBodyData setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public GetServiceEndpointResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetServiceEndpointResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetServiceEndpointResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public GetServiceEndpointResponseBodyData setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public GetServiceEndpointResponseBodyData setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public GetServiceEndpointResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetServiceEndpointResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetServiceEndpointResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServiceEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceEndpointResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateServiceEndpointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateServiceEndpointResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEndpointResponseBody self = new UpdateServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateServiceEndpointResponseBody setData(UpdateServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public UpdateServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateServiceEndpointResponseBodyData extends TeaModel {
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("Component")
        public String component;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NetworkType")
        public String networkType;

        public static UpdateServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceEndpointResponseBodyData self = new UpdateServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateServiceEndpointResponseBodyData setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public UpdateServiceEndpointResponseBodyData setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public UpdateServiceEndpointResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateServiceEndpointResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public UpdateServiceEndpointResponseBodyData setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public UpdateServiceEndpointResponseBodyData setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public UpdateServiceEndpointResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateServiceEndpointResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

}

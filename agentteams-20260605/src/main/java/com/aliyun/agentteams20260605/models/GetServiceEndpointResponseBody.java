// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetServiceEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetServiceEndpointResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>req-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        @NameInMap("Component")
        public String component;

        @NameInMap("CreateTime")
        public String createTime;

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

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetGatewayServiceDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayServiceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayServiceDetailResponseBody self = new GetGatewayServiceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayServiceDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayServiceDetailResponseBody setData(GetGatewayServiceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayServiceDetailResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayServiceDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayServiceDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayServiceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayServiceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayServiceDetailResponseBodyDataLabelDetails extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetGatewayServiceDetailResponseBodyDataLabelDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyDataLabelDetails self = new GetGatewayServiceDetailResponseBodyDataLabelDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyDataLabelDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetGatewayServiceDetailResponseBodyDataLabelDetails setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList extends TeaModel {
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("ServicePort")
        public Integer servicePort;

        @NameInMap("TrafficPolicy")
        public TrafficPolicy trafficPolicy;

        public static GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList self = new GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList setTrafficPolicy(TrafficPolicy trafficPolicy) {
            this.trafficPolicy = trafficPolicy;
            return this;
        }
        public TrafficPolicy getTrafficPolicy() {
            return this.trafficPolicy;
        }

    }

    public static class GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels self = new GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels> labels;

        @NameInMap("Name")
        public String name;

        public static GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion self = new GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion setLabels(java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels> getLabels() {
            return this.labels;
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetGatewayServiceDetailResponseBodyDataVersionDetails extends TeaModel {
        @NameInMap("EndpointNum")
        public Integer endpointNum;

        @NameInMap("EndpointNumPercent")
        public String endpointNumPercent;

        @NameInMap("ServiceVersion")
        public GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion serviceVersion;

        public static GetGatewayServiceDetailResponseBodyDataVersionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyDataVersionDetails self = new GetGatewayServiceDetailResponseBodyDataVersionDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetails setEndpointNum(Integer endpointNum) {
            this.endpointNum = endpointNum;
            return this;
        }
        public Integer getEndpointNum() {
            return this.endpointNum;
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetails setEndpointNumPercent(String endpointNumPercent) {
            this.endpointNumPercent = endpointNumPercent;
            return this;
        }
        public String getEndpointNumPercent() {
            return this.endpointNumPercent;
        }

        public GetGatewayServiceDetailResponseBodyDataVersionDetails setServiceVersion(GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersion getServiceVersion() {
            return this.serviceVersion;
        }

    }

    public static class GetGatewayServiceDetailResponseBodyDataVersions extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static GetGatewayServiceDetailResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyDataVersions self = new GetGatewayServiceDetailResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyDataVersions setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetGatewayServiceDetailResponseBodyDataVersions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetGatewayServiceDetailResponseBodyDataVersions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetGatewayServiceDetailResponseBodyData extends TeaModel {
        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayTrafficPolicy")
        public TrafficPolicy gatewayTrafficPolicy;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Ips")
        public java.util.List<String> ips;

        @NameInMap("LabelDetails")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataLabelDetails> labelDetails;

        @NameInMap("MetaInfo")
        public String metaInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PortTrafficPolicyList")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList> portTrafficPolicyList;

        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("ServiceNameInRegistry")
        public String serviceNameInRegistry;

        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("VersionDetails")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetails> versionDetails;

        @NameInMap("Versions")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersions> versions;

        public static GetGatewayServiceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayServiceDetailResponseBodyData self = new GetGatewayServiceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayServiceDetailResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayServiceDetailResponseBodyData setGatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
            this.gatewayTrafficPolicy = gatewayTrafficPolicy;
            return this;
        }
        public TrafficPolicy getGatewayTrafficPolicy() {
            return this.gatewayTrafficPolicy;
        }

        public GetGatewayServiceDetailResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayServiceDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayServiceDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayServiceDetailResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGatewayServiceDetailResponseBodyData setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public GetGatewayServiceDetailResponseBodyData setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public GetGatewayServiceDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayServiceDetailResponseBodyData setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public GetGatewayServiceDetailResponseBodyData setLabelDetails(java.util.List<GetGatewayServiceDetailResponseBodyDataLabelDetails> labelDetails) {
            this.labelDetails = labelDetails;
            return this;
        }
        public java.util.List<GetGatewayServiceDetailResponseBodyDataLabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        public GetGatewayServiceDetailResponseBodyData setMetaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public String getMetaInfo() {
            return this.metaInfo;
        }

        public GetGatewayServiceDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayServiceDetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetGatewayServiceDetailResponseBodyData setPortTrafficPolicyList(java.util.List<GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList> portTrafficPolicyList) {
            this.portTrafficPolicyList = portTrafficPolicyList;
            return this;
        }
        public java.util.List<GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList> getPortTrafficPolicyList() {
            return this.portTrafficPolicyList;
        }

        public GetGatewayServiceDetailResponseBodyData setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public GetGatewayServiceDetailResponseBodyData setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public GetGatewayServiceDetailResponseBodyData setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public GetGatewayServiceDetailResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetGatewayServiceDetailResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetGatewayServiceDetailResponseBodyData setVersionDetails(java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetails> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetails> getVersionDetails() {
            return this.versionDetails;
        }

        public GetGatewayServiceDetailResponseBodyData setVersions(java.util.List<GetGatewayServiceDetailResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

    }

}

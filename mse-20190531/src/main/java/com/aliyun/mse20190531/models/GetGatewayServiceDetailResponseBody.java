// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayServiceDetailResponseBody extends TeaModel {
    /**
     * <p>The response code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetGatewayServiceDetailResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
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
        /**
         * <p>The tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The port ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The service ID.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The service port number.</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The traffic policy.</p>
         */
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
        /**
         * <p>The tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The tag.</p>
         */
        @NameInMap("Labels")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetailsServiceVersionLabels> labels;

        /**
         * <p>The version number.</p>
         */
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
        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("EndpointNum")
        public Integer endpointNum;

        /**
         * <p>The percentage of instances.</p>
         */
        @NameInMap("EndpointNumPercent")
        public String endpointNumPercent;

        /**
         * <p>The service version.</p>
         */
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
        /**
         * <p>The tag.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The ID of the gateway.</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The traffic policy of the service.</p>
         */
        @NameInMap("GatewayTrafficPolicy")
        public TrafficPolicy gatewayTrafficPolicy;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Indicates whether the health check is enabled.</p>
         */
        @NameInMap("HealthCheck")
        public String healthCheck;

        /**
         * <p>The status of the health check. Valid values:</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IP address of the service.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        /**
         * <p>The details of the tag.</p>
         */
        @NameInMap("LabelDetails")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataLabelDetails> labelDetails;

        /**
         * <p>The basic information about the service.</p>
         */
        @NameInMap("MetaInfo")
        public String metaInfo;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The traffic policy of service ports.</p>
         */
        @NameInMap("PortTrafficPolicyList")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataPortTrafficPolicyList> portTrafficPolicyList;

        /**
         * <p>The array of service ports.</p>
         */
        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        @NameInMap("ServiceFQDN")
        public String serviceFQDN;

        /**
         * <p>The name of the service registered with the service registry.</p>
         */
        @NameInMap("ServiceNameInRegistry")
        public String serviceNameInRegistry;

        /**
         * <p>The protocol of the service.</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The ID of the service source.</p>
         */
        @NameInMap("SourceId")
        public Long sourceId;

        /**
         * <p>The source type of the service.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The details of versions.</p>
         */
        @NameInMap("VersionDetails")
        public java.util.List<GetGatewayServiceDetailResponseBodyDataVersionDetails> versionDetails;

        /**
         * <p>The service version. This parameter is deprecated.</p>
         */
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

        public GetGatewayServiceDetailResponseBodyData setServiceFQDN(String serviceFQDN) {
            this.serviceFQDN = serviceFQDN;
            return this;
        }
        public String getServiceFQDN() {
            return this.serviceFQDN;
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

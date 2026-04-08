// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPADiagnosisTaskResponseBody extends TeaModel {
    @NameInMap("DiagnosisTask")
    public GetPADiagnosisTaskResponseBodyDiagnosisTask diagnosisTask;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2CABFEBB-0CE7-575E-833A-266F75D46713</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPADiagnosisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPADiagnosisTaskResponseBody self = new GetPADiagnosisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPADiagnosisTaskResponseBody setDiagnosisTask(GetPADiagnosisTaskResponseBodyDiagnosisTask diagnosisTask) {
        this.diagnosisTask = diagnosisTask;
        return this;
    }
    public GetPADiagnosisTaskResponseBodyDiagnosisTask getDiagnosisTask() {
        return this.diagnosisTask;
    }

    public GetPADiagnosisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("Prov")
        public String prov;

        /**
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("Isp")
        public String isp;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData setProv(String prov) {
            this.prov = prov;
            return this;
        }
        public String getProv() {
            return this.prov;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>TTL。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TTL")
        public String TTL;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Latency")
        public String latency;

        @NameInMap("GeoData")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData geoData;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops setTTL(String TTL) {
            this.TTL = TTL;
            return this;
        }
        public String getTTL() {
            return this.TTL;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops setLatency(String latency) {
            this.latency = latency;
            return this;
        }
        public String getLatency() {
            return this.latency;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops setGeoData(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData geoData) {
            this.geoData = geoData;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHopsGeoData getGeoData() {
            return this.geoData;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100.100.2.136,100.100.2.138</p>
         */
        @NameInMap("DnsServer")
        public String dnsServer;

        /**
         * <strong>example:</strong>
         * <p>private-zone</p>
         */
        @NameInMap("DnsType")
        public String dnsType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FromNode")
        public Long fromNode;

        @NameInMap("Hops")
        public java.util.List<java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops>> hops;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Latency")
        public String latency;

        /**
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ToNode")
        public Long toNode;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setDnsServer(String dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public String getDnsServer() {
            return this.dnsServer;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setDnsType(String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public String getDnsType() {
            return this.dnsType;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setFromNode(Long fromNode) {
            this.fromNode = fromNode;
            return this;
        }
        public Long getFromNode() {
            return this.fromNode;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setHops(java.util.List<java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops>> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDnsHops>> getHops() {
            return this.hops;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setLatency(String latency) {
            this.latency = latency;
            return this;
        }
        public String getLatency() {
            return this.latency;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns setToNode(Long toNode) {
            this.toNode = toNode;
            return this;
        }
        public Long getToNode() {
            return this.toNode;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Haikou City</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>ChinaMobile_L2</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>ZHejiang</p>
         */
        @NameInMap("Prov")
        public String prov;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData setProv(String prov) {
            this.prov = prov;
            return this;
        }
        public String getProv() {
            return this.prov;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Address")
        public String address;

        @NameInMap("GeoData")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData geoData;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Latency")
        public String latency;

        /**
         * <p>TTL。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TTL")
        public String TTL;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops setGeoData(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData geoData) {
            this.geoData = geoData;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHopsGeoData getGeoData() {
            return this.geoData;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops setLatency(String latency) {
            this.latency = latency;
            return this;
        }
        public String getLatency() {
            return this.latency;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops setTTL(String TTL) {
            this.TTL = TTL;
            return this;
        }
        public String getTTL() {
            return this.TTL;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FromNode")
        public Long fromNode;

        @NameInMap("Hops")
        public java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops> hops;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Latency")
        public String latency;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ToNode")
        public Long toNode;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks setFromNode(Long fromNode) {
            this.fromNode = fromNode;
            return this;
        }
        public Long getFromNode() {
            return this.fromNode;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks setHops(java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops> hops) {
            this.hops = hops;
            return this;
        }
        public java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinksHops> getHops() {
            return this.hops;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks setLatency(String latency) {
            this.latency = latency;
            return this;
        }
        public String getLatency() {
            return this.latency;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks setToNode(Long toNode) {
            this.toNode = toNode;
            return this;
        }
        public Long getToNode() {
            return this.toNode;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>ChinaTelecom_L2</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        @NameInMap("Prov")
        public String prov;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData setProv(String prov) {
            this.prov = prov;
            return this;
        }
        public String getProv() {
            return this.prov;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>172.27.228.132</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxxxx</p>
         */
        @NameInMap("CloudNetId")
        public String cloudNetId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Error")
        public String error;

        @NameInMap("GeoData")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData geoData;

        /**
         * <strong>example:</strong>
         * <p>1237</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Japan Private POP</p>
         */
        @NameInMap("NameEn")
        public String nameEn;

        /**
         * <strong>example:</strong>
         * <p>stunnel</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>pop-xxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setCloudNetId(String cloudNetId) {
            this.cloudNetId = cloudNetId;
            return this;
        }
        public String getCloudNetId() {
            return this.cloudNetId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setGeoData(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData geoData) {
            this.geoData = geoData;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodesGeoData getGeoData() {
            return this.geoData;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo extends TeaModel {
        @NameInMap("Dns")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns dns;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("FBT")
        public String FBT;

        @NameInMap("Links")
        public java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks> links;

        @NameInMap("Nodes")
        public java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes> nodes;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo setDns(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns dns) {
            this.dns = dns;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoDns getDns() {
            return this.dns;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo setFBT(String FBT) {
            this.FBT = FBT;
            return this;
        }
        public String getFBT() {
            return this.FBT;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo setLinks(java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks> links) {
            this.links = links;
            return this;
        }
        public java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoLinks> getLinks() {
            return this.links;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo setNodes(java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfoNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>E9EE1CE7-4AA0-521D-B8E1-E13E47F05E94</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <strong>example:</strong>
         * <p>macos</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("File")
        public java.util.List<String> file;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;Platform\&quot;:\&quot;windows\&quot;,\&quot;Status\&quot;:\&quot;disabled\&quot;},{\&quot;Platform\&quot;:\&quot;macos\&quot;,\&quot;Status\&quot;:\&quot;disabled\&quot;},{\&quot;Platform\&quot;:\&quot;linux\&quot;,\&quot;Status\&quot;:\&quot;disabled\&quot;}]</p>
         */
        @NameInMap("Firewall")
        public String firewall;

        /**
         * <strong>example:</strong>
         * <p>DESKTOP-CVTB5KT.CXISHD01.CATHAY_INS.CHN</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>10.5.208.122</p>
         */
        @NameInMap("InnerIp")
        public String innerIp;

        /**
         * <strong>example:</strong>
         * <p>47.98.146.136</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p><code>curl Rj0F9uvI.popscan.xaliyun.com</code></p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("MatchedSecurityBaseline")
        public String matchedSecurityBaseline;

        @NameInMap("Process")
        public java.util.List<String> process;

        /**
         * <p>SSID。</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Ssid")
        public String ssid;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setFile(java.util.List<String> file) {
            this.file = file;
            return this;
        }
        public java.util.List<String> getFile() {
            return this.file;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setFirewall(String firewall) {
            this.firewall = firewall;
            return this;
        }
        public String getFirewall() {
            return this.firewall;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setMatchedSecurityBaseline(String matchedSecurityBaseline) {
            this.matchedSecurityBaseline = matchedSecurityBaseline;
            return this;
        }
        public String getMatchedSecurityBaseline() {
            return this.matchedSecurityBaseline;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setProcess(java.util.List<String> process) {
            this.process = process;
            return this;
        }
        public java.util.List<String> getProcess() {
            return this.process;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo setSsid(String ssid) {
            this.ssid = ssid;
            return this;
        }
        public String getSsid() {
            return this.ssid;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>connector</p>
         */
        @NameInMap("RouteType")
        public String routeType;

        /**
         * <strong>example:</strong>
         * <p>av-rtd-091c2d6e3f24aae4</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo setRouteType(String routeType) {
            this.routeType = routeType;
            return this;
        }
        public String getRouteType() {
            return this.routeType;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:1234@xxxx.com">1234@xxxx.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("Group")
        public java.util.List<String> group;

        /**
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("MatchedUserGroups")
        public String matchedUserGroups;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Telephone")
        public String telephone;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo setGroup(java.util.List<String> group) {
            this.group = group;
            return this;
        }
        public java.util.List<String> getGroup() {
            return this.group;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo setMatchedUserGroups(String matchedUserGroups) {
            this.matchedUserGroups = matchedUserGroups;
            return this;
        }
        public String getMatchedUserGroups() {
            return this.matchedUserGroups;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>MyApp2</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>access denied</p>
         */
        @NameInMap("BlockInfo")
        public String blockInfo;

        @NameInMap("PolicyName")
        public String policyName;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo setBlockInfo(String blockInfo) {
            this.blockInfo = blockInfo;
            return this;
        }
        public String getBlockInfo() {
            return this.blockInfo;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo extends TeaModel {
        @NameInMap("DeviceAttributeInfo")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo deviceAttributeInfo;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ProcessTime")
        public Long processTime;

        @NameInMap("RouteStrategyInfo")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo routeStrategyInfo;

        @NameInMap("UserGroupInfo")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo userGroupInfo;

        @NameInMap("ZeroTrustPolicyInfo")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo zeroTrustPolicyInfo;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo setDeviceAttributeInfo(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo deviceAttributeInfo) {
            this.deviceAttributeInfo = deviceAttributeInfo;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoDeviceAttributeInfo getDeviceAttributeInfo() {
            return this.deviceAttributeInfo;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo setProcessTime(Long processTime) {
            this.processTime = processTime;
            return this;
        }
        public Long getProcessTime() {
            return this.processTime;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo setRouteStrategyInfo(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo routeStrategyInfo) {
            this.routeStrategyInfo = routeStrategyInfo;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoRouteStrategyInfo getRouteStrategyInfo() {
            return this.routeStrategyInfo;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo setUserGroupInfo(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo userGroupInfo) {
            this.userGroupInfo = userGroupInfo;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoUserGroupInfo getUserGroupInfo() {
            return this.userGroupInfo;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo setZeroTrustPolicyInfo(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo zeroTrustPolicyInfo) {
            this.zeroTrustPolicyInfo = zeroTrustPolicyInfo;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfoZeroTrustPolicyInfo getZeroTrustPolicyInfo() {
            return this.zeroTrustPolicyInfo;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>device offline</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>flow-d918b12f9b974f6489fc</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("NetworkLinkInfo")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo networkLinkInfo;

        @NameInMap("PolicyInfo")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo policyInfo;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskResult build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskResult self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskResult();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult setNetworkLinkInfo(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo networkLinkInfo) {
            this.networkLinkInfo = networkLinkInfo;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultNetworkLinkInfo getNetworkLinkInfo() {
            return this.networkLinkInfo;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult setPolicyInfo(GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo policyInfo) {
            this.policyInfo = policyInfo;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResultPolicyInfo getPolicyInfo() {
            return this.policyInfo;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("RequestContent")
        public String requestContent;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ug-xxxxx</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup self = new GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class GetPADiagnosisTaskResponseBodyDiagnosisTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-17 09:49:03</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>76C08B0F-CEFD-8F01-C1D3-0D5B493B5EAF</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <strong>example:</strong>
         * <p>diag-3e0d36d6c15a0502</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        /**
         * <strong>example:</strong>
         * <p>FullLink</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <strong>example:</strong>
         * <p>mtools-admin.redotpay.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>pop-2504cd067e094750</p>
         */
        @NameInMap("PopId")
        public String popId;

        /**
         * <strong>example:</strong>
         * <p>AutoSelect</p>
         */
        @NameInMap("PopMode")
        public String popMode;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Result")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult result;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UdpExtraConfigs")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs udpExtraConfigs;

        @NameInMap("UserGroup")
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup userGroup;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetPADiagnosisTaskResponseBodyDiagnosisTask build(java.util.Map<String, ?> map) throws Exception {
            GetPADiagnosisTaskResponseBodyDiagnosisTask self = new GetPADiagnosisTaskResponseBodyDiagnosisTask();
            return TeaModel.build(map, self);
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setDiagnoseType(String diagnoseType) {
            this.diagnoseType = diagnoseType;
            return this;
        }
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setPopId(String popId) {
            this.popId = popId;
            return this;
        }
        public String getPopId() {
            return this.popId;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setPopMode(String popMode) {
            this.popMode = popMode;
            return this;
        }
        public String getPopMode() {
            return this.popMode;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setResult(GetPADiagnosisTaskResponseBodyDiagnosisTaskResult result) {
            this.result = result;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskResult getResult() {
            return this.result;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setUdpExtraConfigs(GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs udpExtraConfigs) {
            this.udpExtraConfigs = udpExtraConfigs;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs getUdpExtraConfigs() {
            return this.udpExtraConfigs;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setUserGroup(GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup userGroup) {
            this.userGroup = userGroup;
            return this;
        }
        public GetPADiagnosisTaskResponseBodyDiagnosisTaskUserGroup getUserGroup() {
            return this.userGroup;
        }

        public GetPADiagnosisTaskResponseBodyDiagnosisTask setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginPoolResponseBody extends TeaModel {
    /**
     * <p>Specifies if the origin pool is enabled.</p>
     * <ul>
     * <li><p>true: The origin pool is enabled.</p>
     * </li>
     * <li><p>false: The origin pool is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The origin pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>103852052519****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the origin pool. The name must be unique within a site.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The origins in the origin pool.</p>
     */
    @NameInMap("Origins")
    public java.util.List<GetOriginPoolResponseBodyOrigins> origins;

    /**
     * <p>The domain name assigned to the origin pool. It serves as the origin address for records within the site.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The number of load balancers that reference this origin pool.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ReferenceLBCount")
    public Integer referenceLBCount;

    /**
     * <p>Resources that reference the origin pool. An origin pool is referenced if a load balancer or record uses it as an origin.</p>
     */
    @NameInMap("References")
    public GetOriginPoolResponseBodyReferences references;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the site that contains the origin pool.</p>
     * 
     * <strong>example:</strong>
     * <p>21655860979****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetOriginPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOriginPoolResponseBody self = new GetOriginPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOriginPoolResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetOriginPoolResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetOriginPoolResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOriginPoolResponseBody setOrigins(java.util.List<GetOriginPoolResponseBodyOrigins> origins) {
        this.origins = origins;
        return this;
    }
    public java.util.List<GetOriginPoolResponseBodyOrigins> getOrigins() {
        return this.origins;
    }

    public GetOriginPoolResponseBody setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public GetOriginPoolResponseBody setReferenceLBCount(Integer referenceLBCount) {
        this.referenceLBCount = referenceLBCount;
        return this;
    }
    public Integer getReferenceLBCount() {
        return this.referenceLBCount;
    }

    public GetOriginPoolResponseBody setReferences(GetOriginPoolResponseBodyReferences references) {
        this.references = references;
        return this;
    }
    public GetOriginPoolResponseBodyReferences getReferences() {
        return this.references;
    }

    public GetOriginPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOriginPoolResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class GetOriginPoolResponseBodyOriginsAuthConf extends TeaModel {
        /**
         * <p>The AccessKey ID. This parameter is required if <code>AuthType</code> is set to <code>private_cross_account</code> or <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The authentication type.</p>
         * <ul>
         * <li><p>public: Public access. For OSS or S3 origins with public read access.</p>
         * </li>
         * <li><p>private_same_account: Private, same account. For private OSS origins in the same account.</p>
         * </li>
         * <li><p>private_cross_account: Private, cross-account. For private OSS origins in a different account.</p>
         * </li>
         * <li><p>private: Private. For private S3 origins.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The AWS Region of the origin. Required if the origin is an AWS S3 bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The AccessKey secret. This parameter is required if <code>AuthType</code> is set to <code>private_cross_account</code> or <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeySecret</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature version. Required if the origin is an AWS S3 bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetOriginPoolResponseBodyOriginsAuthConf build(java.util.Map<String, ?> map) throws Exception {
            GetOriginPoolResponseBodyOriginsAuthConf self = new GetOriginPoolResponseBodyOriginsAuthConf();
            return TeaModel.build(map, self);
        }

        public GetOriginPoolResponseBodyOriginsAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetOriginPoolResponseBodyOriginsAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetOriginPoolResponseBodyOriginsAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetOriginPoolResponseBodyOriginsAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public GetOriginPoolResponseBodyOriginsAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetOriginPoolResponseBodyOrigins extends TeaModel {
        /**
         * <p>The origin address. For example, www\.example.com.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The authentication configuration. This parameter is required if the origin is an OSS or S3 bucket that requires authentication.</p>
         */
        @NameInMap("AuthConf")
        public GetOriginPoolResponseBodyOriginsAuthConf authConf;

        /**
         * <p>Specifies if the origin is enabled.</p>
         * <ul>
         * <li><p>true: The origin is enabled.</p>
         * </li>
         * <li><p>false: The origin is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The request header to include in origin requests. Only the Host header is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;Host&quot;: [
         *           &quot;example.com&quot;
         *         ]
         *       }</p>
         */
        @NameInMap("Header")
        public Object header;

        /**
         * <p>The origin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99750209487****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The IP version policy for origin requests.</p>
         * <ul>
         * <li><p>round_robin: Default policy. Routes requests to IPv4 and IPv6 origins on a round-robin basis.</p>
         * </li>
         * <li><p>ipv4_first: Prioritizes IPv4. Routes requests to IPv4 origins first.</p>
         * </li>
         * <li><p>ipv6_first: Prioritizes IPv6. Routes requests to IPv6 origins first.</p>
         * </li>
         * <li><p>follow: Matches the client\&quot;s IP version. The origin request uses the same IP version as the incoming request.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        @NameInMap("IpVersionPolicy")
        public String ipVersionPolicy;

        /**
         * <p>The origin name.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the origin.</p>
         * <ul>
         * <li><p>ip_domain: An IP address or a domain name.</p>
         * </li>
         * <li><p>OSS: An OSS bucket.</p>
         * </li>
         * <li><p>S3: An AWS S3 bucket.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_domain</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin. Must be an integer from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static GetOriginPoolResponseBodyOrigins build(java.util.Map<String, ?> map) throws Exception {
            GetOriginPoolResponseBodyOrigins self = new GetOriginPoolResponseBodyOrigins();
            return TeaModel.build(map, self);
        }

        public GetOriginPoolResponseBodyOrigins setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetOriginPoolResponseBodyOrigins setAuthConf(GetOriginPoolResponseBodyOriginsAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public GetOriginPoolResponseBodyOriginsAuthConf getAuthConf() {
            return this.authConf;
        }

        public GetOriginPoolResponseBodyOrigins setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetOriginPoolResponseBodyOrigins setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public GetOriginPoolResponseBodyOrigins setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOriginPoolResponseBodyOrigins setIpVersionPolicy(String ipVersionPolicy) {
            this.ipVersionPolicy = ipVersionPolicy;
            return this;
        }
        public String getIpVersionPolicy() {
            return this.ipVersionPolicy;
        }

        public GetOriginPoolResponseBodyOrigins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOriginPoolResponseBodyOrigins setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetOriginPoolResponseBodyOrigins setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetOriginPoolResponseBodyReferencesDnsRecords extends TeaModel {
        /**
         * <p>The ID of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>104285288635****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the record.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOriginPoolResponseBodyReferencesDnsRecords build(java.util.Map<String, ?> map) throws Exception {
            GetOriginPoolResponseBodyReferencesDnsRecords self = new GetOriginPoolResponseBodyReferencesDnsRecords();
            return TeaModel.build(map, self);
        }

        public GetOriginPoolResponseBodyReferencesDnsRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOriginPoolResponseBodyReferencesDnsRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOriginPoolResponseBodyReferencesIPARecords extends TeaModel {
        /**
         * <p>The ID of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>104285288635****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>ipa.example.com</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOriginPoolResponseBodyReferencesIPARecords build(java.util.Map<String, ?> map) throws Exception {
            GetOriginPoolResponseBodyReferencesIPARecords self = new GetOriginPoolResponseBodyReferencesIPARecords();
            return TeaModel.build(map, self);
        }

        public GetOriginPoolResponseBodyReferencesIPARecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOriginPoolResponseBodyReferencesIPARecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOriginPoolResponseBodyReferencesLoadBalancers extends TeaModel {
        /**
         * <p>The ID of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>99874066052****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>lb1.example.com</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOriginPoolResponseBodyReferencesLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            GetOriginPoolResponseBodyReferencesLoadBalancers self = new GetOriginPoolResponseBodyReferencesLoadBalancers();
            return TeaModel.build(map, self);
        }

        public GetOriginPoolResponseBodyReferencesLoadBalancers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOriginPoolResponseBodyReferencesLoadBalancers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOriginPoolResponseBodyReferences extends TeaModel {
        /**
         * <p>The Layer 7 records that use this origin pool as their origin.</p>
         */
        @NameInMap("DnsRecords")
        public java.util.List<GetOriginPoolResponseBodyReferencesDnsRecords> dnsRecords;

        /**
         * <p>The Layer 4 records that use this origin pool as their origin.</p>
         */
        @NameInMap("IPARecords")
        public java.util.List<GetOriginPoolResponseBodyReferencesIPARecords> IPARecords;

        /**
         * <p>The load balancers that use this origin pool.</p>
         */
        @NameInMap("LoadBalancers")
        public java.util.List<GetOriginPoolResponseBodyReferencesLoadBalancers> loadBalancers;

        public static GetOriginPoolResponseBodyReferences build(java.util.Map<String, ?> map) throws Exception {
            GetOriginPoolResponseBodyReferences self = new GetOriginPoolResponseBodyReferences();
            return TeaModel.build(map, self);
        }

        public GetOriginPoolResponseBodyReferences setDnsRecords(java.util.List<GetOriginPoolResponseBodyReferencesDnsRecords> dnsRecords) {
            this.dnsRecords = dnsRecords;
            return this;
        }
        public java.util.List<GetOriginPoolResponseBodyReferencesDnsRecords> getDnsRecords() {
            return this.dnsRecords;
        }

        public GetOriginPoolResponseBodyReferences setIPARecords(java.util.List<GetOriginPoolResponseBodyReferencesIPARecords> IPARecords) {
            this.IPARecords = IPARecords;
            return this;
        }
        public java.util.List<GetOriginPoolResponseBodyReferencesIPARecords> getIPARecords() {
            return this.IPARecords;
        }

        public GetOriginPoolResponseBodyReferences setLoadBalancers(java.util.List<GetOriginPoolResponseBodyReferencesLoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public java.util.List<GetOriginPoolResponseBodyReferencesLoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginPoolResponseBody extends TeaModel {
    /**
     * <p>Whether the origin pool is enabled:</p>
     * <ul>
     * <li>true: Enabled;</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Origin pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>103852052519****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Name of the origin pool. The name is unique under a single site.</p>
     * 
     * <strong>example:</strong>
     * <p>pool1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Information about the origins added to the origin pool.</p>
     */
    @NameInMap("Origins")
    public java.util.List<GetOriginPoolResponseBodyOrigins> origins;

    /**
     * <p>The domain name assigned to the origin pool, which can be used as the origin address for records under the site.</p>
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
     * <p>Reference information for the origin pool. The origin pool is considered referenced when it is configured in a load balancer or set as the origin for a record.</p>
     */
    @NameInMap("References")
    public GetOriginPoolResponseBodyReferences references;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>ID of the site to which the origin pool belongs.</p>
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
         * <p>The AccessKey required when AuthType is set to private_cross_account or private.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5tSpj224hDfLmXEx****</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The type of authentication:</p>
         * <ul>
         * <li>public: Public read/write, used when the origin is OSS or S3 and is publicly readable/writable;</li>
         * <li>private_same_account: Private same account, used when the origin is OSS and the authentication type is private within the same account;</li>
         * <li>private_cross_account: Private cross account, used when the origin is OSS and the authentication type is private across accounts;</li>
         * <li>private: Used when the origin is S3 and the authentication type is private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The source Region to be passed when the origin is AWS S3.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey required when AuthType is set to private_cross_account or private.</p>
         * 
         * <strong>example:</strong>
         * <p>tzXL8ub4GtjkjZOJhS****</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature version required when the origin is an AWS S3.</p>
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
         * <p>The address of the origin, e.g., <a href="http://www.example.com">www.example.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Authentication information. When the origin is an OSS or S3, and authentication is required, you need to provide the relevant configuration information.</p>
         */
        @NameInMap("AuthConf")
        public GetOriginPoolResponseBodyOriginsAuthConf authConf;

        /**
         * <p>Whether the origin is enabled:</p>
         * <ul>
         * <li>true: Enabled;</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The request header to be included when fetching from the origin, only supports Host.</p>
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
         * <p>The ID of the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>99750209487****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the origin:</p>
         * <ul>
         * <li>ip_domain: IP or domain type origin;</li>
         * <li>OSS: OSS address origin;</li>
         * <li>S3: AWS S3 origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_domain</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight, an integer between 0 and 100.</p>
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
         * <p>Record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>104285288635****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Record name.</p>
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
         * <p>记录ID。</p>
         * 
         * <strong>example:</strong>
         * <p>104285288635****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Record name.</p>
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
         * <p>ID of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>99874066052****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Name of the load balancer.</p>
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
         * <p>List of layer 7 records using this origin pool as the origin.</p>
         */
        @NameInMap("DnsRecords")
        public java.util.List<GetOriginPoolResponseBodyReferencesDnsRecords> dnsRecords;

        /**
         * <p>List of layer 4 records using this origin pool as the origin.</p>
         */
        @NameInMap("IPARecords")
        public java.util.List<GetOriginPoolResponseBodyReferencesIPARecords> IPARecords;

        /**
         * <p>List of load balancers using this origin pool.</p>
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

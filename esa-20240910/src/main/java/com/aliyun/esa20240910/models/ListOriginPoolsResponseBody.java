// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginPoolsResponseBody extends TeaModel {
    /**
     * <p>List of origin pools.</p>
     */
    @NameInMap("OriginPools")
    public java.util.List<ListOriginPoolsResponseBodyOriginPools> originPools;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListOriginPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOriginPoolsResponseBody self = new ListOriginPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOriginPoolsResponseBody setOriginPools(java.util.List<ListOriginPoolsResponseBodyOriginPools> originPools) {
        this.originPools = originPools;
        return this;
    }
    public java.util.List<ListOriginPoolsResponseBodyOriginPools> getOriginPools() {
        return this.originPools;
    }

    public ListOriginPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOriginPoolsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOriginPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOriginPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOriginPoolsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf extends TeaModel {
        /**
         * <p>The AccessKey required for private authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5tMfEib****ahybCpZqp</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>Authentication type.</p>
         * <ul>
         * <li>public: Public read/write, used when the origin is OSS or S3 and it is set to public read/write;</li>
         * <li>private_same_account: Private same account, used when the origin is OSS and the authentication type is private within the same account;</li>
         * <li>private_cross_account: Private cross-account, used when the origin is OSS and the authentication type is private across accounts;</li>
         * <li>private: Used when the origin is S3 and the authentication type is private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The Region of the origin required when the origin is AWS S3.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey required for private authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2****fgYoZ3nkp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature version required when the origin is AWS S3.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf self = new ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListOriginPoolsResponseBodyOriginPoolsOrigins extends TeaModel {
        /**
         * <p>Origin address, e.g., <a href="http://www.example.com">www.example.com</a>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>Authentication information. When the origin is OSS or S3 and requires authentication, you need to provide related configuration information for authentication.</p>
         */
        @NameInMap("AuthConf")
        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf authConf;

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
         * <p>The request header to be carried during back-to-origin, only supports Host.</p>
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
         * <p>Origin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>997502094872132</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Origin name.</p>
         * 
         * <strong>example:</strong>
         * <p>origin1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Origin type:</p>
         * <ul>
         * <li>ip_domain: IP or domain type origin; </li>
         * <li>OSS: OSS address origin; </li>
         * <li>S3: AWS S3 origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Weight, an integer between 0 and 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListOriginPoolsResponseBodyOriginPoolsOrigins build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPoolsOrigins self = new ListOriginPoolsResponseBodyOriginPoolsOrigins();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setAuthConf(ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf getAuthConf() {
            return this.authConf;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListOriginPoolsResponseBodyOriginPoolsOrigins setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords extends TeaModel {
        /**
         * <p>Record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1042852886352704</p>
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

        public static ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords self = new ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords extends TeaModel {
        /**
         * <p>Record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1042852886352704</p>
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

        public static ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords self = new ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers extends TeaModel {
        /**
         * <p>ID of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>998740660522624</p>
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

        public static ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers self = new ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListOriginPoolsResponseBodyOriginPoolsReferences extends TeaModel {
        /**
         * <p>使用此源地址池为源站的七层记录列表。</p>
         */
        @NameInMap("DnsRecords")
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords> dnsRecords;

        /**
         * <p>List of layer 4 records that use this origin pool as the origin.</p>
         */
        @NameInMap("IPARecords")
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords> IPARecords;

        /**
         * <p>List of load balancers using this origin pool.</p>
         */
        @NameInMap("LoadBalancers")
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers> loadBalancers;

        public static ListOriginPoolsResponseBodyOriginPoolsReferences build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPoolsReferences self = new ListOriginPoolsResponseBodyOriginPoolsReferences();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferences setDnsRecords(java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords> dnsRecords) {
            this.dnsRecords = dnsRecords;
            return this;
        }
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords> getDnsRecords() {
            return this.dnsRecords;
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferences setIPARecords(java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords> IPARecords) {
            this.IPARecords = IPARecords;
            return this;
        }
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords> getIPARecords() {
            return this.IPARecords;
        }

        public ListOriginPoolsResponseBodyOriginPoolsReferences setLoadBalancers(java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesLoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

    }

    public static class ListOriginPoolsResponseBodyOriginPools extends TeaModel {
        /**
         * <p>Whether the origin pool is enabled:</p>
         * <ul>
         * <li>true: Enabled;</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>ID of the origin pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1038520525196928</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Name of the origin pool, unique within a site.</p>
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
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsOrigins> origins;

        /**
         * <p>Domain name assigned to the origin pool, which can be used as the origin address for records under the site.</p>
         * 
         * <strong>example:</strong>
         * <p>pool1.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>Number of load balancers that reference this origin pool.</p>
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
        public ListOriginPoolsResponseBodyOriginPoolsReferences references;

        /**
         * <p>ID of the site to which the origin pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>216558609793952</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        public static ListOriginPoolsResponseBodyOriginPools build(java.util.Map<String, ?> map) throws Exception {
            ListOriginPoolsResponseBodyOriginPools self = new ListOriginPoolsResponseBodyOriginPools();
            return TeaModel.build(map, self);
        }

        public ListOriginPoolsResponseBodyOriginPools setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListOriginPoolsResponseBodyOriginPools setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOriginPoolsResponseBodyOriginPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOriginPoolsResponseBodyOriginPools setOrigins(java.util.List<ListOriginPoolsResponseBodyOriginPoolsOrigins> origins) {
            this.origins = origins;
            return this;
        }
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsOrigins> getOrigins() {
            return this.origins;
        }

        public ListOriginPoolsResponseBodyOriginPools setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListOriginPoolsResponseBodyOriginPools setReferenceLBCount(Integer referenceLBCount) {
            this.referenceLBCount = referenceLBCount;
            return this;
        }
        public Integer getReferenceLBCount() {
            return this.referenceLBCount;
        }

        public ListOriginPoolsResponseBodyOriginPools setReferences(ListOriginPoolsResponseBodyOriginPoolsReferences references) {
            this.references = references;
            return this;
        }
        public ListOriginPoolsResponseBodyOriginPoolsReferences getReferences() {
            return this.references;
        }

        public ListOriginPoolsResponseBodyOriginPools setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

    }

}

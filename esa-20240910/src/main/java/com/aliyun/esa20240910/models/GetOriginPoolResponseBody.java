// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginPoolResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Origins")
    public java.util.List<GetOriginPoolResponseBodyOrigins> origins;

    @NameInMap("RecordName")
    public String recordName;

    @NameInMap("ReferenceLBCount")
    public Integer referenceLBCount;

    @NameInMap("References")
    public GetOriginPoolResponseBodyReferences references;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Region")
        public String region;

        @NameInMap("SecretKey")
        public String secretKey;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("AuthConf")
        public GetOriginPoolResponseBodyOriginsAuthConf authConf;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Header")
        public Object header;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("DnsRecords")
        public java.util.List<GetOriginPoolResponseBodyReferencesDnsRecords> dnsRecords;

        @NameInMap("IPARecords")
        public java.util.List<GetOriginPoolResponseBodyReferencesIPARecords> IPARecords;

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

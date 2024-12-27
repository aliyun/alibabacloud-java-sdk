// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginPoolsResponseBody extends TeaModel {
    @NameInMap("OriginPools")
    public java.util.List<ListOriginPoolsResponseBodyOriginPools> originPools;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("Address")
        public String address;

        @NameInMap("AuthConf")
        public ListOriginPoolsResponseBodyOriginPoolsOriginsAuthConf authConf;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("DnsRecords")
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesDnsRecords> dnsRecords;

        @NameInMap("IPARecords")
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsReferencesIPARecords> IPARecords;

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
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Origins")
        public java.util.List<ListOriginPoolsResponseBodyOriginPoolsOrigins> origins;

        @NameInMap("RecordName")
        public String recordName;

        @NameInMap("ReferenceLBCount")
        public Integer referenceLBCount;

        @NameInMap("References")
        public ListOriginPoolsResponseBodyOriginPoolsReferences references;

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

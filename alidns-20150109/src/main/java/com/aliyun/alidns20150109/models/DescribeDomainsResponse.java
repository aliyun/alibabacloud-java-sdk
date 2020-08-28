// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Domains")
    @Validation(required = true)
    public DescribeDomainsResponseDomains domains;

    public static DescribeDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponse self = new DescribeDomainsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainsResponseDomainsDomainTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeDomainsResponseDomainsDomainTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomainTagsTag self = new DescribeDomainsResponseDomainsDomainTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainsResponseDomainsDomainTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDomainsResponseDomainsDomainTagsTag> tag;

        public static DescribeDomainsResponseDomainsDomainTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomainTags self = new DescribeDomainsResponseDomainsDomainTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainsResponseDomainsDomainDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDomainsResponseDomainsDomainDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomainDnsServers self = new DescribeDomainsResponseDomainsDomainDnsServers();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainsResponseDomainsDomain extends TeaModel {
        @NameInMap("DomainId")
        @Validation(required = true)
        public String domainId;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("PunyCode")
        @Validation(required = true)
        public String punyCode;

        @NameInMap("AliDomain")
        @Validation(required = true)
        public Boolean aliDomain;

        @NameInMap("RecordCount")
        @Validation(required = true)
        public Long recordCount;

        @NameInMap("RegistrantEmail")
        @Validation(required = true)
        public String registrantEmail;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VersionCode")
        @Validation(required = true)
        public String versionCode;

        @NameInMap("VersionName")
        @Validation(required = true)
        public String versionName;

        @NameInMap("InstanceEndTime")
        @Validation(required = true)
        public String instanceEndTime;

        @NameInMap("InstanceExpired")
        @Validation(required = true)
        public Boolean instanceExpired;

        @NameInMap("Starmark")
        @Validation(required = true)
        public Boolean starmark;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDomainsResponseDomainsDomainTags tags;

        @NameInMap("DnsServers")
        @Validation(required = true)
        public DescribeDomainsResponseDomainsDomainDnsServers dnsServers;

        public static DescribeDomainsResponseDomainsDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsDomain self = new DescribeDomainsResponseDomainsDomain();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainsResponseDomains extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public java.util.List<DescribeDomainsResponseDomainsDomain> domain;

        public static DescribeDomainsResponseDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomains self = new DescribeDomainsResponseDomains();
            return TeaModel.build(map, self);
        }

    }

}

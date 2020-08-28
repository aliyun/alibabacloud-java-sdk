// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("MinTtl")
    @Validation(required = true)
    public Long minTtl;

    @NameInMap("RecordLineTreeJson")
    @Validation(required = true)
    public String recordLineTreeJson;

    @NameInMap("LineType")
    @Validation(required = true)
    public String lineType;

    @NameInMap("RegionLines")
    @Validation(required = true)
    public Boolean regionLines;

    @NameInMap("InBlackHole")
    @Validation(required = true)
    public Boolean inBlackHole;

    @NameInMap("InClean")
    @Validation(required = true)
    public Boolean inClean;

    @NameInMap("SlaveDns")
    @Validation(required = true)
    public Boolean slaveDns;

    @NameInMap("RecordLines")
    @Validation(required = true)
    public DescribeDomainInfoResponseRecordLines recordLines;

    @NameInMap("DnsServers")
    @Validation(required = true)
    public DescribeDomainInfoResponseDnsServers dnsServers;

    @NameInMap("AvailableTtls")
    @Validation(required = true)
    public DescribeDomainInfoResponseAvailableTtls availableTtls;

    public static DescribeDomainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainInfoResponse self = new DescribeDomainInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDomainInfoResponseRecordLinesRecordLine extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("FatherCode")
        @Validation(required = true)
        public String fatherCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("LineDisplayName")
        @Validation(required = true)
        public String lineDisplayName;

        public static DescribeDomainInfoResponseRecordLinesRecordLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseRecordLinesRecordLine self = new DescribeDomainInfoResponseRecordLinesRecordLine();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainInfoResponseRecordLines extends TeaModel {
        @NameInMap("RecordLine")
        @Validation(required = true)
        public java.util.List<DescribeDomainInfoResponseRecordLinesRecordLine> recordLine;

        public static DescribeDomainInfoResponseRecordLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseRecordLines self = new DescribeDomainInfoResponseRecordLines();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainInfoResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDomainInfoResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseDnsServers self = new DescribeDomainInfoResponseDnsServers();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDomainInfoResponseAvailableTtls extends TeaModel {
        @NameInMap("AvailableTtl")
        @Validation(required = true)
        public java.util.List<String> availableTtl;

        public static DescribeDomainInfoResponseAvailableTtls build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainInfoResponseAvailableTtls self = new DescribeDomainInfoResponseAvailableTtls();
            return TeaModel.build(map, self);
        }

    }

}

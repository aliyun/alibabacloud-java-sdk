// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VersionCode")
    @Validation(required = true)
    public String versionCode;

    @NameInMap("VersionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("StartTimestamp")
    @Validation(required = true)
    public Long startTimestamp;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("EndTimestamp")
    @Validation(required = true)
    public Long endTimestamp;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("BindCount")
    @Validation(required = true)
    public Long bindCount;

    @NameInMap("BindUsedCount")
    @Validation(required = true)
    public Long bindUsedCount;

    @NameInMap("TTLMinValue")
    @Validation(required = true)
    public Long TTLMinValue;

    @NameInMap("SubDomainLevel")
    @Validation(required = true)
    public Long subDomainLevel;

    @NameInMap("DnsSLBCount")
    @Validation(required = true)
    public Long dnsSLBCount;

    @NameInMap("URLForwardCount")
    @Validation(required = true)
    public Long URLForwardCount;

    @NameInMap("DDosDefendFlow")
    @Validation(required = true)
    public Long DDosDefendFlow;

    @NameInMap("DDosDefendQuery")
    @Validation(required = true)
    public Long DDosDefendQuery;

    @NameInMap("OverseaDDosDefendFlow")
    @Validation(required = true)
    public Long overseaDDosDefendFlow;

    @NameInMap("SearchEngineLines")
    @Validation(required = true)
    public String searchEngineLines;

    @NameInMap("ISPLines")
    @Validation(required = true)
    public String ISPLines;

    @NameInMap("ISPRegionLines")
    @Validation(required = true)
    public String ISPRegionLines;

    @NameInMap("OverseaLine")
    @Validation(required = true)
    public String overseaLine;

    @NameInMap("MonitorNodeCount")
    @Validation(required = true)
    public Long monitorNodeCount;

    @NameInMap("MonitorFrequency")
    @Validation(required = true)
    public Long monitorFrequency;

    @NameInMap("MonitorTaskCount")
    @Validation(required = true)
    public Long monitorTaskCount;

    @NameInMap("RegionLines")
    @Validation(required = true)
    public Boolean regionLines;

    @NameInMap("Gslb")
    @Validation(required = true)
    public Boolean gslb;

    @NameInMap("InClean")
    @Validation(required = true)
    public Boolean inClean;

    @NameInMap("InBlackHole")
    @Validation(required = true)
    public Boolean inBlackHole;

    @NameInMap("BindDomainCount")
    @Validation(required = true)
    public Long bindDomainCount;

    @NameInMap("BindDomainUsedCount")
    @Validation(required = true)
    public Long bindDomainUsedCount;

    @NameInMap("DnsSecurity")
    @Validation(required = true)
    public String dnsSecurity;

    @NameInMap("DnsServers")
    @Validation(required = true)
    public DescribeDnsProductInstanceResponseDnsServers dnsServers;

    public static DescribeDnsProductInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceResponse self = new DescribeDnsProductInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDnsProductInstanceResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDnsProductInstanceResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstanceResponseDnsServers self = new DescribeDnsProductInstanceResponseDnsServers();
            return TeaModel.build(map, self);
        }

    }

}

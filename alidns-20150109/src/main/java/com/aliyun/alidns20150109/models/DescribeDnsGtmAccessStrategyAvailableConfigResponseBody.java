// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    @NameInMap("DomainAddrPools")
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools> domainAddrPools;

    @NameInMap("Ipv4AddrPools")
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools> ipv4AddrPools;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ipv6AddrPools")
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools> ipv6AddrPools;

    @NameInMap("SuggestSetDefaultLine")
    public Boolean suggestSetDefaultLine;

    @NameInMap("Lines")
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines> lines;

    public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyAvailableConfigResponseBody self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setDomainAddrPools(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools> domainAddrPools) {
        this.domainAddrPools = domainAddrPools;
        return this;
    }
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools> getDomainAddrPools() {
        return this.domainAddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setIpv4AddrPools(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools> ipv4AddrPools) {
        this.ipv4AddrPools = ipv4AddrPools;
        return this;
    }
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools> getIpv4AddrPools() {
        return this.ipv4AddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setIpv6AddrPools(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools> ipv6AddrPools) {
        this.ipv6AddrPools = ipv6AddrPools;
        return this;
    }
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools> getIpv6AddrPools() {
        return this.ipv6AddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setSuggestSetDefaultLine(Boolean suggestSetDefaultLine) {
        this.suggestSetDefaultLine = suggestSetDefaultLine;
        return this;
    }
    public Boolean getSuggestSetDefaultLine() {
        return this.suggestSetDefaultLine;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setLines(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines> lines) {
        this.lines = lines;
        return this;
    }
    public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines> getLines() {
        return this.lines;
    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines extends TeaModel {
        @NameInMap("FatherCode")
        public String fatherCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigResponseBody extends TeaModel {
    @NameInMap("SelectedDomainLines")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines selectedDomainLines;

    @NameInMap("DomainAddrPools")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools domainAddrPools;

    @NameInMap("Ipv4AddrPools")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools ipv4AddrPools;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SelectedIpv4Lines")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines selectedIpv4Lines;

    @NameInMap("Ipv6AddrPools")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools ipv6AddrPools;

    @NameInMap("SuggestSetDefaultLine")
    public Boolean suggestSetDefaultLine;

    @NameInMap("SelectedIpv6Lines")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines selectedIpv6Lines;

    @NameInMap("Lines")
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines lines;

    public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyAvailableConfigResponseBody self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setSelectedDomainLines(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines selectedDomainLines) {
        this.selectedDomainLines = selectedDomainLines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines getSelectedDomainLines() {
        return this.selectedDomainLines;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setDomainAddrPools(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools domainAddrPools) {
        this.domainAddrPools = domainAddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools getDomainAddrPools() {
        return this.domainAddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setIpv4AddrPools(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools ipv4AddrPools) {
        this.ipv4AddrPools = ipv4AddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools getIpv4AddrPools() {
        return this.ipv4AddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setSelectedIpv4Lines(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines selectedIpv4Lines) {
        this.selectedIpv4Lines = selectedIpv4Lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines getSelectedIpv4Lines() {
        return this.selectedIpv4Lines;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setIpv6AddrPools(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools ipv6AddrPools) {
        this.ipv6AddrPools = ipv6AddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools getIpv6AddrPools() {
        return this.ipv6AddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setSuggestSetDefaultLine(Boolean suggestSetDefaultLine) {
        this.suggestSetDefaultLine = suggestSetDefaultLine;
        return this;
    }
    public Boolean getSuggestSetDefaultLine() {
        return this.suggestSetDefaultLine;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setSelectedIpv6Lines(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines selectedIpv6Lines) {
        this.selectedIpv6Lines = selectedIpv6Lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines getSelectedIpv6Lines() {
        return this.selectedIpv6Lines;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBody setLines(DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines getLines() {
        return this.lines;
    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines extends TeaModel {
        @NameInMap("SelectedDomainLine")
        public java.util.List<String> selectedDomainLine;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedDomainLines setSelectedDomainLine(java.util.List<String> selectedDomainLine) {
            this.selectedDomainLine = selectedDomainLine;
            return this;
        }
        public java.util.List<String> getSelectedDomainLine() {
            return this.selectedDomainLine;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools extends TeaModel {
        @NameInMap("DomainAddrPool")
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool> domainAddrPool;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPools setDomainAddrPool(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool> domainAddrPool) {
            this.domainAddrPool = domainAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyDomainAddrPoolsDomainAddrPool> getDomainAddrPool() {
            return this.domainAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools extends TeaModel {
        @NameInMap("Ipv4AddrPool")
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool> ipv4AddrPool;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPools setIpv4AddrPool(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool> ipv4AddrPool) {
            this.ipv4AddrPool = ipv4AddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv4AddrPoolsIpv4AddrPool> getIpv4AddrPool() {
            return this.ipv4AddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines extends TeaModel {
        @NameInMap("SelectedIpv4Line")
        public java.util.List<String> selectedIpv4Line;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv4Lines setSelectedIpv4Line(java.util.List<String> selectedIpv4Line) {
            this.selectedIpv4Line = selectedIpv4Line;
            return this;
        }
        public java.util.List<String> getSelectedIpv4Line() {
            return this.selectedIpv4Line;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools extends TeaModel {
        @NameInMap("Ipv6AddrPool")
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool> ipv6AddrPool;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPools setIpv6AddrPool(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool> ipv6AddrPool) {
            this.ipv6AddrPool = ipv6AddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyIpv6AddrPoolsIpv6AddrPool> getIpv6AddrPool() {
            return this.ipv6AddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines extends TeaModel {
        @NameInMap("SelectedIpv6Line")
        public java.util.List<String> selectedIpv6Line;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodySelectedIpv6Lines setSelectedIpv6Line(java.util.List<String> selectedIpv6Line) {
            this.selectedIpv6Line = selectedIpv6Line;
            return this;
        }
        public java.util.List<String> getSelectedIpv6Line() {
            return this.selectedIpv6Line;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine extends TeaModel {
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

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines extends TeaModel {
        @NameInMap("Line")
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine> line;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLines setLine(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseBodyLinesLine> getLine() {
            return this.line;
        }

    }

}

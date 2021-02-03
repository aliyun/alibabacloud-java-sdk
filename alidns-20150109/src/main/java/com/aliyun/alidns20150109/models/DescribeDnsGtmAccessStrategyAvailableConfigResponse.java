// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SuggestSetDefaultLine")
    @Validation(required = true)
    public Boolean suggestSetDefaultLine;

    @NameInMap("Ipv4AddrPools")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools ipv4AddrPools;

    @NameInMap("Lines")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseLines lines;

    @NameInMap("Ipv6AddrPools")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools ipv6AddrPools;

    @NameInMap("DomainAddrPools")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools domainAddrPools;

    @NameInMap("SelectedIpv4Lines")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines selectedIpv4Lines;

    @NameInMap("SelectedIpv6Lines")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines selectedIpv6Lines;

    @NameInMap("SelectedDomainLines")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines selectedDomainLines;

    public static DescribeDnsGtmAccessStrategyAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyAvailableConfigResponse self = new DescribeDnsGtmAccessStrategyAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setSuggestSetDefaultLine(Boolean suggestSetDefaultLine) {
        this.suggestSetDefaultLine = suggestSetDefaultLine;
        return this;
    }
    public Boolean getSuggestSetDefaultLine() {
        return this.suggestSetDefaultLine;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setIpv4AddrPools(DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools ipv4AddrPools) {
        this.ipv4AddrPools = ipv4AddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools getIpv4AddrPools() {
        return this.ipv4AddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setLines(DescribeDnsGtmAccessStrategyAvailableConfigResponseLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseLines getLines() {
        return this.lines;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setIpv6AddrPools(DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools ipv6AddrPools) {
        this.ipv6AddrPools = ipv6AddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools getIpv6AddrPools() {
        return this.ipv6AddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setDomainAddrPools(DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools domainAddrPools) {
        this.domainAddrPools = domainAddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools getDomainAddrPools() {
        return this.domainAddrPools;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setSelectedIpv4Lines(DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines selectedIpv4Lines) {
        this.selectedIpv4Lines = selectedIpv4Lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines getSelectedIpv4Lines() {
        return this.selectedIpv4Lines;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setSelectedIpv6Lines(DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines selectedIpv6Lines) {
        this.selectedIpv6Lines = selectedIpv6Lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines getSelectedIpv6Lines() {
        return this.selectedIpv6Lines;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse setSelectedDomainLines(DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines selectedDomainLines) {
        this.selectedDomainLines = selectedDomainLines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines getSelectedDomainLines() {
        return this.selectedDomainLines;
    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AddrCount")
        @Validation(required = true)
        public Integer addrCount;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools extends TeaModel {
        @NameInMap("Ipv4AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool> ipv4AddrPool;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPools setIpv4AddrPool(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool> ipv4AddrPool) {
            this.ipv4AddrPool = ipv4AddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv4AddrPoolsIpv4AddrPool> getIpv4AddrPool() {
            return this.ipv4AddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("GroupCode")
        @Validation(required = true)
        public String groupCode;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("FatherCode")
        @Validation(required = true)
        public String fatherCode;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine setFatherCode(String fatherCode) {
            this.fatherCode = fatherCode;
            return this;
        }
        public String getFatherCode() {
            return this.fatherCode;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine> line;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseLines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseLines setLine(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseLinesLine> getLine() {
            return this.line;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AddrCount")
        @Validation(required = true)
        public Integer addrCount;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools extends TeaModel {
        @NameInMap("Ipv6AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool> ipv6AddrPool;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPools setIpv6AddrPool(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool> ipv6AddrPool) {
            this.ipv6AddrPool = ipv6AddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseIpv6AddrPoolsIpv6AddrPool> getIpv6AddrPool() {
            return this.ipv6AddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AddrCount")
        @Validation(required = true)
        public Integer addrCount;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools extends TeaModel {
        @NameInMap("DomainAddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool> domainAddrPool;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPools setDomainAddrPool(java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool> domainAddrPool) {
            this.domainAddrPool = domainAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyAvailableConfigResponseDomainAddrPoolsDomainAddrPool> getDomainAddrPool() {
            return this.domainAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines extends TeaModel {
        @NameInMap("SelectedIpv4Line")
        @Validation(required = true)
        public java.util.List<String> selectedIpv4Line;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv4Lines setSelectedIpv4Line(java.util.List<String> selectedIpv4Line) {
            this.selectedIpv4Line = selectedIpv4Line;
            return this;
        }
        public java.util.List<String> getSelectedIpv4Line() {
            return this.selectedIpv4Line;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines extends TeaModel {
        @NameInMap("SelectedIpv6Line")
        @Validation(required = true)
        public java.util.List<String> selectedIpv6Line;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedIpv6Lines setSelectedIpv6Line(java.util.List<String> selectedIpv6Line) {
            this.selectedIpv6Line = selectedIpv6Line;
            return this;
        }
        public java.util.List<String> getSelectedIpv6Line() {
            return this.selectedIpv6Line;
        }

    }

    public static class DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines extends TeaModel {
        @NameInMap("SelectedDomainLine")
        @Validation(required = true)
        public java.util.List<String> selectedDomainLine;

        public static DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines self = new DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyAvailableConfigResponseSelectedDomainLines setSelectedDomainLine(java.util.List<String> selectedDomainLine) {
            this.selectedDomainLine = selectedDomainLine;
            return this;
        }
        public java.util.List<String> getSelectedDomainLine() {
            return this.selectedDomainLine;
        }

    }

}

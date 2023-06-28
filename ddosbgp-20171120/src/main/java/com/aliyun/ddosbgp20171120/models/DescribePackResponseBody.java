// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackResponseBody extends TeaModel {
    @NameInMap("PackInfo")
    public DescribePackResponseBodyPackInfo packInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackResponseBody self = new DescribePackResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackResponseBody setPackInfo(DescribePackResponseBodyPackInfo packInfo) {
        this.packInfo = packInfo;
        return this;
    }
    public DescribePackResponseBodyPackInfo getPackInfo() {
        return this.packInfo;
    }

    public DescribePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePackResponseBodyPackInfoIpList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        public static DescribePackResponseBodyPackInfoIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackResponseBodyPackInfoIpList self = new DescribePackResponseBodyPackInfoIpList();
            return TeaModel.build(map, self);
        }

        public DescribePackResponseBodyPackInfoIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribePackResponseBodyPackInfoPackConfig extends TeaModel {
        @NameInMap("IpAdvanceThre")
        public Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        public Integer ipBasicThre;

        @NameInMap("IpSpec")
        public Integer ipSpec;

        @NameInMap("PackAdvThre")
        public Integer packAdvThre;

        @NameInMap("PackBasicThre")
        public Integer packBasicThre;

        public static DescribePackResponseBodyPackInfoPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePackResponseBodyPackInfoPackConfig self = new DescribePackResponseBodyPackInfoPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribePackResponseBodyPackInfoPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribePackResponseBodyPackInfoPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribePackResponseBodyPackInfoPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

        public DescribePackResponseBodyPackInfoPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribePackResponseBodyPackInfoPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

    }

    public static class DescribePackResponseBodyPackInfo extends TeaModel {
        @NameInMap("AvailableDeleteBlackholeCount")
        public Integer availableDeleteBlackholeCount;

        @NameInMap("IpList")
        public java.util.List<DescribePackResponseBodyPackInfoIpList> ipList;

        @NameInMap("PackConfig")
        public DescribePackResponseBodyPackInfoPackConfig packConfig;

        @NameInMap("Region")
        public String region;

        public static DescribePackResponseBodyPackInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePackResponseBodyPackInfo self = new DescribePackResponseBodyPackInfo();
            return TeaModel.build(map, self);
        }

        public DescribePackResponseBodyPackInfo setAvailableDeleteBlackholeCount(Integer availableDeleteBlackholeCount) {
            this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
            return this;
        }
        public Integer getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        public DescribePackResponseBodyPackInfo setIpList(java.util.List<DescribePackResponseBodyPackInfoIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribePackResponseBodyPackInfoIpList> getIpList() {
            return this.ipList;
        }

        public DescribePackResponseBodyPackInfo setPackConfig(DescribePackResponseBodyPackInfoPackConfig packConfig) {
            this.packConfig = packConfig;
            return this;
        }
        public DescribePackResponseBodyPackInfoPackConfig getPackConfig() {
            return this.packConfig;
        }

        public DescribePackResponseBodyPackInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}

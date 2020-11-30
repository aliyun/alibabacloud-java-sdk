// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribePackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PackInfo")
    @Validation(required = true)
    public DescribePackResponsePackInfo packInfo;

    public static DescribePackResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackResponse self = new DescribePackResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackResponse setPackInfo(DescribePackResponsePackInfo packInfo) {
        this.packInfo = packInfo;
        return this;
    }
    public DescribePackResponsePackInfo getPackInfo() {
        return this.packInfo;
    }

    public static class DescribePackResponsePackInfoIpList extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        public static DescribePackResponsePackInfoIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackResponsePackInfoIpList self = new DescribePackResponsePackInfoIpList();
            return TeaModel.build(map, self);
        }

        public DescribePackResponsePackInfoIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribePackResponsePackInfoPackConfig extends TeaModel {
        @NameInMap("PackAdvThre")
        @Validation(required = true)
        public Integer packAdvThre;

        @NameInMap("IpAdvanceThre")
        @Validation(required = true)
        public Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        @Validation(required = true)
        public Integer ipBasicThre;

        @NameInMap("PackBasicThre")
        @Validation(required = true)
        public Integer packBasicThre;

        @NameInMap("IpSpec")
        @Validation(required = true)
        public Integer ipSpec;

        public static DescribePackResponsePackInfoPackConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePackResponsePackInfoPackConfig self = new DescribePackResponsePackInfoPackConfig();
            return TeaModel.build(map, self);
        }

        public DescribePackResponsePackInfoPackConfig setPackAdvThre(Integer packAdvThre) {
            this.packAdvThre = packAdvThre;
            return this;
        }
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        public DescribePackResponsePackInfoPackConfig setIpAdvanceThre(Integer ipAdvanceThre) {
            this.ipAdvanceThre = ipAdvanceThre;
            return this;
        }
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        public DescribePackResponsePackInfoPackConfig setIpBasicThre(Integer ipBasicThre) {
            this.ipBasicThre = ipBasicThre;
            return this;
        }
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        public DescribePackResponsePackInfoPackConfig setPackBasicThre(Integer packBasicThre) {
            this.packBasicThre = packBasicThre;
            return this;
        }
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

        public DescribePackResponsePackInfoPackConfig setIpSpec(Integer ipSpec) {
            this.ipSpec = ipSpec;
            return this;
        }
        public Integer getIpSpec() {
            return this.ipSpec;
        }

    }

    public static class DescribePackResponsePackInfo extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("AvailableDeleteBlackholeCount")
        @Validation(required = true)
        public Integer availableDeleteBlackholeCount;

        @NameInMap("IpList")
        @Validation(required = true)
        public java.util.List<DescribePackResponsePackInfoIpList> ipList;

        @NameInMap("PackConfig")
        @Validation(required = true)
        public DescribePackResponsePackInfoPackConfig packConfig;

        public static DescribePackResponsePackInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePackResponsePackInfo self = new DescribePackResponsePackInfo();
            return TeaModel.build(map, self);
        }

        public DescribePackResponsePackInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribePackResponsePackInfo setAvailableDeleteBlackholeCount(Integer availableDeleteBlackholeCount) {
            this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
            return this;
        }
        public Integer getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        public DescribePackResponsePackInfo setIpList(java.util.List<DescribePackResponsePackInfoIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribePackResponsePackInfoIpList> getIpList() {
            return this.ipList;
        }

        public DescribePackResponsePackInfo setPackConfig(DescribePackResponsePackInfoPackConfig packConfig) {
            this.packConfig = packConfig;
            return this;
        }
        public DescribePackResponsePackInfoPackConfig getPackConfig() {
            return this.packConfig;
        }

    }

}

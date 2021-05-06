// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenPrivateZoneRoutesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrivateZoneDnsServers")
    public String privateZoneDnsServers;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PrivateZoneInfos")
    public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos privateZoneInfos;

    public static DescribeCenPrivateZoneRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenPrivateZoneRoutesResponseBody self = new DescribeCenPrivateZoneRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenPrivateZoneRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPrivateZoneDnsServers(String privateZoneDnsServers) {
        this.privateZoneDnsServers = privateZoneDnsServers;
        return this;
    }
    public String getPrivateZoneDnsServers() {
        return this.privateZoneDnsServers;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPrivateZoneInfos(DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos privateZoneInfos) {
        this.privateZoneInfos = privateZoneInfos;
        return this;
    }
    public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos getPrivateZoneInfos() {
        return this.privateZoneInfos;
    }

    public static class DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AccessRegionId")
        public String accessRegionId;

        @NameInMap("HostRegionId")
        public String hostRegionId;

        @NameInMap("HostVpcId")
        public String hostVpcId;

        public static DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo self = new DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo setAccessRegionId(String accessRegionId) {
            this.accessRegionId = accessRegionId;
            return this;
        }
        public String getAccessRegionId() {
            return this.accessRegionId;
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo setHostRegionId(String hostRegionId) {
            this.hostRegionId = hostRegionId;
            return this;
        }
        public String getHostRegionId() {
            return this.hostRegionId;
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo setHostVpcId(String hostVpcId) {
            this.hostVpcId = hostVpcId;
            return this;
        }
        public String getHostVpcId() {
            return this.hostVpcId;
        }

    }

    public static class DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos extends TeaModel {
        @NameInMap("PrivateZoneInfo")
        public java.util.List<DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo> privateZoneInfo;

        public static DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos self = new DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos setPrivateZoneInfo(java.util.List<DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo> privateZoneInfo) {
            this.privateZoneInfo = privateZoneInfo;
            return this;
        }
        public java.util.List<DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfosPrivateZoneInfo> getPrivateZoneInfo() {
            return this.privateZoneInfo;
        }

    }

}

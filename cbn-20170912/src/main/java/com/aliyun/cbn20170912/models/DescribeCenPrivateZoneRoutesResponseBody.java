// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenPrivateZoneRoutesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateZoneInfos")
    public java.util.List<DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos> privateZoneInfos;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("PrivateZoneDnsServers")
    public String privateZoneDnsServers;

    public static DescribeCenPrivateZoneRoutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenPrivateZoneRoutesResponseBody self = new DescribeCenPrivateZoneRoutesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenPrivateZoneRoutesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPrivateZoneInfos(java.util.List<DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos> privateZoneInfos) {
        this.privateZoneInfos = privateZoneInfos;
        return this;
    }
    public java.util.List<DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos> getPrivateZoneInfos() {
        return this.privateZoneInfos;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenPrivateZoneRoutesResponseBody setPrivateZoneDnsServers(String privateZoneDnsServers) {
        this.privateZoneDnsServers = privateZoneDnsServers;
        return this;
    }
    public String getPrivateZoneDnsServers() {
        return this.privateZoneDnsServers;
    }

    public static class DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("HostVpcId")
        public String hostVpcId;

        @NameInMap("AccessRegionId")
        public String accessRegionId;

        @NameInMap("HostRegionId")
        public String hostRegionId;

        public static DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos self = new DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos setHostVpcId(String hostVpcId) {
            this.hostVpcId = hostVpcId;
            return this;
        }
        public String getHostVpcId() {
            return this.hostVpcId;
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos setAccessRegionId(String accessRegionId) {
            this.accessRegionId = accessRegionId;
            return this;
        }
        public String getAccessRegionId() {
            return this.accessRegionId;
        }

        public DescribeCenPrivateZoneRoutesResponseBodyPrivateZoneInfos setHostRegionId(String hostRegionId) {
            this.hostRegionId = hostRegionId;
            return this;
        }
        public String getHostRegionId() {
            return this.hostRegionId;
        }

    }

}

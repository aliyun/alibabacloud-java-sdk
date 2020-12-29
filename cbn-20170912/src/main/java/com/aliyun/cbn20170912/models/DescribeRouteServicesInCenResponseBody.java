// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteServicesInCenResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouteServiceEntries")
    public java.util.List<DescribeRouteServicesInCenResponseBodyRouteServiceEntries> routeServiceEntries;

    public static DescribeRouteServicesInCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteServicesInCenResponseBody self = new DescribeRouteServicesInCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteServicesInCenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteServicesInCenResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteServicesInCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteServicesInCenResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteServicesInCenResponseBody setRouteServiceEntries(java.util.List<DescribeRouteServicesInCenResponseBodyRouteServiceEntries> routeServiceEntries) {
        this.routeServiceEntries = routeServiceEntries;
        return this;
    }
    public java.util.List<DescribeRouteServicesInCenResponseBodyRouteServiceEntries> getRouteServiceEntries() {
        return this.routeServiceEntries;
    }

    public static class DescribeRouteServicesInCenResponseBodyRouteServiceEntries extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Host")
        public String host;

        @NameInMap("Description")
        public String description;

        @NameInMap("HostVpcId")
        public String hostVpcId;

        @NameInMap("Cidrs")
        public java.util.List<String> cidrs;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("AccessRegionId")
        public String accessRegionId;

        @NameInMap("HostRegionId")
        public String hostRegionId;

        @NameInMap("UpdateInterval")
        public String updateInterval;

        public static DescribeRouteServicesInCenResponseBodyRouteServiceEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteServicesInCenResponseBodyRouteServiceEntries self = new DescribeRouteServicesInCenResponseBodyRouteServiceEntries();
            return TeaModel.build(map, self);
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setHostVpcId(String hostVpcId) {
            this.hostVpcId = hostVpcId;
            return this;
        }
        public String getHostVpcId() {
            return this.hostVpcId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setCidrs(java.util.List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public java.util.List<String> getCidrs() {
            return this.cidrs;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setAccessRegionId(String accessRegionId) {
            this.accessRegionId = accessRegionId;
            return this;
        }
        public String getAccessRegionId() {
            return this.accessRegionId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setHostRegionId(String hostRegionId) {
            this.hostRegionId = hostRegionId;
            return this;
        }
        public String getHostRegionId() {
            return this.hostRegionId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setUpdateInterval(String updateInterval) {
            this.updateInterval = updateInterval;
            return this;
        }
        public String getUpdateInterval() {
            return this.updateInterval;
        }

    }

}

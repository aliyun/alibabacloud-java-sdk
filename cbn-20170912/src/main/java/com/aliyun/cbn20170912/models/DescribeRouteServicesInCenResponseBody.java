// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteServicesInCenResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the cloud services.</p>
     */
    @NameInMap("RouteServiceEntries")
    public DescribeRouteServicesInCenResponseBodyRouteServiceEntries routeServiceEntries;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRouteServicesInCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteServicesInCenResponseBody self = new DescribeRouteServicesInCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteServicesInCenResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeRouteServicesInCenResponseBody setRouteServiceEntries(DescribeRouteServicesInCenResponseBodyRouteServiceEntries routeServiceEntries) {
        this.routeServiceEntries = routeServiceEntries;
        return this;
    }
    public DescribeRouteServicesInCenResponseBodyRouteServiceEntries getRouteServiceEntries() {
        return this.routeServiceEntries;
    }

    public DescribeRouteServicesInCenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs extends TeaModel {
        @NameInMap("Cidr")
        public java.util.List<String> cidr;

        public static DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs self = new DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs setCidr(java.util.List<String> cidr) {
            this.cidr = cidr;
            return this;
        }
        public java.util.List<String> getCidr() {
            return this.cidr;
        }

    }

    public static class DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry extends TeaModel {
        /**
         * <p>The ID of the region where the cloud service is accessed.</p>
         */
        @NameInMap("AccessRegionId")
        public String accessRegionId;

        /**
         * <p>The ID of the CEN instance.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The service addresses of the cloud service.</p>
         */
        @NameInMap("Cidrs")
        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs cidrs;

        /**
         * <p>The description of the cloud service.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The service address of the cloud service.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The region ID of the cloud service.</p>
         */
        @NameInMap("HostRegionId")
        public String hostRegionId;

        /**
         * <p>The ID of the VPC associated with the cloud service.</p>
         */
        @NameInMap("HostVpcId")
        public String hostVpcId;

        /**
         * <p>The status of the cloud service. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Active**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry self = new DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setAccessRegionId(String accessRegionId) {
            this.accessRegionId = accessRegionId;
            return this;
        }
        public String getAccessRegionId() {
            return this.accessRegionId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setCidrs(DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntryCidrs getCidrs() {
            return this.cidrs;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setHostRegionId(String hostRegionId) {
            this.hostRegionId = hostRegionId;
            return this;
        }
        public String getHostRegionId() {
            return this.hostRegionId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setHostVpcId(String hostVpcId) {
            this.hostVpcId = hostVpcId;
            return this;
        }
        public String getHostVpcId() {
            return this.hostVpcId;
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRouteServicesInCenResponseBodyRouteServiceEntries extends TeaModel {
        @NameInMap("RouteServiceEntry")
        public java.util.List<DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry> routeServiceEntry;

        public static DescribeRouteServicesInCenResponseBodyRouteServiceEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteServicesInCenResponseBodyRouteServiceEntries self = new DescribeRouteServicesInCenResponseBodyRouteServiceEntries();
            return TeaModel.build(map, self);
        }

        public DescribeRouteServicesInCenResponseBodyRouteServiceEntries setRouteServiceEntry(java.util.List<DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry> routeServiceEntry) {
            this.routeServiceEntry = routeServiceEntry;
            return this;
        }
        public java.util.List<DescribeRouteServicesInCenResponseBodyRouteServiceEntriesRouteServiceEntry> getRouteServiceEntry() {
            return this.routeServiceEntry;
        }

    }

}

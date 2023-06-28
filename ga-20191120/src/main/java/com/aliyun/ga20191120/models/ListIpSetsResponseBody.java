// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIpSetsResponseBody extends TeaModel {
    /**
     * <p>Details of the acceleration regions.</p>
     */
    @NameInMap("IpSets")
    public java.util.List<ListIpSetsResponseBodyIpSets> ipSets;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpSetsResponseBody self = new ListIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpSetsResponseBody setIpSets(java.util.List<ListIpSetsResponseBodyIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<ListIpSetsResponseBodyIpSets> getIpSets() {
        return this.ipSets;
    }

    public ListIpSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIpSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIpSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpSetsResponseBodyIpSets extends TeaModel {
        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth that is allocated to the acceleration region. Unit: **Mbit/s**.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The list of accelerated IP addresses in the acceleration region.</p>
         */
        @NameInMap("IpAddressList")
        public java.util.List<String> ipAddressList;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The version of the IP protocol. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines.</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.</p>
         * <br>
         * <p>If you are allowed to use single-ISP bandwidth, you can also specify one of the following values:</p>
         * <br>
         * <p>*   **ChinaTelecom**: China Telecom (single ISP)</p>
         * <p>*   **ChinaUnicom**: China Unicom (single ISP)</p>
         * <p>*   **ChinaMobile**: China Mobile (single ISP)</p>
         * <p>*   **ChinaTelecom_L2**: China Telecom \_L2 (single ISP)</p>
         * <p>*   **ChinaUnicom_L2**: China Unicom \_L2 (single ISP)</p>
         * <p>*   **ChinaMobile_L2**: China Mobile \_L2 (single ISP)</p>
         * <br>
         * <p>> Different acceleration regions support different single-ISP BGP lines.</p>
         */
        @NameInMap("IspType")
        public String ispType;

        /**
         * <p>The status of the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **init**: The acceleration region is being initialized.</p>
         * <p>*   **active**: The acceleration region is running.</p>
         * <p>*   **updating**: The acceleration region is being configured.</p>
         * <p>*   **deleting**: The acceleration region is being deleted.</p>
         */
        @NameInMap("State")
        public String state;

        public static ListIpSetsResponseBodyIpSets build(java.util.Map<String, ?> map) throws Exception {
            ListIpSetsResponseBodyIpSets self = new ListIpSetsResponseBodyIpSets();
            return TeaModel.build(map, self);
        }

        public ListIpSetsResponseBodyIpSets setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public ListIpSetsResponseBodyIpSets setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListIpSetsResponseBodyIpSets setIpAddressList(java.util.List<String> ipAddressList) {
            this.ipAddressList = ipAddressList;
            return this;
        }
        public java.util.List<String> getIpAddressList() {
            return this.ipAddressList;
        }

        public ListIpSetsResponseBodyIpSets setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public ListIpSetsResponseBodyIpSets setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListIpSetsResponseBodyIpSets setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

        public ListIpSetsResponseBodyIpSets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}

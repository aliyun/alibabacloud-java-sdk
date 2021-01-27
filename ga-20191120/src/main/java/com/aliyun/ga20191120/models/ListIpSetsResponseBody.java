// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIpSetsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("IpSets")
    public java.util.List<ListIpSetsResponseBodyIpSets> ipSets;

    public static ListIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpSetsResponseBody self = new ListIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListIpSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIpSetsResponseBody setIpSets(java.util.List<ListIpSetsResponseBodyIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<ListIpSetsResponseBodyIpSets> getIpSets() {
        return this.ipSets;
    }

    public static class ListIpSetsResponseBodyIpSets extends TeaModel {
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("State")
        public String state;

        @NameInMap("IpSetId")
        public String ipSetId;

        @NameInMap("IpAddressList")
        public java.util.List<String> ipAddressList;

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

        public ListIpSetsResponseBodyIpSets setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListIpSetsResponseBodyIpSets setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListIpSetsResponseBodyIpSets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListIpSetsResponseBodyIpSets setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public ListIpSetsResponseBodyIpSets setIpAddressList(java.util.List<String> ipAddressList) {
            this.ipAddressList = ipAddressList;
            return this;
        }
        public java.util.List<String> getIpAddressList() {
            return this.ipAddressList;
        }

    }

}

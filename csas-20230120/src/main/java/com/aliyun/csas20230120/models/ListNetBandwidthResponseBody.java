// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNetBandwidthResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of bandwidth configurations.</p>
     */
    @NameInMap("NetBandwidthList")
    public java.util.List<ListNetBandwidthResponseBodyNetBandwidthList> netBandwidthList;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListNetBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetBandwidthResponseBody self = new ListNetBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetBandwidthResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListNetBandwidthResponseBody setNetBandwidthList(java.util.List<ListNetBandwidthResponseBodyNetBandwidthList> netBandwidthList) {
        this.netBandwidthList = netBandwidthList;
        return this;
    }
    public java.util.List<ListNetBandwidthResponseBodyNetBandwidthList> getNetBandwidthList() {
        return this.netBandwidthList;
    }

    public ListNetBandwidthResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNetBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNetBandwidthResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListNetBandwidthResponseBodyNetBandwidthList extends TeaModel {
        /**
         * <p>The bandwidth value, in Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01 10:20:30</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-02 15:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>production-vpc</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        public static ListNetBandwidthResponseBodyNetBandwidthList build(java.util.Map<String, ?> map) throws Exception {
            ListNetBandwidthResponseBodyNetBandwidthList self = new ListNetBandwidthResponseBodyNetBandwidthList();
            return TeaModel.build(map, self);
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public ListNetBandwidthResponseBodyNetBandwidthList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}

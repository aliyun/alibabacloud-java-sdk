// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeConfiguredDestinationIPResponseBody extends TeaModel {
    @NameInMap("Destinations")
    public java.util.List<DescribeConfiguredDestinationIPResponseBodyDestinations> destinations;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>F0AE91F8-E6C5-50D4-983F-FC53672****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeConfiguredDestinationIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfiguredDestinationIPResponseBody self = new DescribeConfiguredDestinationIPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfiguredDestinationIPResponseBody setDestinations(java.util.List<DescribeConfiguredDestinationIPResponseBodyDestinations> destinations) {
        this.destinations = destinations;
        return this;
    }
    public java.util.List<DescribeConfiguredDestinationIPResponseBodyDestinations> getDestinations() {
        return this.destinations;
    }

    public DescribeConfiguredDestinationIPResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeConfiguredDestinationIPResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConfiguredDestinationIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfiguredDestinationIPResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeConfiguredDestinationIPResponseBodyDestinations extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("DestinationIP")
        public String destinationIP;

        @NameInMap("DestinationISP")
        public String destinationISP;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("DestinationRegion")
        public String destinationRegion;

        /**
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        @NameInMap("OperationTime")
        public Integer operationTime;

        public static DescribeConfiguredDestinationIPResponseBodyDestinations build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfiguredDestinationIPResponseBodyDestinations self = new DescribeConfiguredDestinationIPResponseBodyDestinations();
            return TeaModel.build(map, self);
        }

        public DescribeConfiguredDestinationIPResponseBodyDestinations setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeConfiguredDestinationIPResponseBodyDestinations setDestinationIP(String destinationIP) {
            this.destinationIP = destinationIP;
            return this;
        }
        public String getDestinationIP() {
            return this.destinationIP;
        }

        public DescribeConfiguredDestinationIPResponseBodyDestinations setDestinationISP(String destinationISP) {
            this.destinationISP = destinationISP;
            return this;
        }
        public String getDestinationISP() {
            return this.destinationISP;
        }

        public DescribeConfiguredDestinationIPResponseBodyDestinations setDestinationRegion(String destinationRegion) {
            this.destinationRegion = destinationRegion;
            return this;
        }
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        public DescribeConfiguredDestinationIPResponseBodyDestinations setOperationTime(Integer operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public Integer getOperationTime() {
            return this.operationTime;
        }

    }

}

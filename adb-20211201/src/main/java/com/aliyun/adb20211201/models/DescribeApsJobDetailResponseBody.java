// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsJobDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("APSJobDetail")
    public DescribeApsJobDetailResponseBodyAPSJobDetail APSJobDetail;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>-E606-4A42-BF6D-</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApsJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsJobDetailResponseBody self = new DescribeApsJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsJobDetailResponseBody setAPSJobDetail(DescribeApsJobDetailResponseBodyAPSJobDetail APSJobDetail) {
        this.APSJobDetail = APSJobDetail;
        return this;
    }
    public DescribeApsJobDetailResponseBodyAPSJobDetail getAPSJobDetail() {
        return this.APSJobDetail;
    }

    public DescribeApsJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApsJobDetailResponseBodyAPSJobDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("DbList")
        public String dbList;

        /**
         * <strong>example:</strong>
         * <p>amv-******</p>
         */
        @NameInMap("DestinationEndpointInstanceID")
        public String destinationEndpointInstanceID;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("DestinationEndpointRegion")
        public String destinationEndpointRegion;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PartitionList")
        public String partitionList;

        /**
         * <strong>example:</strong>
         * <p>pc-*******</p>
         */
        @NameInMap("SourceEndpointInstanceID")
        public String sourceEndpointInstanceID;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceEndpointRegion")
        public String sourceEndpointRegion;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TargetTableMode")
        public String targetTableMode;

        public static DescribeApsJobDetailResponseBodyAPSJobDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsJobDetailResponseBodyAPSJobDetail self = new DescribeApsJobDetailResponseBodyAPSJobDetail();
            return TeaModel.build(map, self);
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setDbList(String dbList) {
            this.dbList = dbList;
            return this;
        }
        public String getDbList() {
            return this.dbList;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
            this.destinationEndpointInstanceID = destinationEndpointInstanceID;
            return this;
        }
        public String getDestinationEndpointInstanceID() {
            return this.destinationEndpointInstanceID;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setDestinationEndpointRegion(String destinationEndpointRegion) {
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }
        public String getDestinationEndpointRegion() {
            return this.destinationEndpointRegion;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setPartitionList(String partitionList) {
            this.partitionList = partitionList;
            return this;
        }
        public String getPartitionList() {
            return this.partitionList;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setSourceEndpointRegion(String sourceEndpointRegion) {
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }
        public String getSourceEndpointRegion() {
            return this.sourceEndpointRegion;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApsJobDetailResponseBodyAPSJobDetail setTargetTableMode(String targetTableMode) {
            this.targetTableMode = targetTableMode;
            return this;
        }
        public String getTargetTableMode() {
            return this.targetTableMode;
        }

    }

}

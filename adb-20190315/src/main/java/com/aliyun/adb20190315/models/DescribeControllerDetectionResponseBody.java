// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeControllerDetectionResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried detection items and detection results.</p>
     */
    @NameInMap("DetectionItems")
    public java.util.List<DescribeControllerDetectionResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9856CFD-10DC-50AF-AE29-07C30FC57B86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeControllerDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeControllerDetectionResponseBody self = new DescribeControllerDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeControllerDetectionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeControllerDetectionResponseBody setDetectionItems(java.util.List<DescribeControllerDetectionResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeControllerDetectionResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeControllerDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeControllerDetectionResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeControllerDetectionResponseBodyDetectionItems extends TeaModel {
        /**
         * <p>The information about the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>A CPU increase is detected on the access node.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the detection item.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU increase detection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The severity level of the detection result. Valid values:</p>
         * <ul>
         * <li>NORMAL</li>
         * <li>WARNING</li>
         * <li>CRITICAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL
         * WARNING
         * CRITICAL</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeControllerDetectionResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeControllerDetectionResponseBodyDetectionItems self = new DescribeControllerDetectionResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeControllerDetectionResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeControllerDetectionResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeControllerDetectionResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeControllerDetectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>amv-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DetectionItems")
    public java.util.List<DescribeControllerDetectionResponseBodyDetectionItems> detectionItems;

    /**
     * <strong>example:</strong>
     * <p>257FAE29-ED5F-586C-94E4-43BD1392F238</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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
        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        /**
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

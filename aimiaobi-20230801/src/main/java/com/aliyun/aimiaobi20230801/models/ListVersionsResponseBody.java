// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListVersionsResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public java.util.List<ListVersionsResponseBodyData> data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>数据不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates success: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponseBody self = new ListVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVersionsResponseBody setData(java.util.List<ListVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVersionsResponseBodyData extends TeaModel {
        /**
         * <p>Concurrency</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("ConcurrentCount")
        public Integer concurrentCount;

        /**
         * <p>Service expiration time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23 02:00:34</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Number of instances</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp12pismsw4v3tzhf62p1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Order ID</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>Version type (TRIAL: trial edition, STANDARD: Standard Edition, CUSTOMIZE: custom edition)</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMIZE</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>Trial edition quota</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("Quota")
        public Integer quota;

        /**
         * <p>Service start time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-27 04:11:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Trial edition usage count</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("UseQuota")
        public Integer useQuota;

        /**
         * <p>Version details</p>
         * 
         * <strong>example:</strong>
         * <p>标准版-公共并发：1并发</p>
         */
        @NameInMap("VersionDetail")
        public String versionDetail;

        /**
         * <p>Version</p>
         * 
         * <strong>example:</strong>
         * <p>试用版</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <p>Validity status: 0 indicates active, 1 indicates expired (go to the renewal page), and 2 indicates unavailable (go to the purchase page)</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("VersionStatus")
        public Integer versionStatus;

        public static ListVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseBodyData self = new ListVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseBodyData setConcurrentCount(Integer concurrentCount) {
            this.concurrentCount = concurrentCount;
            return this;
        }
        public Integer getConcurrentCount() {
            return this.concurrentCount;
        }

        public ListVersionsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListVersionsResponseBodyData setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public ListVersionsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVersionsResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListVersionsResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListVersionsResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public ListVersionsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListVersionsResponseBodyData setUseQuota(Integer useQuota) {
            this.useQuota = useQuota;
            return this;
        }
        public Integer getUseQuota() {
            return this.useQuota;
        }

        public ListVersionsResponseBodyData setVersionDetail(String versionDetail) {
            this.versionDetail = versionDetail;
            return this;
        }
        public String getVersionDetail() {
            return this.versionDetail;
        }

        public ListVersionsResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListVersionsResponseBodyData setVersionStatus(Integer versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public Integer getVersionStatus() {
            return this.versionStatus;
        }

    }

}

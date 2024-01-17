// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListVersionsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ConcurrentCount")
        public Integer concurrentCount;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Quota")
        public Integer quota;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UseQuota")
        public Integer useQuota;

        @NameInMap("VersionDetail")
        public String versionDetail;

        @NameInMap("VersionName")
        public String versionName;

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

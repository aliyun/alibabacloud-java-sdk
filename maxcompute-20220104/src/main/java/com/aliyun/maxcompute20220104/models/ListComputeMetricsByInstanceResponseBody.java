// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsByInstanceResponseBody extends TeaModel {
    @NameInMap("data")
    public ListComputeMetricsByInstanceResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    public static ListComputeMetricsByInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsByInstanceResponseBody self = new ListComputeMetricsByInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsByInstanceResponseBody setData(ListComputeMetricsByInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComputeMetricsByInstanceResponseBodyData getData() {
        return this.data;
    }

    public ListComputeMetricsByInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListComputeMetricsByInstanceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListComputeMetricsByInstanceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListComputeMetricsByInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics extends TeaModel {
        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("jobOwner")
        public String jobOwner;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("signature")
        public String signature;

        @NameInMap("specCode")
        public String specCode;

        @NameInMap("submitTime")
        public Long submitTime;

        @NameInMap("type")
        public String type;

        @NameInMap("unit")
        public String unit;

        @NameInMap("usage")
        public Double usage;

        public static ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics self = new ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setJobOwner(String jobOwner) {
            this.jobOwner = jobOwner;
            return this;
        }
        public String getJobOwner() {
            return this.jobOwner;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics setUsage(Double usage) {
            this.usage = usage;
            return this;
        }
        public Double getUsage() {
            return this.usage;
        }

    }

    public static class ListComputeMetricsByInstanceResponseBodyData extends TeaModel {
        @NameInMap("instanceComputeMetrics")
        public java.util.List<ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics> instanceComputeMetrics;

        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("totalCount")
        public Long totalCount;

        public static ListComputeMetricsByInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeMetricsByInstanceResponseBodyData self = new ListComputeMetricsByInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeMetricsByInstanceResponseBodyData setInstanceComputeMetrics(java.util.List<ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics> instanceComputeMetrics) {
            this.instanceComputeMetrics = instanceComputeMetrics;
            return this;
        }
        public java.util.List<ListComputeMetricsByInstanceResponseBodyDataInstanceComputeMetrics> getInstanceComputeMetrics() {
            return this.instanceComputeMetrics;
        }

        public ListComputeMetricsByInstanceResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListComputeMetricsByInstanceResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListComputeMetricsByInstanceResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

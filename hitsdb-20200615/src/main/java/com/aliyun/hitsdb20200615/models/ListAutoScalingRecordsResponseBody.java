// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListAutoScalingRecordsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAutoScalingRecordsResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAutoScalingRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRecordsResponseBody self = new ListAutoScalingRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRecordsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAutoScalingRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoScalingRecordsResponseBody setData(ListAutoScalingRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAutoScalingRecordsResponseBodyData getData() {
        return this.data;
    }

    public ListAutoScalingRecordsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAutoScalingRecordsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAutoScalingRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAutoScalingRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoScalingRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoScalingRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAutoScalingRecordsResponseBodyDataScaleRecords extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SpecGroupId")
        public String specGroupId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Strategy")
        public String strategy;

        @NameInMap("TargetValue")
        public String targetValue;

        public static ListAutoScalingRecordsResponseBodyDataScaleRecords build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingRecordsResponseBodyDataScaleRecords self = new ListAutoScalingRecordsResponseBodyDataScaleRecords();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setSpecGroupId(String specGroupId) {
            this.specGroupId = specGroupId;
            return this;
        }
        public String getSpecGroupId() {
            return this.specGroupId;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public ListAutoScalingRecordsResponseBodyDataScaleRecords setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

    public static class ListAutoScalingRecordsResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ScaleRecords")
        public java.util.List<ListAutoScalingRecordsResponseBodyDataScaleRecords> scaleRecords;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListAutoScalingRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutoScalingRecordsResponseBodyData self = new ListAutoScalingRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutoScalingRecordsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListAutoScalingRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAutoScalingRecordsResponseBodyData setScaleRecords(java.util.List<ListAutoScalingRecordsResponseBodyDataScaleRecords> scaleRecords) {
            this.scaleRecords = scaleRecords;
            return this;
        }
        public java.util.List<ListAutoScalingRecordsResponseBodyDataScaleRecords> getScaleRecords() {
            return this.scaleRecords;
        }

        public ListAutoScalingRecordsResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListAutoScalingRecordsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}

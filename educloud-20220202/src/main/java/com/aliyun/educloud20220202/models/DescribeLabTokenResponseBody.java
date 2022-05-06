// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class DescribeLabTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeLabTokenResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLabTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabTokenResponseBody self = new DescribeLabTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLabTokenResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeLabTokenResponseBody setData(DescribeLabTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLabTokenResponseBodyData getData() {
        return this.data;
    }

    public DescribeLabTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLabTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLabTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLabTokenResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishStatus")
        public Long finishStatus;

        @NameInMap("LabId")
        public String labId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("ResourceActualReleaseTime")
        public String resourceActualReleaseTime;

        @NameInMap("ResourcePlanedReleaseTime")
        public String resourcePlanedReleaseTime;

        @NameInMap("ResourceStatus")
        public Long resourceStatus;

        @NameInMap("Url")
        public String url;

        public static DescribeLabTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLabTokenResponseBodyData self = new DescribeLabTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLabTokenResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLabTokenResponseBodyData setFinishStatus(Long finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public Long getFinishStatus() {
            return this.finishStatus;
        }

        public DescribeLabTokenResponseBodyData setLabId(String labId) {
            this.labId = labId;
            return this;
        }
        public String getLabId() {
            return this.labId;
        }

        public DescribeLabTokenResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public DescribeLabTokenResponseBodyData setResourceActualReleaseTime(String resourceActualReleaseTime) {
            this.resourceActualReleaseTime = resourceActualReleaseTime;
            return this;
        }
        public String getResourceActualReleaseTime() {
            return this.resourceActualReleaseTime;
        }

        public DescribeLabTokenResponseBodyData setResourcePlanedReleaseTime(String resourcePlanedReleaseTime) {
            this.resourcePlanedReleaseTime = resourcePlanedReleaseTime;
            return this;
        }
        public String getResourcePlanedReleaseTime() {
            return this.resourcePlanedReleaseTime;
        }

        public DescribeLabTokenResponseBodyData setResourceStatus(Long resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public Long getResourceStatus() {
            return this.resourceStatus;
        }

        public DescribeLabTokenResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
